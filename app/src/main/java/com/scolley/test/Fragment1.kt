package com.scolley.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.scolley.test.databinding.DialogmentBinding
import com.scolley.test.databinding.Fragment1Binding

class Fragment1 : Fragment() {

    lateinit var binding: Fragment1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = Fragment1Binding.inflate(inflater)




        return binding.root
    }

}