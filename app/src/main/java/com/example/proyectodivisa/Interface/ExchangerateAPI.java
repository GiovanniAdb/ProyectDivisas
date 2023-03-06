package com.example.proyectodivisa.Interface;

import com.example.proyectodivisa.Model.Posts;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ExchangerateAPI {
    @GET("v6/e32cb721cc907a651ae251e8/latest/USD")
    Call<Posts> getPosts();
}
