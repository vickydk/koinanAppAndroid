package com.example.koinan

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitInterface {

    @get:GET("posts")
    val posts : Call<List<PostModel?>?>?

    @get:GET("check")
    val check : Call<List<StartModel?>?>?

    companion object{
        const val BASE_URL = "https://jsonplaceholder.typicode.com"
        const val KOINAN_BASE_URL = "http://127.0.0.1:8090/koinan/"
    }
}