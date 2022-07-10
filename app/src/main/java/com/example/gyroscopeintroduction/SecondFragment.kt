package com.example.gyroscopeintroduction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondFragment : Fragment() {


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
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val secondViewModel : MainViewModel by viewModels()

        secondViewModel.valuesLiveData.observe(viewLifecycleOwner , Observer {
            val rightAngle : Double = 90.00
            val b = (it[1] *(180/Math.PI))
            if(rightAngle-b<90){
                if(rightAngle-b < 70.00){
                    findNavController().navigate(R.id.firstFragment)
                }
            }
        })
    }
}