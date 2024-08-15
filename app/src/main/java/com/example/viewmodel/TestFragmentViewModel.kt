package com.example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestFragmentViewModel : ViewModel() {
    var testMutableLiveData = MutableLiveData(0)

    fun plus(){
        testMutableLiveData.value = testMutableLiveData.value!!.plus(1)
    }

    fun minus(){
        testMutableLiveData.value = testMutableLiveData.value!!.minus(1)
    }

}