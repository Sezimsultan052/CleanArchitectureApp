package com.example.cleanarchitectureapp.presentation.ui.main

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.example.cleanarchitectureapp.R
import com.example.cleanarchitectureapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initNavController()
    }

    private fun initNavController() {
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main)
        navController.navigate(R.id.mainFragment)
    }
}