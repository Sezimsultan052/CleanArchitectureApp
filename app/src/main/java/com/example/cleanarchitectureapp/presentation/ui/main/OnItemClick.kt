package com.example.cleanarchitectureapp.presentation.ui.main

interface OnItemClick {

    fun openAlertDialog(pos: Int) //long
    fun onClick(pos: Int) //short click

}