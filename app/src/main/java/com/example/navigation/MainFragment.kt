package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val  view = inflater.inflate(R.layout.fragment_main, container, false)

        view.findViewById<Button>(R.id.button_next_to_first).setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_firstFragment)
        }

        return view
    }
}