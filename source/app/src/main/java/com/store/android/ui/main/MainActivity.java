package com.store.android.ui.main;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.store.android.BR;
import com.store.android.R;
import com.store.android.databinding.ActivityMainBinding;
import com.store.android.di.component.ActivityComponent;
import com.store.android.ui.base.activity.BaseActivity;


public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // lay ssid tu share ref
        super.onCreate(savedInstanceState);
        viewBinding.setA(this);
        viewBinding.setVm(viewModel);


    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public int getBindingVariable() {
        return BR.vm;
    }

    @Override
    public void performDependencyInjection(ActivityComponent buildComponent) {
        buildComponent.inject(this);
    }
}
