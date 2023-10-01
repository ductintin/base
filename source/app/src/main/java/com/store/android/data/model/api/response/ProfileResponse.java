package com.store.android.data.model.api.response;


import java.util.Date;

import lombok.Data;
@Data
public class ProfileResponse {
    private String avatar;
    private String email;
    private String fullName;
    private String phone;
    private String username;

}