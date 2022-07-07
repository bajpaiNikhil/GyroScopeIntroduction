package com.example.gyroscopeintroduction

import android.widget.SearchView

abstract class MeasurableSensor(
    protected val sensorType:Int
) {

    protected var onSensorValuesChanged :((List<Float>)->Unit)? = null


    abstract val doesSensorExist : Boolean

    abstract fun startListening()
    abstract fun stopListening()

    fun setOnSensorValueChangedListener(listener:(List<Float>)->Unit ){
        onSensorValuesChanged = listener
    }

}