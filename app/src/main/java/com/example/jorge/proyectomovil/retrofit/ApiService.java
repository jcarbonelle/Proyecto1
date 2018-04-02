package com.example.jorge.proyectomovil.retrofit;

import com.example.jorge.proyectomovil.model.Groups;
import com.example.jorge.proyectomovil.model.JSonData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Jorge on 31/03/2018.
 */

public interface ApiService {
    @GET("groups")
    Call<Groups> getMyJSonData();
}
