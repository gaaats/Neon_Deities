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
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class DvaFragment : Fragment() {


    lateinit var defrgttggthyhy: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dva, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        gyhyhyhyuyh = context
    }

    private lateinit var gyhyhyhyuyh: Context
    val hhujkiolol: SharedPreferences by inject(named("SharedPreferences"))
    val vffrgttgtggt by activityViewModel<HUfhfrhuhrfhuhrf>(named("MainModel"))

    override fun onStart() {
        super.onStart()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gtjoitgojtgjiogtjijgt()

    }

    private fun gtjoitgojtgjiogtjijgt() {
        vffrgttgtggt.gtjiojgtjijigtj.observe(viewLifecycleOwner) {
            if (it != null) {
                defrgttggthyhy = it.cou
                hhujkiolol.edit().putString("country", defrgttggthyhy).apply()
                gjgtijgtjtgjiotg()
            }
        }
    }

    private fun gjgtijgtjtgjiotg() {
        gtjgtjotjogtjitgjijtgjgtgtgt()
    }

    private fun gtjgtjotjogtjitgjijtgjgtgtgt() {
        findNavController().navigate(R.id.action_dvaFragment_to_triFragment)
    }
}