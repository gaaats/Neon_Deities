package com.moonton.mobi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.moonton.mobi.databinding.FragmentPlaaaaayy2Binding


class Plaaaaayy2Fragment : Fragment() {

    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        hhyjujkuj = null
        super.onDestroy()
    }

    private fun vfvvf() {
        Snackbar.make(
            hyhyjukiikikolloololol.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var hhyjujkuj: FragmentPlaaaaayy2Binding? = null
    private val hyhyjukiikikolloololol
        get() = hhyjujkuj ?: throw RuntimeException("FragmentPlaaaaayy2Binding = null")

    val ffrrffr by lazy {
        listOf(
            "Kokos",
            "Tomos",
            "Festival",
            "Mega",
            "Super super",
            "Double",
            "Triple"
        )
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        hhyjujkuj = FragmentPlaaaaayy2Binding.inflate(inflater, container, false)
        return hyhyjukiikikolloololol.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            frjrfjiggtjitgtg()


        } catch (e: Exception) {
            vfvvf()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun frjrfjiggtjitgtg() {
        ffrijj()

        frhfrhirfhhfr()
        frhrfhirfihrf()
        frirfoojiogjtigtit()
        rifjrjgtjjgtjgt()
    }

    private fun rifjrjgtjjgtjgt() {
        hyhyjukiikikolloololol.start.setOnClickListener {
            Toast.makeText(requireContext(), "${ffrrffr.random()} bonus!", Toast.LENGTH_SHORT)
                .show()
        }
        hyhyjukiikikolloololol.btnStart.setOnClickListener {
            findNavController().navigate(R.id.action_plaaaaayy2Fragment_to_plaaay3Fragment)
        }
    }

    private fun frirfoojiogjtigtit() {
        hyhyjukiikikolloololol.fiive.setOnClickListener {
            Toast.makeText(requireContext(), "${ffrrffr.random()} bonus!", Toast.LENGTH_SHORT)
                .show()
        }
        hyhyjukiikikolloololol.siiix.setOnClickListener {
            Toast.makeText(requireContext(), "${ffrrffr.random()} bonus!", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun frhrfhirfihrf() {
        hyhyjukiikikolloololol.three.setOnClickListener {
            Toast.makeText(requireContext(), "${ffrrffr.random()} bonus!", Toast.LENGTH_SHORT)
                .show()
        }
        hyhyjukiikikolloololol.fooour.setOnClickListener {
            Toast.makeText(requireContext(), "${ffrrffr.random()} bonus!", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun frhfrhirfhhfr() {
        hyhyjukiikikolloololol.tvooo.setOnClickListener {
            Toast.makeText(requireContext(), "${ffrrffr.random()} bonus!", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun ffrijj() {
        hyhyjukiikikolloololol.oneee.setOnClickListener {
            Toast.makeText(requireContext(), "${ffrrffr.random()} bonus!", Toast.LENGTH_SHORT)
                .show()
        }
    }


}