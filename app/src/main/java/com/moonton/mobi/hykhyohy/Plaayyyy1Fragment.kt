package com.moonton.mobi.hykhyohy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.moonton.mobi.R
import com.moonton.mobi.databinding.FragmentPlaayyyy1Binding


class Plaayyyy1Fragment : Fragment() {


    private fun jgtiojgtjijiogtgtjigtgt() {
        findNavController().navigate(R.id.action_plaayyyy1Fragment_to_plaaaaayy2Fragment)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        gtgthyhy = FragmentPlaayyyy1Binding.inflate(inflater, container, false)
        return hyjuujujuj.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            frifjrji()

            frorrfjiff()


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun frifjrji() {
        gtjjojtgijgtjgt()
        frrfjifrjiofrjirf()
        jrfiffrhuhrfhurf()
    }

    private fun gtjjojtgijgtjgt() {
        hyjuujujuj.imgGameElem1.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hthy2hy26hy()
        }

    }

    private fun frrfjifrjiofrjirf() {
        hyjuujujuj.imgGameElem3.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hthy2hy26hy()
        }
    }

    private fun jrfiffrhuhrfhurf() {
        hyjuujujuj.imgGameElem4.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hthy2hy26hy()
        }

        hyjuujujuj.imgGameElem6.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hthy2hy26hy()
        }
    }

    private fun frorrfjiff() {
        hyjuujujuj.imgGameElem7.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hthy2hy26hy()
        }

        hyjuujujuj.imgGameElem8.setOnClickListener {
            it.visibility = View.INVISIBLE
            it.isEnabled = false
            hthy2hy26hy()
        }
    }

    private var gtgthyhy: FragmentPlaayyyy1Binding? = null
    private val hyjuujujuj
        get() = gtgthyhy ?: throw RuntimeException("FragmentPlaayyyy1Binding = null")


    private val hyhyhy26hy by lazy {
        listOf(
            hyjuujujuj.imgGameElem1,
            hyjuujujuj.imgGameElem3,
            hyjuujujuj.imgGameElem4,
            hyjuujujuj.imgGameElem6,
            hyjuujujuj.imgGameElem7,
            hyjuujujuj.imgGameElem8,
        )
    }

    private fun hthy2hy26hy() {
        hyhyhy26hy.forEach {
            if (it.visibility == View.VISIBLE) return
        }
        jgtiojgtjijiogtgtjigtgt()
    }


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        gtgthyhy = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            hyjuujujuj.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

}