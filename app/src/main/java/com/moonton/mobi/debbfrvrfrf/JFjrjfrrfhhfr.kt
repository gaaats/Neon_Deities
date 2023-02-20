package com.moonton.mobi.debbfrvrfrf

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.moonton.mobi.bgnfreddeeded.FHrhrfuhhhurf
import com.moonton.mobi.bgnfreddeeded.JIFJojrijrfjf
import com.moonton.mobi.bgnfreddeeded.NFjrjfrhufr
import com.moonton.mobi.devgfvrvgrfrf.HUfhfrhuhrfhuhrf
import com.moonton.mobi.fbfrhbrfbgtgt.JIFijrfji
import com.squareup.moshi.Moshi
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val ghntngtkhy = module {
    single<JIFijrfji>(named("HostInter")) {
        get<Retrofit>(named("RetroDev"))
            .create(JIFijrfji::class.java)
    }

    single <JIFJojrijrfjf> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(JIFJojrijrfjf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    single<Retrofit>(named("RetroDev")) {
        Retrofit.Builder()
            .baseUrl("http://neondeities.fun/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    factory(named("DevRep")) {
        FHrhrfuhhhurf(get(named("HostInter")))
    }
    factory (named("CountryRep")) {
        NFjrjfrhufr(get(named("ApiInter")))
    }

    single {
        hykohyoyhkihy()
    }
    single(named("SharedPreferences")) {
        hgnnhyjhyj(androidApplication())
    }

}
fun hgnnhyjhyj(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun hykohyoyhkihy(): Moshi {
    return Moshi.Builder().build()
}

val gtojijgtjoigt = module {
    viewModel (named("MainModel")){
        HUfhfrhuhrfhuhrf(get(named("CountryRep")), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
}