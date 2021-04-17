package com.example.renting.interfaces;

import com.example.renting.models.LoginResult;
import com.example.renting.models.ProductModel;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitInterface {
    @POST("/login")
    Call<LoginResult> executeLogin (@Body HashMap<String, String> map);

    @POST("/signup")
    Call<Void> executeSignup (@Body HashMap<String, String> map);

    @POST("/add_product")
    Call<Void> executeAddProduct (@Body HashMap<String, String> map);

    @POST("/get_products")
    Call<List<ProductModel>> executeGetProduct (@Body HashMap<String, String> map);
}
