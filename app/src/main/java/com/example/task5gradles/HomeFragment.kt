package com.example.task5gradles

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

// Extending into fragment_home and referencing it for our nav graph
class HomeFragment : Fragment(R.layout.fragment_home) {
    var num=0
    // Override Method
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Linking to HomeFragment, taking a number we calculated and send it to a string. Doing each button individually.
        btn_add.setOnClickListener {
            num=num.inc()
            tv_result.text = num.toString()
        }
        btn_minus.setOnClickListener {
            num=num.dec()
            tv_result.text = num.toString()
        }
        // declaring action
        btn_next_screen.setOnClickListener {
            val result = tv_result.text.toString()
            // Passing result through
            val action = HomeFragmentDirections.actionHomeFragmentToNextScreenFragment(result)
            // Implementing code of the nav graph, apply the action
            findNavController().navigate(action)
        }
    }

}