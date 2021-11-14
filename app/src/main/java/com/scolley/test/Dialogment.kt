package com.scolley.test

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.DialogFragment
import com.scolley.test.databinding.DialogmentBinding

class Dialogment: AppCompatDialogFragment() {

    lateinit var binding: DialogmentBinding
    private val fragment1 = Fragment1()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(DialogFragment.STYLE_NO_FRAME, R.style.ThemeOverlay_AppCompat_Dialog)
//        val fragmentManager = parentFragment?.childFragmentManager
//        val fragmentTransaction = fragmentManager?.beginTransaction()
//        fragmentTransaction?.add(R.id.fragmentTransition, fragment1)
//        fragmentTransaction?.show(fragment1)
//        fragmentTransaction?.commit()
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DialogmentBinding.inflate(inflater)


        return binding.root
    }


}