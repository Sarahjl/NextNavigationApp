package com.example.nextnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

class threeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_three, container, false)

        view.findViewById<Button>(R.id.btnto5).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_threeFragment_to_fiveFragment)
        }

        return view
    }
}