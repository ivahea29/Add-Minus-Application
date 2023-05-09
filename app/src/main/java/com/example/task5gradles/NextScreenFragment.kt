package com.example.task5gradles

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_next_screen.*

class NextScreenFragment : Fragment(R.layout.fragment_next_screen) {
    // Private Variable
    private val args: NextScreenFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // value into results box, arguments from the next screen
        textView.text = args.result
    }
}