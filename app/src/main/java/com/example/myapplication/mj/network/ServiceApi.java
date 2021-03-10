package com.example.myapplication.mj.network;

import com.example.myapplication.mj.data.JoinData;
import com.example.myapplication.mj.data.JoinResponse;
import com.example.myapplication.mj.data.LoginData;
import com.example.myapplication.mj.data.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ServiceApi {
    @POST("/user/login")
    Call<LoginResponse> userLogin(@Body LoginData data);

    @POST("/user/join")
    Call<JoinResponse> userJoin(@Body JoinData data);
}