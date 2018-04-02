package com.example.jorge.proyectomovil.retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Jorge on 31/03/2018.
 */

public class RetroClient {
    private static final String ROOT_URL = "https://github.com/lsv/fifa-worldcup-2018/blob/master/data.json/";

    private static Retrofit getRetrofitInstance(){
        return new Retrofit.Builder().baseUrl(ROOT_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }

    public static ApiService getApiService(){
        return getRetrofitInstance().create(ApiService.class);

    }
}

