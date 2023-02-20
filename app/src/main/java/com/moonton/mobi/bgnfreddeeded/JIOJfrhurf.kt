package com.moonton.mobi.bgnfreddeeded

import androidx.annotation.Keep
import com.moonton.mobi.fbfrhbrfbgtgt.JIFijrfji
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import retrofit2.Response
import retrofit2.http.GET


interface JIFJojrijrfjf {
    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun hyujujujki(): Response<NJfrrfjrjirf>
}

class FHrhrfuhhhurf(private val gthyhyjuuj: JIFijrfji) {
    suspend fun bgnhujujuj() = gthyhyjuuj.hyhyujujuj()
}


class NFjrjfrhufr(private val ghhjyuujuju: JIFJojrijrfjf) {
    suspend fun bghyhyujuj() = ghhjyuujuju.hyujujujki()
}


@Keep
data class NJfrrfjrjirf(
    @JsonClass(generateAdapter = true)
    @field:Json(name = "countryCode")
    val cou: String,
)