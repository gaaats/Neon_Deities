package com.moonton.mobi

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.mvffg.btwolib.BTwoLib
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named

class VebvebvebvebActivity2 : AppCompatActivity() {

    private fun gtyhjukkiikik(): String {
        val ferftrgthyhhy = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val sdevfvfvf = hyhyhyhyhyjuuj.getString("link", null)

        Log.d("lolo", "${sdevfvfvf}")
        Toast.makeText(this, "${sdevfvfvf}", Toast.LENGTH_SHORT).show()

        ferftrgthyhhy.edit().putString("SAVED_URL", sdevfvfvf).apply()
        return ferftrgthyhhy.getString("SAVED_URL", sdevfvfvf).toString()
    }

    lateinit var gtyhhyhy: BTwoLib
    val hyhyhyhyhyjuuj: SharedPreferences by inject(named("SharedPreferences"))


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gtyhhyhy = BTwoLib(this@VebvebvebvebActivity2)
        setContentView(gtyhhyhy)
        gtyhhyhy.profiter(gtyhjukkiikik())
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            gtyhhyhy.onActivityResult(requestCode, resultCode, data)
        }
    }

    override fun onBackPressed() {
        if (!gtyhhyhy.onBackPressed()) {
            return
        }
        super.onBackPressed()
    }


}