package com.example.retrofit.Interface;

import android.graphics.ColorSpace;

import com.example.retrofit.Model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Posts>> getPosts();
}
