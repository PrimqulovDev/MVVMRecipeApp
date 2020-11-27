package com.codingwithmitch.mvvmrecipeapp.network

import com.codingwithmitch.mvvmrecipeapp.network.response.RecipeGetResponse
import com.codingwithmitch.mvvmrecipeapp.network.response.RecipeSearchResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface RecipeService {

    @GET("search")
    suspend fun search(
            @Header("Authorization") token: String,
            @Query("page") page: String,
            @Query("query") query: String
    ): RecipeSearchResponse

    @GET("get")
    suspend fun get(
            @Header("Authorization") token: String,
            @Query("id") id: Int
    ): RecipeGetResponse
}