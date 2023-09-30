package com.store.android.ui.base.activity;

public interface BaseCallback {
    void doError(Throwable error);

    void doSuccess();

    void doFail();
}
