package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {

    val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_second, container, false)

        view.findViewById<TextView>(R.id.textView_first_name).text = args.firstName
        view.findViewById<TextView>(R.id.textView_last_name).text = args.lastName

        return view
    }

}