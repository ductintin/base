package com.store.android.data.remote;

import com.store.android.data.model.api.ResponseWrapper;
import com.store.android.data.model.api.request.LoginRequest;
import com.store.android.data.model.api.response.LoginResponse;
import com.store.android.data.model.api.response.ProfileResponse;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiService {
//    @POST("/api/token")
//    Observable<LoginResponse> login(@Body LoginRequest request);

    @POST("/v1/login")
    Observable<ResponseWrapper<LoginResponse>> login(@Body LoginRequest request);

    @GET("/v1/account/profile")
    Observable<ResponseWrapper<ProfileResponse>> getProfile();
}
