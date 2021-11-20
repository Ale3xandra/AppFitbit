package com.fitbit.sampleandroidoauth2.databinding;
import com.fitbit.sampleandroidoauth2.R;
import com.fitbit.sampleandroidoauth2.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutInfoBindingImpl extends LayoutInfoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.webview, 4);
        sViewsWithIds.put(R.id.graph, 5);
        sViewsWithIds.put(R.id.progressBar, 6);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.RelativeLayout mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutInfoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private LayoutInfoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.jjoe64.graphview.GraphView) bindings[5]
            , (android.widget.ProgressBar) bindings[6]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[1]
            , (android.webkit.WebView) bindings[4]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.RelativeLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.swipeRefreshLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.loading == variableId) {
            setLoading((boolean) variable);
        }
        else if (BR.titleText == variableId) {
            setTitleText((int) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoading(boolean Loading) {
        this.mLoading = Loading;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.loading);
        super.requestRebind();
    }
    public void setTitleText(int TitleText) {
        this.mTitleText = TitleText;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.titleText);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        boolean loading = mLoading;
        int loadingViewGONEViewVISIBLE = 0;
        int titleText = mTitleText;
        int loadingViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x5L) != 0) {

            if((dirtyFlags & 0x5L) != 0) {
                if(loading) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read loading ? View.GONE : View.VISIBLE
                loadingViewGONEViewVISIBLE = ((loading) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read loading ? View.VISIBLE : View.GONE
                loadingViewVISIBLEViewGONE = ((loading) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView2.setText(titleText);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(loadingViewVISIBLEViewGONE);
            this.swipeRefreshLayout.setVisibility(loadingViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loading
        flag 1 (0x2L): titleText
        flag 2 (0x3L): null
        flag 3 (0x4L): loading ? View.GONE : View.VISIBLE
        flag 4 (0x5L): loading ? View.GONE : View.VISIBLE
        flag 5 (0x6L): loading ? View.VISIBLE : View.GONE
        flag 6 (0x7L): loading ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}