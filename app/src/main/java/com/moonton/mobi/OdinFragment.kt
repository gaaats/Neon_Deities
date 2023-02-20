package com.moonton.mobi

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


class OdinFragment : Fragment() {
    private lateinit var gtyhyhyhhyhy: Context

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_odin, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtyhyhyhhyhy=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        gtjigtjgtijigtjigt()

    }

    private fun gtjigtjgtijigtjigt() {
        gtnjgtngtngtjigtij()
    }

    private fun gtnjgtngtngtjigtij() {
        findNavController().navigate(R.id.action_odinFragment_to_dvaFragment)
    }
}