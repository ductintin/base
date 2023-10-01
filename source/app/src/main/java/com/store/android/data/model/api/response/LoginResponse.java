package com.store.android.data.model.api.response;

import java.util.Date;

import lombok.Data;

@Data
public class LoginResponse{
//    @SerializedName("access_token")
//    private String accessToken;

    private Date expired;
    private String fullName;
    private int id;
    private int kind;
    private String token;
    private String username;

}
