// Generated by data binding compiler. Do not edit!
package com.fitbit.sampleandroidoauth2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.fitbit.sampleandroidoauth2.R;
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRootBinding extends ViewDataBinding {
  @NonNull
  public final Button loginButton;

  @NonNull
  public final ProgressBar progressBar;

  @Bindable
  protected Boolean mLoading;

  protected ActivityRootBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button loginButton, ProgressBar progressBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.loginButton = loginButton;
    this.progressBar = progressBar;
  }

  public abstract void setLoading(@Nullable Boolean loading);

  @Nullable
  public Boolean getLoading() {
    return mLoading;
  }

  @NonNull
  public static ActivityRootBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_root, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRootBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRootBinding>inflateInternal(inflater, R.layout.activity_root, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRootBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_root, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRootBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRootBinding>inflateInternal(inflater, R.layout.activity_root, null, false, component);
  }

  public static ActivityRootBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityRootBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRootBinding)bind(component, view, R.layout.activity_root);
  }
}
