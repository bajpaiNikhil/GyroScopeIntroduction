package com.example.gyroscopeintroduction

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val lightSensor: MeasurableSensor
):ViewModel() {

    var isDark : Boolean = false


    init {
        lightSensor.startListening()
        lightSensor.setOnSensorValueChangedListener { values->
//            val lux = values[0]
            Log.d("MainViewModel" , "its viewModel , $values")
//            isDark = lux<60f
        }
    }

}