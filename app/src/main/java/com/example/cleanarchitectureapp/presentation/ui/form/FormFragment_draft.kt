package com.example.cleanarchitectureapp.presentation.ui.form

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.cleanarchitectureapp.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dagger.hilt.android.AndroidEntryPoint
//
//@AndroidEntryPoint
//class FormFragment(
//    private val sendWord: SendWord
//) : BottomSheetDialogFragment() {
//    private lateinit var binding : FragmentFormBinding
//
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        binding = FragmentFormBinding.inflate(layoutInflater)
//
//        return super.onCreateView(inflater, container, savedInstanceState)
//    }
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        initListeners()
//    }
//
//    private fun initListeners() {
//        binding.tvText.setOnClickListener{
//            val title = binding.tvTitle.text.toString()
//            if (title.isNotEmpty()){
//                sendWord.sendWord(title)
//                dismiss()
//            } else {
//                Toast.makeText(requireContext(), "EMPTY !", Toast.LENGTH_SHORT).show()
//            }
//
//        }
//    }
//
//    companion object {
//
//    }
//}