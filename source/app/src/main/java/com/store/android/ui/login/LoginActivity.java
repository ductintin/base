package com.store.android.ui.login;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.store.android.R;
import com.store.android.databinding.ActivityLoginBinding;
import com.store.android.di.component.ActivityComponent;
import com.store.android.ui.base.activity.BaseActivity;

import eu.davidea.flexibleadapter.databinding.BR;

public class LoginActivity extends BaseActivity<ActivityLoginBinding, LoginViewModel> {
    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public int getBindingVariable() {
        return BR.vm;
    }

    @Override
    public void performDependencyInjection(ActivityComponent buildComponent) {
        buildComponent.inject(this);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}