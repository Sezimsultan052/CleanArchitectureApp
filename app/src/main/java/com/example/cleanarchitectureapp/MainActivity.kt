package com.example.cleanarchitectureapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.cleanarchitectureapp.databinding.ActivityMainBinding
import com.example.cleanarchitectureapp.domain.model.Note
import com.example.cleanarchitectureapp.presentation.main.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        btnAdd = findViewById(R.id.btnAdd)
//        text = findViewById(R.id.text)
//        btnDelete = findViewById(R.id.btnDelete)



        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.apply {
            var i = 0
            btnAdd.setOnClickListener {
                i++
                viewModel.addNote(Note("title=$i","text=$i" ))
            }

            btnDelete.setOnClickListener {
                i--
                viewModel.deleteLastNote()
            }
        }

            viewModel.liveData.observe(this@MainActivity){
                binding.text.text = it.toString()
            }
        }


    }