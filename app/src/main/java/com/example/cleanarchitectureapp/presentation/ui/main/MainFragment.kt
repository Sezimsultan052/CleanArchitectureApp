package com.example.cleanarchitectureapp.presentation.ui.main

import android.content.DialogInterface
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.cleanarchitectureapp.R
import com.example.cleanarchitectureapp.databinding.FragmentMainBinding
import com.example.core.core.BaseFragment
import com.example.core.core.UIState
import com.example.domain.domain.model.Note
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment(), OnItemClick {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: FragmentMainBinding
    private var notes = arrayListOf<Note>()
    private val adapter: NoteAdapter by lazy { NoteAdapter(notes, this) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getAllNotes()
        initListeners()
        setFragmentListeners()
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.notesState.subscribe { state ->
            when (state) {
                is UIState.Error-> {
                    Toast.makeText(requireContext(), state.error, Toast.LENGTH_SHORT).show()
                    binding.progressBar.isVisible = false
                }
                is UIState.Loading-> {
                    binding.progressBar.isVisible = true
                }
                is UIState.Success -> {
                    binding.progressBar.isVisible = false
                    notes = state.data as ArrayList<Note>
                    binding.rvNote.adapter = adapter
                    // binding.text.text = notes.toString()
                }
            }
        }

        viewModel.noteState.subscribe { state ->
            when (state) {
                is UIState.Error -> {
                    Toast.makeText(requireContext(), state.error, Toast.LENGTH_SHORT).show()
                    binding.progressBar.isVisible = false
                }
                is UIState.Loading -> {
                    binding.progressBar.isVisible = true
                }
                is UIState.Success -> {
                    binding.progressBar.isVisible = false
                    viewModel.getAllNotes()
                }
            }
        }


    }

    private fun setFragmentListeners() {

        parentFragmentManager.setFragmentResultListener(
            "key", viewLifecycleOwner
        ) { _, result ->
            Log.e("TAG", "setFragmentListeners: ${result.getSerializable("note")}")
            viewModel.addNote(result.getSerializable("note") as Note)
//            val user: User? = result.getSerializable("note") as Note?
//            App.dataBase.userDao().addUser(user)

        }
//        parentFragmentManager.setFragmentResultListener(
//            "NoteEdited", viewLifecycleOwner
//        ) { requestKey, result -> val note: Note? = result.getSerializable("editedNote") as Note? }

    }

    private fun initListeners() {
        binding.btnAdd.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_formFragment)
        }
    }

    override fun openAlertDialog(pos: Int) {
        val dialogBuilder = AlertDialog.Builder(requireContext())
        dialogBuilder.setMessage("Do you want to delete this item ?")

            .setCancelable(false)
            .setPositiveButton("YES") { dialog, id ->
                adapter.removeItem(pos)
                viewModel.deleteLastNote(notes[pos-1] )
            }
            .setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, id ->
                dialog.cancel()
            })


        val alert = dialogBuilder.create()
        alert.setTitle("AlertDialogExample")
        alert.show()

    }

    override fun onClick(pos: Int) {
//        val noteEdit: Note = adapter.getList().get(pos)
//        val bundleEdit = Bundle()
//        bundleEdit.putString("editTitle", userEdit.getName())
//        bundleEdit.putString("editText", userEdit.getSurname())
//        bundleEdit.putInt("position", userEdit.getId())
//        val formFragment = FormFragment()
//        formFragment.setArguments(bundleEdit)
//        val transaction = parentFragmentManager.beginTransaction()
//        transaction.replace(R.id.nav_host_fragment_activity_main, formFragment)
//        transaction.addToBackStack("FormFragment")
//        transaction.commit()



    }


}