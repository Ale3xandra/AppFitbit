package com.fitbit.sampleandroidoauth2.databinding;
import com.fitbit.sampleandroidoauth2.R;
import com.fitbit.sampleandroidoauth2.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityUserDataBindingImpl extends ActivityUserDataBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.viewPager, 3);
        sViewsWithIds.put(R.id.logout_button, 4);
        sViewsWithIds.put(R.id.progressBar, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.RelativeLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityUserDataBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityUserDataBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[4]
            , (android.widget.ProgressBar) bindings[5]
            , (androidx.viewpager.widget.ViewPager) bindings[3]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.RelativeLayout) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.loading == variableId) {
            setLoading((java.lang.Boolean) variable);
        }
        else if (BR.user == variableId) {
            setUser((com.fitbit.api.models.User) variable);
        }
        else if (BR.scopesGranted == variableId) {
            setScopesGranted((java.lang.String) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoading(@Nullable java.lang.Boolean Loading) {
        this.mLoading = Loading;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.loading);
        super.requestRebind();
    }
    public void setUser(@Nullable com.fitbit.api.models.User User) {
        this.mUser = User;
    }
    public void setScopesGranted(@Nullable java.lang.String ScopesGranted) {
        this.mScopesGranted = ScopesGranted;
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
        java.lang.Boolean loading = mLoading;
        int loadingViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxLoading = false;
        int loadingViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x9L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(loading)
                androidxDatabindingViewDataBindingSafeUnboxLoading = androidx.databinding.ViewDataBinding.safeUnbox(loading);
            if((dirtyFlags & 0x9L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxLoading) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(loading) ? View.GONE : View.VISIBLE
                loadingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxLoading) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(loading) ? View.VISIBLE : View.GONE
                loadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxLoading) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(loadingViewGONEViewVISIBLE);
            this.mboundView2.setVisibility(loadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): loading
        flag 1 (0x2L): user
        flag 2 (0x3L): scopesGranted
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(loading) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(loading) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(loading) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(loading) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}