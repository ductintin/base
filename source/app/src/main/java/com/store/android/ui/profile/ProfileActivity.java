package com.store.android.ui.profile;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.store.android.BR;
import com.store.android.R;
import com.store.android.databinding.ActivityProfileBinding;
import com.store.android.di.component.ActivityComponent;
import com.store.android.ui.base.activity.BaseActivity;

public class ProfileActivity extends BaseActivity<ActivityProfileBinding, ProfileViewModel> {
    @Override
    public int getLayoutId() {
        return R.layout.activity_profile;
    }

    @Override
    public int getBindingVariable() {
        return BR.pvm;
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
