package com.example.gyroscopeintroduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel:MainViewModel by viewModels()
        //val isDark = viewModel.isDark
        //Log.d("MainActivity" , "$isDark")

    }

//    override fun onDestroy() {
//        super.onDestroy()
//        val viewModel:MainViewModel by viewModels()
//        viewModel.removeSensor()
//    }
}