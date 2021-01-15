package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        val view = inflater.inflate(R.layout.fragment_first, container, false)

        view.findViewById<Button>(R.id.button_next_to_second).setOnClickListener{
            var firstName = view.findViewById<EditText>(R.id.edit_text_first_name).text.toString()
            var lastName = view.findViewById<EditText>(R.id.edit_text_last_name).text.toString()
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(firstName,lastName)
            findNavController().navigate(action)
        }

        return view
    }
}