package com.alaa.currencyconverter.currency_conversion.databinding;
import com.alaa.currencyconverter.currency_conversion.R;
import com.alaa.currencyconverter.currency_conversion.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutMainAmountsBindingImpl extends LayoutMainAmountsBinding implements com.alaa.currencyconverter.currency_conversion.generated.callback.AfterTextChanged.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etAmountsFromandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of conversionViewModel.fromAmount.getValue()
            //         is conversionViewModel.fromAmount.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etAmountsFrom);
            // localize variables for thread safety
            // conversionViewModel
            com.alaa.currencyconverter.currency_conversion.ui.ConversionViewModel conversionViewModel = mConversionViewModel;
            // conversionViewModel.fromAmount.getValue()
            java.lang.String conversionViewModelFromAmountGetValue = null;
            // conversionViewModel.fromAmount != null
            boolean conversionViewModelFromAmountJavaLangObjectNull = false;
            // conversionViewModel.fromAmount
            kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> conversionViewModelFromAmount = null;
            // conversionViewModel != null
            boolean conversionViewModelJavaLangObjectNull = false;



            conversionViewModelJavaLangObjectNull = (conversionViewModel) != (null);
            if (conversionViewModelJavaLangObjectNull) {


                conversionViewModelFromAmount = conversionViewModel.getFromAmount();

                conversionViewModelFromAmountJavaLangObjectNull = (conversionViewModelFromAmount) != (null);
                if (conversionViewModelFromAmountJavaLangObjectNull) {




                    conversionViewModelFromAmount.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public LayoutMainAmountsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private LayoutMainAmountsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.EditText) bindings[1]
            , (android.widget.EditText) bindings[2]
            );
        this.etAmountsFrom.setTag(null);
        this.etAmountsTo.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.alaa.currencyconverter.currency_conversion.generated.callback.AfterTextChanged(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.conversionViewModel == variableId) {
            setConversionViewModel((com.alaa.currencyconverter.currency_conversion.ui.ConversionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setConversionViewModel(@Nullable com.alaa.currencyconverter.currency_conversion.ui.ConversionViewModel ConversionViewModel) {
        this.mConversionViewModel = ConversionViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.conversionViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeConversionViewModelToAmount((kotlinx.coroutines.flow.MutableStateFlow<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeConversionViewModelFromAmount((kotlinx.coroutines.flow.MutableStateFlow<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeConversionViewModelToAmount(kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> ConversionViewModelToAmount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConversionViewModelFromAmount(kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> ConversionViewModelFromAmount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.alaa.currencyconverter.currency_conversion.ui.ConversionViewModel conversionViewModel = mConversionViewModel;
        java.lang.String conversionViewModelFromAmountGetValue = null;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> conversionViewModelToAmount = null;
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> conversionViewModelFromAmount = null;
        java.lang.String conversionViewModelToAmountGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (conversionViewModel != null) {
                        // read conversionViewModel.toAmount
                        conversionViewModelToAmount = conversionViewModel.getToAmount();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 0, conversionViewModelToAmount);


                    if (conversionViewModelToAmount != null) {
                        // read conversionViewModel.toAmount.getValue()
                        conversionViewModelToAmountGetValue = conversionViewModelToAmount.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (conversionViewModel != null) {
                        // read conversionViewModel.fromAmount
                        conversionViewModelFromAmount = conversionViewModel.getFromAmount();
                    }
                    androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 1, conversionViewModelFromAmount);


                    if (conversionViewModelFromAmount != null) {
                        // read conversionViewModel.fromAmount.getValue()
                        conversionViewModelFromAmountGetValue = conversionViewModelFromAmount.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etAmountsFrom, conversionViewModelFromAmountGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etAmountsFrom, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback4, etAmountsFromandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etAmountsTo, conversionViewModelToAmountGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackAfterTextChanged(int sourceId , android.text.Editable callbackArg_0) {
        // localize variables for thread safety
        // conversionViewModel
        com.alaa.currencyconverter.currency_conversion.ui.ConversionViewModel conversionViewModel = mConversionViewModel;
        // conversionViewModel != null
        boolean conversionViewModelJavaLangObjectNull = false;



        conversionViewModelJavaLangObjectNull = (conversionViewModel) != (null);
        if (conversionViewModelJavaLangObjectNull) {


            conversionViewModel.calculateCurrency();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): conversionViewModel.toAmount
        flag 1 (0x2L): conversionViewModel.fromAmount
        flag 2 (0x3L): conversionViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}