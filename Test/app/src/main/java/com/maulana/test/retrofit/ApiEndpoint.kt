package com.maulana.test.retrofit

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import java.util.*


interface ApiEndpoint {
    @POST("/auth-controller/registerUsingPOST")
    @FormUrlEncoded
    fun savePost(

        @Field("email") email: String?,
        @Field("password") password: String?,
        @Field("username") username: String?
    ): Observable<POST?>?
}