package com.example.prem.job.DataManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by Prem on 5/13/2018.
 */

public interface ApiInterface {

           @POST("contact.php")//this os a interface where we create base to hit url
           @FormUrlEncoded
           Call<String> getStringScaler(@Field("fullname") String name, @Field("email") String email,
                                        @Field("contact_no") String contact_no, @Field("msg") String msg);
}


