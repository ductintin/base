package com.store.android.data.remote;

import com.store.android.data.model.api.request.LoginRequest;
import com.store.android.data.model.api.response.LoginResponse;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/api/token")
    Observable<LoginResponse> login(@Body LoginRequest request);
}
