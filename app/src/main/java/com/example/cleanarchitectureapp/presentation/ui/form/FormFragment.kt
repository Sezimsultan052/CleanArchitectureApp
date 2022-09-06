package com.example.cleanarchitectureapp.presentation.ui.form

import android.os.Bundle
import android.system.Os.close
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.example.cleanarchitectureapp.databinding.FragmentFormBinding
import com.example.domain.domain.model.Note

class FormFragment : Fragment() {
    private lateinit var binding: FragmentFormBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFormBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.btnSave.setOnClickListener {
            parentFragmentManager.setFragmentResult(
                "key",
                bundleOf(
                    "note" to Note(
                        title = binding.tvTitle.text.toString(),
                        text = binding.tvText.text.toString()
                    )
                )
            )
            findNavController().navigateUp()
        }


//        isEdited()
    }

//    private fun isEdited() {
//        if (arguments != null) {
//            binding.tvTitle.setText(arguments!!.getString("editTitle"))
//            binding.tvText.setText(arguments!!.getString("editText"))
//            binding.btnSave.setOnClickListener { view ->
//                editUser()
//                close()
//            }
//        } else {
//            binding.btnSave.setOnClickListener { view -> initListeners() }
//        }
//    }
//
//    private fun initListeners() {
//        binding.btnSave.setOnClickListener { v ->
//            save()
//            close()
//        }
//    }

    private fun save() {

//    val name: String = binding.nameEt.getText().toString()
//        val surname: String = binding.surnameEt.getText().toString()
//        val user = User(name, surname)
//        val bundle = Bundle()
//        bundle.putSerializable("note", note)
//        parentFragmentManager.setFragmentResult("key", bundle)

    }

    private fun editUser() {
//        val bundleEDited = Bundle()
//        val name: String = binding.nameEt.getText().toString()
//        val surname: String = binding.surnameEt.getText().toString()
//        val id = arguments!!.getInt("position")
//        val userEdit = User(id, name, surname)
//        App.dataBase.userDao().updateUser(userEdit)
//        bundleEDited.putString("editName", name)
//        bundleEDited.putString("editSurname", surname)
//        bundleEDited.putSerializable("editedUser", userEdit)
//        parentFragmentManager.setFragmentResult("UserEdited", bundleEDited)
//        parentFragmentManager.popBackStack()
    }
}