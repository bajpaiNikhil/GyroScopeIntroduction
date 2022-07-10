package com.example.gyroscopeintroduction

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val OrientationSensor: MeasurableSensor
):ViewModel() {

    val valuesLiveData : MutableLiveData<List<Float>>  = MutableLiveData()

    init {
        OrientationSensor.startListening()
        OrientationSensor.setOnSensorValueChangedListener { values->
            val a = (values[0] *(180/3.14))
            val b = (values[1] *(180/Math.PI))
            val c = (values[2] *(180/Math.PI))
            valuesLiveData.value = values
//            Log.d("MainViewModel" , "its viewModel in 90-value ${90-a} , ${90-b} , ${90-c}")
//            Log.d("MainViewModel" , "its viewModel in value , $values ")
            Log.d("MainViewModel" , "its viewModel in value , ${90-b} ")

        }
    }
    fun removeSensor(){
        OrientationSensor.stopListening()
    }
}