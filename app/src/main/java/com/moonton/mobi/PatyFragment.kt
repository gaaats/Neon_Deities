package com.moonton.mobi

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.appsflyer.AppsFlyerLib
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class PatyFragment : Fragment() {
    private lateinit var gthyhyyhhyy: Context
    val vfederfrfrf: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gthyhyyhhyy = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_paty, container, false)
    }

    override fun onStart() {
        super.onStart()
        val vffrtggt = vfederfrfrf.getString("country", null)
        val thgyhujuj = vfederfrfrf.getString("appCamp", null)
        val hyjukiki = vfederfrfrf.getString("deepSt", null)
        val nhnujukiki = vfederfrfrf.getString("countryDev", null)
        val nhjukiklolo = vfederfrfrf.getString("apps", null)
        val bgnjujkiik = vfederfrfrf.getString("wv", null)
        val nhjukiik = vfederfrfrf.getString("mainId", null)
        val dcdcfvf = "com.moonton.mobi"
        val cdrfggtg = Build.VERSION.RELEASE
        val vfthyhyhy = MyTracker.getTrackerParams()
        vfthyhyhy.customUserId = nhjukiik
        val bgyhyhyhy: String? = vfederfrfrf.getString("instId", null)

        val bhujukiikik = Intent(gthyhyyhhyy, VebvebvebvebActivity2::class.java)
        val vfgtgthyhjujuuj = Intent(gthyhyyhhyy, GamegamegameActivity2::class.java)

        val bghyujuj = "deviceID="
        val yjujjuuki = "sub_id_1="
        val bghyjujuj = "ad_id="
        val bhuyjkiklo = "sub_id_4="
        val bgbhnjujuuj = "sub_id_5="
        val bgnujukikiki = "sub_id_6="
        val vghyjujuuj = "naming"
        val bgbhyjujuju = "deeporg"

        val gbyhyjujuuj = AppsFlyerLib.getInstance().getAppsFlyerUID(gthyhyyhhyy)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        hyjujuujuj(nhjukiik.toString())

        Log.d("lolo", "${nhnujukiki}")
        Log.d("lolo", "${vffrtggt}")


        val gthhyhyjuujuj =
            "$bgnjujkiik$yjujjuuki$thgyhujuj&$bghyujuj$gbyhyjujuuj&$bghyjujuj$nhjukiik&$bhuyjkiklo$dcdcfvf&$bgbhnjujuuj$cdrfggtg&$bgnujukikiki$vghyjujuuj"
        val gthyhy6h22 = "$bgnjujkiik$bghyujuj$nhjukiik&$bghyjujuj$bgyhyhyhy&$bhuyjkiklo$dcdcfvf&$bgbhnjujuuj$cdrfggtg&$bgnujukikiki$vghyjujuuj"
        val hgyhu2j62uuj559uj =
            "$bgnjujkiik$yjujjuuki$hyjukiki&$bghyujuj$gbyhyjujuuj&$bghyjujuj$nhjukiik&$bhuyjkiklo$dcdcfvf&$bgbhnjujuuj$cdrfggtg&$bgnujukikiki$bgbhyjujuju"
        val yh2uj2u2j5u9j =
            "$bgnjujkiik$yjujjuuki$hyjukiki&$bghyujuj$nhjukiik&$bghyjujuj$bgyhyhyhy&$bhuyjkiklo$dcdcfvf&$bgbhnjujuuj$cdrfggtg&$bgnujukikiki$bgbhyjujuju"

        Log.d("lolo", nhjukiik.toString())
        when (nhjukiklolo) {
            "1" ->
                if (thgyhujuj != "null") {
                    vfederfrfrf.edit().putString("link", gthhyhyjuujuj).apply()
                    forgjjigtijgtjtgjgtj(bhujukiikik)
                    activity?.finish()
                } else if (hyjukiki != null || nhnujukiki!!.contains(vffrtggt.toString())) {
                    vfederfrfrf.edit().putString("link", hgyhu2j62uuj559uj).apply()
                    forgjjigtijgtjtgjgtj(bhujukiikik)
                    activity?.finish()
                } else {
                    forgjjigtijgtjtgjgtj(vfgtgthyhjujuuj)
                    activity?.finish()
                }
            "0" ->
                if (hyjukiki != null) {
                    vfederfrfrf.edit().putString("link", yh2uj2u2j5u9j).apply()
                    forgjjigtijgtjtgjgtj(bhujukiikik)
                    activity?.finish()
                } else if (nhnujukiki!!.contains(vffrtggt.toString())) {
                    vfederfrfrf.edit().putString("link", gthyhy6h22).apply()
                    forgjjigtijgtjtgjgtj(bhujukiikik)
                    activity?.finish()
                } else {
                    forgjjigtijgtjtgjgtj(vfgtgthyhjujuuj)
                    activity?.finish()
                }
        }
    }

    private fun forgjjigtijgtjtgjgtj(vfgtgthyhjujuuj: Intent) {
        startActivity(vfgtgthyhjujuuj)
    }

    private fun hyjujuujuj(hgythyhyhy: String) {
        OneSignal.setExternalUserId(
            hgythyhyhy,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {

                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val frgthyhyyh = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $frgthyhyyh"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val gthgyhyhjuuj =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $gthgyhyhjuuj"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val gthyjujujuuj = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $gthyjujujuuj"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {

                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

}