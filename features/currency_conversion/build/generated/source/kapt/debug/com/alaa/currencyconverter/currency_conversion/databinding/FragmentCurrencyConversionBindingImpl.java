package com.alaa.currencyconverter.currency_conversion.databinding;
import com.alaa.currencyconverter.currency_conversion.R;
import com.alaa.currencyconverter.currency_conversion.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCurrencyConversionBindingImpl extends FragmentCurrencyConversionBinding implements com.alaa.currencyconverter.currency_conversion.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(1, 
            new String[] {"layout_main_amounts"},
            new int[] {5},
            new int[] {com.alaa.currencyconverter.currency_conversion.R.layout.layout_main_amounts});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.gl_main_hor_30, 6);
        sViewsWithIds.put(R.id.til_from_currency, 7);
        sViewsWithIds.put(R.id.actv_from_currency, 8);
        sViewsWithIds.put(R.id.til_to_currency, 9);
        sViewsWithIds.put(R.id.actv_to_currency, 10);
        sViewsWithIds.put(R.id.btn_main_details, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCurrencyConversionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentCurrencyConversionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.textfield.MaterialAutoCompleteTextView) bindings[8]
            , (com.google.android.material.textfield.MaterialAutoCompleteTextView) bindings[10]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (com.alaa.currencyconverter.currency_conversion.databinding.LayoutMainAmountsBinding) bindings[5]
            , (android.widget.ImageButton) bindings[2]
            , (android.widget.ProgressBar) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[9]
            );
        this.btnCurrencyConversionRetry.setTag(null);
        this.clMainData.setTag(null);
        setContainedBinding(this.includedAmounts);
        this.ivToCurrency.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pbMain.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.alaa.currencyconverter.currency_conversion.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.alaa.currencyconverter.currency_conversion.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        includedAmounts.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (includedAmounts.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fragment == variableId) {
            setFragment((com.alaa.currencyconverter.currency_conversion.ui.CurrencyConversionFragment) variable);
        }
        else if (BR.conversionViewModel == variableId) {
            setConversionViewModel((com.alaa.currencyconverter.currency_conversion.ui.ConversionViewModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.alaa.currencyconverter.currency_conversion.ui.CurrencyConverterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFragment(@Nullable com.alaa.currencyconverter.currency_conversion.ui.CurrencyConversionFragment Fragment) {
        this.mFragment = Fragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.fragment);
        super.requestRebind();
    }
    public void setConversionViewModel(@Nullable com.alaa.currencyconverter.currency_conversion.ui.ConversionViewModel ConversionViewModel) {
        this.mConversionViewModel = ConversionViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.conversionViewModel);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.alaa.currencyconverter.currency_conversion.ui.CurrencyConverterViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        includedAmounts.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeIncludedAmounts((com.alaa.currencyconverter.currency_conversion.databinding.LayoutMainAmountsBinding) object, fieldId);
            case 1 :
                return onChangeViewModelViewSate((kotlinx.coroutines.flow.StateFlow<com.alaa.currencyconverter.core.states.ViewState>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeIncludedAmounts(com.alaa.currencyconverter.currency_conversion.databinding.LayoutMainAmountsBinding IncludedAmounts, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelViewSate(kotlinx.coroutines.flow.StateFlow<com.alaa.currencyconverter.core.states.ViewState> ViewModelViewSate, int fieldId) {
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
        com.alaa.currencyconverter.core.states.ViewState viewModelViewSateGetValue = null;
        int viewModelViewSateViewStateSHOWCONTENTViewVISIBLEViewGONE = 0;
        com.alaa.currencyconverter.currency_conversion.ui.CurrencyConversionFragment fragment = mFragment;
        int viewModelViewSateViewStateSHOWERRORViewVISIBLEViewGONE = 0;
        boolean viewModelViewSateViewStateSHOWCONTENT = false;
        int viewModelViewSateViewStateLOADINGViewVISIBLEViewGONE = 0;
        kotlinx.coroutines.flow.StateFlow<com.alaa.currencyconverter.core.states.ViewState> viewModelViewSate = null;
        boolean viewModelViewSateViewStateSHOWERROR = false;
        com.alaa.currencyconverter.currency_conversion.ui.ConversionViewModel conversionViewModel = mConversionViewModel;
        boolean viewModelViewSateViewStateLOADING = false;
        com.alaa.currencyconverter.currency_conversion.ui.CurrencyConverterViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x28L) != 0) {
        }
        if ((dirtyFlags & 0x32L) != 0) {



                if (viewModel != null) {
                    // read viewModel.viewSate
                    viewModelViewSate = viewModel.getViewSate();
                }
                androidx.databinding.ViewDataBindingKtx.updateStateFlowRegistration(this, 1, viewModelViewSate);


                if (viewModelViewSate != null) {
                    // read viewModel.viewSate.getValue()
                    viewModelViewSateGetValue = viewModelViewSate.getValue();
                }


                // read viewModel.viewSate.getValue() == viewState.SHOW_CONTENT
                viewModelViewSateViewStateSHOWCONTENT = (viewModelViewSateGetValue) == (com.alaa.currencyconverter.core.states.ViewState.SHOW_CONTENT);
                // read viewModel.viewSate.getValue() == viewState.SHOW_ERROR
                viewModelViewSateViewStateSHOWERROR = (viewModelViewSateGetValue) == (com.alaa.currencyconverter.core.states.ViewState.SHOW_ERROR);
                // read viewModel.viewSate.getValue() == viewState.LOADING
                viewModelViewSateViewStateLOADING = (viewModelViewSateGetValue) == (com.alaa.currencyconverter.core.states.ViewState.LOADING);
            if((dirtyFlags & 0x32L) != 0) {
                if(viewModelViewSateViewStateSHOWCONTENT) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x32L) != 0) {
                if(viewModelViewSateViewStateSHOWERROR) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x32L) != 0) {
                if(viewModelViewSateViewStateLOADING) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read viewModel.viewSate.getValue() == viewState.SHOW_CONTENT ? View.VISIBLE : View.GONE
                viewModelViewSateViewStateSHOWCONTENTViewVISIBLEViewGONE = ((viewModelViewSateViewStateSHOWCONTENT) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.viewSate.getValue() == viewState.SHOW_ERROR ? View.VISIBLE : View.GONE
                viewModelViewSateViewStateSHOWERRORViewVISIBLEViewGONE = ((viewModelViewSateViewStateSHOWERROR) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.viewSate.getValue() == viewState.LOADING ? View.VISIBLE : View.GONE
                viewModelViewSateViewStateLOADINGViewVISIBLEViewGONE = ((viewModelViewSateViewStateLOADING) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.btnCurrencyConversionRetry.setOnClickListener(mCallback2);
            this.ivToCurrency.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.btnCurrencyConversionRetry.setVisibility(viewModelViewSateViewStateSHOWERRORViewVISIBLEViewGONE);
            this.clMainData.setVisibility(viewModelViewSateViewStateSHOWCONTENTViewVISIBLEViewGONE);
            this.pbMain.setVisibility(viewModelViewSateViewStateLOADINGViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.includedAmounts.setConversionViewModel(conversionViewModel);
        }
        executeBindingsOn(includedAmounts);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.alaa.currencyconverter.currency_conversion.ui.CurrencyConverterViewModel viewModel = mViewModel;
                // viewModel.fetchData()
                kotlinx.coroutines.Job viewModelFetchData = null;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelFetchData = viewModel.fetchData();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // fragment
                com.alaa.currencyconverter.currency_conversion.ui.CurrencyConversionFragment fragment = mFragment;
                // fragment != null
                boolean fragmentJavaLangObjectNull = false;



                fragmentJavaLangObjectNull = (fragment) != (null);
                if (fragmentJavaLangObjectNull) {


                    fragment.invertCurrencies();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): includedAmounts
        flag 1 (0x2L): viewModel.viewSate
        flag 2 (0x3L): fragment
        flag 3 (0x4L): conversionViewModel
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): viewModel.viewSate.getValue() == viewState.SHOW_CONTENT ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.viewSate.getValue() == viewState.SHOW_CONTENT ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.viewSate.getValue() == viewState.SHOW_ERROR ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.viewSate.getValue() == viewState.SHOW_ERROR ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.viewSate.getValue() == viewState.LOADING ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.viewSate.getValue() == viewState.LOADING ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}