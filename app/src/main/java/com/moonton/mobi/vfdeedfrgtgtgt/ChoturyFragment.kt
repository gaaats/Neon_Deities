package com.moonton.mobi.vfdeedfrgtgtgt

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.moonton.mobi.R
import com.moonton.mobi.devgfvrvgrfrf.HUfhfrhuhrfhuhrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class ChoturyFragment : Fragment() {
    val gtnujujju by activityViewModel<HUfhfrhuhrfhuhrf>(named("MainModel"))
    val bgnhnujikikki: SharedPreferences by inject(named("SharedPreferences"))



    override fun onAttach(context: Context) {
        super.onAttach(context)
        bghyjuikkiik = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chotury, container, false)
    }

    lateinit var cdeedrfgthyyh: String
    private lateinit var bghyjuikkiik: Context


    private fun gtjjgttgjgti() {
        gjtijgjtgjigtijitg()
    }

    private fun gjtijgjtgjigtijitg() {
        findNavController().navigate(R.id.action_choturyFragment_to_patyFragment)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bghyjuujuj = bgnhnujikikki.getString("apps", null)
        val bghyujikkiik = bgnhnujikikki.getString("appCamp", null)

        if (bghyjuujuj=="1" && bghyujikkiik == null) {
            gtnujujju.hgkhyihyjiohyjoihy(bghyjuikkiik)
            gtnujujju.gtjihyjihyjihyji.observe(viewLifecycleOwner) {
                if (it != null) {
                    cdeedrfgthyyh = it.toString()
                    bgnhnujikikki.edit().putString("appCamp", cdeedrfgthyyh).apply()
                    gtjjgttgjgti()
                }
            }
        } else {
            gtjjgttgjgti()
        }
    }
}