package com.example.arjun_mu.a2retrofitsendobjects.Service;


import com.example.arjun_mu.a2retrofitsendobjects.Model.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by arjun_mu on 5/2/2017.
 */

public interface UserClient {


    @POST("/new.json")
    Call<User> createAccount(@Body User user);


}
