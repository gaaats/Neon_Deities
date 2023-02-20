package com.moonton.mobi.devgfvrvgrfrf

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.moonton.mobi.bgnfreddeeded.FHrhrfuhhhurf
import com.moonton.mobi.bgnfreddeeded.NFjrjfrhufr
import com.moonton.mobi.bgnfreddeeded.NJfrrfjrjirf
import com.moonton.mobi.ghitgugtgt.JIJDuihfuhrf
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HUfhfrhuhrfhuhrf(
    private val hkhyhykhyhykkhy: NFjrjfrhufr,
    private val tjohjhyjohyjihyjihy: FHrhrfuhhhurf,
    private val fgrrhgtugtuugthgt: SharedPreferences,
    val gfjogtjogtjiogtjitg: Application
) : ViewModel() {

    private val gtjiogtjitgji = MutableLiveData<NJfrrfjrjirf>()
    val gtjiojgtjijigtj: LiveData<NJfrrfjrjirf>
        get() = gtjiogtjitgji

    private val gtjiogtjigtji = MutableLiveData<JIJDuihfuhrf>()
    val gtjioojhyjjhyjhy: LiveData<JIJDuihfuhrf>
        get() = gtjiogtjigtji


    private val hjiohgijohyji = MutableLiveData<String>()
    val gtjihyjihyjihyji: LiveData<String>
        get() = hjiohgijohyji

    private val gtntgnjgtnj = MutableLiveData<String>()
    val gtnhyjhyhyjhy: LiveData<String>
        get() = gtntgnjgtnj


    private val deftedtfed = MutableLiveData<String?>()
    val hykhykhyhyiohy: LiveData<String?>
        get() = deftedtfed


    init {
        viewModelScope.launch(Dispatchers.IO) {
            goijrojijdfejfrjfr()
        }
        viewModelScope.launch(Dispatchers.Main) {
            ehfrfgyrfgryfrf()
        }
    }

    suspend fun ehfrfgyrfgryfrf() {
        gtjiogtjitgji.postValue(hkhyhykhyhykkhy.bghyhyujuj().body())
        gtnhyhyjhyjhyi()
    }

    suspend fun gtnhyhyjhyjhyi() {
        try {
            gtjiogtjigtji.postValue(tjohjhyjohyjihyjihy.bgnhujujuj().body())
        } catch (e: java.lang.Exception) {
            Log.d("ESCESC", e.toString())
        }
    }

    fun hgkhyihyjiohyjoihy(cont: Context) {
        AppsFlyerLib.getInstance()
            .init("oxv7jwGmU98dywmSAEeqU9", gnhynkhynhykhy, gfjogtjogtjiogtjitg)
        AppsFlyerLib.getInstance().start(cont)
    }

    fun gnbgtgtuhgthugt(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val deepData = data.targetUri?.host.toString()
                fgrrhgtugtuugthgt.edit().putString("deepSt", deepData).apply()
            }
        }
    }

    private val gnhynkhynhykhy = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            hjiohgijohyji.postValue(dataGotten)
        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun goijrojijdfejfrjfr() {
        val hyujujujikikik = AdvertisingIdClient(gfjogtjogtjiogtjitg)
        hyujujujikikik.start()
        val frgtghyhyujujujuj = hyujujujikikik.info.id.toString()
        deftedtfed.postValue(frgtghyhyujujujuj)
    }

}