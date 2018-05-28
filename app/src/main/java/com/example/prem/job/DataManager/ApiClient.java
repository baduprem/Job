package com.example.prem.job.DataManager;

import android.widget.EditText;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Prem on 5/13/2018.
 */

public class ApiClient {

    public static final String BASE_URL ="http://192.168.10.5/JobApi/";
    private static Retrofit retrofit = null;


    public static Retrofit getClient()
    {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}

