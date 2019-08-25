package com.example.task.API;

import com.example.task.Model.LoginResponse;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;
import retrofit2.http.Query;


public interface Services {

    @POST("LoginUser")
    Call<LoginResponse> getAccess(@Query("login") String login,
                                  @Query("password") String password);


}
