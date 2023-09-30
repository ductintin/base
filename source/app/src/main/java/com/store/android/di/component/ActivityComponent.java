package com.store.android.di.component;

import com.store.android.di.module.ActivityModule;
import com.store.android.di.scope.ActivityScope;
import com.store.android.ui.login.LoginActivity;
import com.store.android.ui.main.MainActivity;

import dagger.Component;

@ActivityScope
@Component(modules = {ActivityModule.class}, dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(MainActivity activity);

    void inject(LoginActivity loginActivity);
}

