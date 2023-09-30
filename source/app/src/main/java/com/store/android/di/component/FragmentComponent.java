package com.store.android.di.component;


import com.store.android.di.module.FragmentModule;
import com.store.android.di.scope.FragmentScope;

import dagger.Component;

@FragmentScope
@Component(modules = {FragmentModule.class}, dependencies = AppComponent.class)
public interface FragmentComponent {

}
