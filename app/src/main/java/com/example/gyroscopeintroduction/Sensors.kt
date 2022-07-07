package com.example.gyroscopeintroduction

import android.content.Context
import android.content.pm.PackageManager
import android.hardware.Sensor

//class LightSensor(
//    context: Context
//):AndroidSensor(
//    context = context ,
//    sensorFeature =  PackageManager.FEATURE_SENSOR_LIGHT , //to input different
//    sensorType = Sensor.TYPE_LIGHT
//)

class LightSensor(
    context: Context
) : AndroidSensor(
    context = context ,
    sensorFeature = PackageManager.FEATURE_SENSOR_GYROSCOPE  ,
    //sensorType = Sensor.TYPE_ROTATION_VECTOR
    sensorType =  Sensor.TYPE_ORIENTATION
)