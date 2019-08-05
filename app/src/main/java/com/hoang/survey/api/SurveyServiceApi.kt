package com.hoang.survey.api

import io.reactivex.Single
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import retrofit2.http.Url

interface SurveyServiceApi {
    @GET(".")
    fun getAllSurveys(): Single<List<SurveyItemResponse>>

    @GET(".")
    fun getSurveys(@Query("page") page: Int, @Query("per_page") perPage: Int): Single<List<SurveyItemResponse>>

    @POST
    fun refreshToken(@Url refreshTokenUrl: String): Call<JSONObject>
}