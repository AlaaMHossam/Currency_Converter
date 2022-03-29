package com.alaa.currencyconverter.currency_conversion.ui

import android.graphics.drawable.BitmapDrawable
import android.os.IBinder
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.RatingBar
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.test.espresso.Root
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.platform.app.InstrumentationRegistry
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import java.util.*

object UITestFunctions {

    fun getJson(path: String): String {
        val inputStream = InstrumentationRegistry.getInstrumentation().context.assets.open(path)
        val scanner = Scanner(inputStream).useDelimiter("\\A")
        return if (scanner.hasNext()) scanner.next() else ""
    }

    fun drawableIsCorrect(@DrawableRes drawableResId: Int): Matcher<View> {
        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("with drawable from resource id: ")
                description.appendValue(drawableResId)
            }

            override fun matchesSafely(target: View?): Boolean {
                if (target !is ImageView) return false
                if (drawableResId < 0) return target.drawable == null

                return drawable(target)
            }

            private fun drawable(target: ImageView): Boolean {
                val expectedDrawable =
                    ContextCompat.getDrawable(target.context, drawableResId) ?: return false

                val bitmap = (target.drawable as BitmapDrawable).bitmap
                val otherBitmap = (expectedDrawable as BitmapDrawable).bitmap
                return bitmap.sameAs(otherBitmap)
            }
        }
    }

    class SetRating : ViewAction {
        override fun getConstraints(): Matcher<View> {
            return ViewMatchers.isAssignableFrom(RatingBar::class.java)
        }

        override fun getDescription(): String {
            return "Custom view action to set rating."
        }

        override fun perform(uiController: UiController?, view: View) {
            val ratingBar = view as RatingBar
            ratingBar.rating = 3f
        }
    }

    class ToastMatcher : TypeSafeMatcher<Root?>() {

        override fun describeTo(description: Description?) {
            description?.appendText("is toast")
        }

        override fun matchesSafely(item: Root?): Boolean {
            val type: Int? = item?.windowLayoutParams?.get()?.type
            if (type == WindowManager.LayoutParams.TYPE_TOAST) {
                val windowToken: IBinder = item.decorView.windowToken
                val appToken: IBinder = item.decorView.applicationWindowToken
                // means this window isn't contained by any other windows.
                if (windowToken === appToken) return true
            }
            return false
        }
    }
}