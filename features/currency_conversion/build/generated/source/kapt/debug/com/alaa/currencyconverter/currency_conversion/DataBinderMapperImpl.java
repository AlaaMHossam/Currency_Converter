package com.alaa.currencyconverter.currency_conversion;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.alaa.currencyconverter.currency_conversion.databinding.FragmentCurrencyConversionBindingImpl;
import com.alaa.currencyconverter.currency_conversion.databinding.LayoutMainAmountsBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTCURRENCYCONVERSION = 1;

  private static final int LAYOUT_LAYOUTMAINAMOUNTS = 2;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(2);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alaa.currencyconverter.currency_conversion.R.layout.fragment_currency_conversion, LAYOUT_FRAGMENTCURRENCYCONVERSION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.alaa.currencyconverter.currency_conversion.R.layout.layout_main_amounts, LAYOUT_LAYOUTMAINAMOUNTS);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTCURRENCYCONVERSION: {
          if ("layout/fragment_currency_conversion_0".equals(tag)) {
            return new FragmentCurrencyConversionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_currency_conversion is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTMAINAMOUNTS: {
          if ("layout/layout_main_amounts_0".equals(tag)) {
            return new LayoutMainAmountsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_main_amounts is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.alaa.currencyconverter.core.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "conversionViewModel");
      sKeys.put(2, "fragment");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(2);

    static {
      sKeys.put("layout/fragment_currency_conversion_0", com.alaa.currencyconverter.currency_conversion.R.layout.fragment_currency_conversion);
      sKeys.put("layout/layout_main_amounts_0", com.alaa.currencyconverter.currency_conversion.R.layout.layout_main_amounts);
    }
  }
}
