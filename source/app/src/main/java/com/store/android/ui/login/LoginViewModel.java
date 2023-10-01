package com.store.android.ui.login;

import android.content.Intent;

import androidx.databinding.ObservableField;

import com.store.android.MVVMApplication;
import com.store.android.R;
import com.store.android.data.Repository;
import com.store.android.data.model.api.request.LoginRequest;
import com.store.android.ui.base.activity.BaseViewModel;
import com.store.android.ui.profile.ProfileActivity;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class LoginViewModel extends BaseViewModel {
    public ObservableField<String> username = new ObservableField<>("admin");
    public ObservableField<String> password = new ObservableField<>("admin123456");

    public LoginViewModel(Repository repository, MVVMApplication application) {
        super(repository, application);
    }

    public void login() {
        // check
        if (username.get() == null || username.get().isEmpty() || password.get() == null || password.get().isEmpty()) {
            showErrorMessage(application.getString(R.string.empty_user_pass));
            return;
        }
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setPassword(password.get());
        loginRequest.setUsername(username.get());
        showLoading();
        compositeDisposable.add(repository.getApiService().login(loginRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(data -> {
                    repository.getSharedPreferences().setToken(data.getData().getToken());
                    hideLoading();
                    Intent intent = new Intent(application.getCurrentActivity(), ProfileActivity.class);
                    application.getCurrentActivity().startActivity(intent);
                }, err -> {
                    hideLoading();
                    showErrorMessage(application.getString(R.string.wrong_user_pass));
                }));
    }
}
