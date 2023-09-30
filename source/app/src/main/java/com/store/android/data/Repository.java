package com.store.android.data;

import com.store.android.data.local.prefs.PreferencesService;
import com.store.android.data.local.room.RoomService;
import com.store.android.data.remote.ApiService;


public interface Repository {

    /**
     * ################################## Preference section ##################################
     */
    String getToken();

    void setToken(String token);

    PreferencesService getSharedPreferences();


    /**
     * ################################## Remote api ##################################
     */
    ApiService getApiService();

    RoomService getRoomService();

}
