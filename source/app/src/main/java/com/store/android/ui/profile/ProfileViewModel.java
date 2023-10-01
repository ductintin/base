package com.store.android.ui.profile;

import androidx.databinding.ObservableField;

import com.store.android.MVVMApplication;
import com.store.android.R;
import com.store.android.data.Repository;
import com.store.android.ui.base.activity.BaseViewModel;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class ProfileViewModel extends BaseViewModel {

    public ObservableField<String> image = new ObservableField<>("customerdemo");
    public ObservableField<String> fullName = new ObservableField<>("123456");
    public ObservableField<String> phone = new ObservableField<>("123456");

    public ProfileViewModel(Repository repository, MVVMApplication application) {
        super(repository, application);
        getProfile();
    }


    public void getProfile(){
        // check
        showLoading();
        compositeDisposable.add(repository.getApiService().getProfile()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(data -> {
                    fullName.set(data.getData().getFullName());
                    phone.set(data.getData().getPhone());
                    image.set(data.getData().getAvatar());
                    hideLoading();
                }, err -> {
                    hideLoading();
                    showErrorMessage(application.getString(R.string.wrong_user_pass));
                }));

    }
}
