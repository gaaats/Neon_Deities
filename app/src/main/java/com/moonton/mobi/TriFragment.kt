package com.moonton.mobi

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.moonton.mobi.devgfvrvgrfrf.HUfhfrhuhrfhuhrf
import com.mvffg.btwolib.decrypt
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec


class TriFragment : Fragment() {

    val gthyhyhy: SharedPreferences by inject(named("SharedPreferences"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_tri, container, false)
    }

    val gthyhhyjuuj by activityViewModel<HUfhfrhuhrfhuhrf>(named("MainModel"))
    lateinit var bgnhhyhy: String
    lateinit var njuujkiik: String
    lateinit var hyjukiikiki: String
    private lateinit var frgttgtggt: Context
    val hyjujkiikki = "AES/CBC/PKCS5Padding"
    val nhjuujujju = SecretKeySpec("4t7w!z%C*F-JaNdRgUkXn2r5u8x/A?D(".toByteArray(), "AES")
    val vfgtggtgt = IvParameterSpec(ByteArray(16))


    override fun onAttach(context: Context) {
        super.onAttach(context)
        frgttgtggt = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gtjgtgtjjgtgtijgt()

        gtntgjgtnngtjnjgt()

    }

    private fun gtntgjgtnngtjnjgt() {
        gthyhhyjuuj.gtjioojhyjjhyjhy.observe(viewLifecycleOwner) {
            if (it != null) {
                bgnhhyhy = it.gioto
                hyjukiikiki = it.nimerito
                njuujkiik = it.linkito
                val gthyyhhyhy = decrypt(hyjujkiikki, bgnhhyhy, nhjuujujju, vfgtggtgt)
                val gyjhujukik = decrypt(hyjujkiikki, njuujkiik, nhjuujujju, vfgtggtgt)

                gthyhyhy.edit().putString("countryDev", gthyyhhyhy).apply()
                gthyhyhy.edit().putString("apps", hyjukiikiki).apply()
                gthyhyhy.edit().putString("wv", gyjhujukik).apply()

                gtjigtjgtjijitgt()
            }
        }
    }

    private fun gtjigtjgtjijitgt() {
        findNavController().navigate(R.id.action_triFragment_to_choturyFragment)
    }

    private fun gtjgtgtjjgtgtijgt() {
        gthyhhyjuuj.hykhykhyhyiohy.observe(viewLifecycleOwner) {
            if (it != null) {
                val gtjgjgttgjigt = it.toString()
                gthyhyhy.edit().putString("mainId", gtjgjgttgjigt).apply()
            }
        }
    }

    override fun onStart() {
        super.onStart()

    }
}