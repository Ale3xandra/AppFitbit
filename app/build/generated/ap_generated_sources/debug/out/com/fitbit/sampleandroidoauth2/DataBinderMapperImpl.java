package com.fitbit.sampleandroidoauth2;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.fitbit.sampleandroidoauth2.databinding.ActivityRootBindingImpl;
import com.fitbit.sampleandroidoauth2.databinding.ActivityUserDataBindingImpl;
import com.fitbit.sampleandroidoauth2.databinding.LayoutInfoBindingImpl;
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
  private static final int LAYOUT_ACTIVITYROOT = 1;

  private static final int LAYOUT_ACTIVITYUSERDATA = 2;

  private static final int LAYOUT_LAYOUTINFO = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fitbit.sampleandroidoauth2.R.layout.activity_root, LAYOUT_ACTIVITYROOT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fitbit.sampleandroidoauth2.R.layout.activity_user_data, LAYOUT_ACTIVITYUSERDATA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.fitbit.sampleandroidoauth2.R.layout.layout_info, LAYOUT_LAYOUTINFO);
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
        case  LAYOUT_ACTIVITYROOT: {
          if ("layout/activity_root_0".equals(tag)) {
            return new ActivityRootBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_root is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYUSERDATA: {
          if ("layout/activity_user_data_0".equals(tag)) {
            return new ActivityUserDataBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_user_data is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTINFO: {
          if ("layout/layout_info_0".equals(tag)) {
            return new LayoutInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_info is invalid. Received: " + tag);
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
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(3);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.fitbit.fitbitapi.DataBinderMapperImpl());
    result.add(new com.fitbit.fitbitauth.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "loading");
      sKeys.put(2, "scopesGranted");
      sKeys.put(3, "titleText");
      sKeys.put(4, "user");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_root_0", com.fitbit.sampleandroidoauth2.R.layout.activity_root);
      sKeys.put("layout/activity_user_data_0", com.fitbit.sampleandroidoauth2.R.layout.activity_user_data);
      sKeys.put("layout/layout_info_0", com.fitbit.sampleandroidoauth2.R.layout.layout_info);
    }
  }
}
