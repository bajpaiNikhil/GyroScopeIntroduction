package com.example.gyroscopeintroduction

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FirstFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstViewModel:MainViewModel by viewModels()

        firstViewModel.valuesLiveData.observe(viewLifecycleOwner , Observer {


            val b = (it[1] *(180/Math.PI))
            val angle : Double = 90.0
            if((angle-b)>angle){
                if ((angle-b) >110.00){
                    Log.d("FirstFragment"  ,  "Move to Second Fragment")
                    findNavController().navigate(R.id.secondFragment)
                }
                else{
                    Log.d("FirstFragment"  ,  "Stay")
                }
            }
        })
    }
}