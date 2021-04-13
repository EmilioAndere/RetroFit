package com.upt.retrofit;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIservice {

    @POST("/url")
    @FormUrlEncoded
    Call<Post> savePost(@Field("nombre") String name, @Field("apellido") String last_name);
}
