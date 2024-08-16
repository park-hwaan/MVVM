package com.example.viewmodel

import androidx.lifecycle.*

// map, switchMap 사용 방법이 lifeCycle 2.6.0부터 변경됨

class TestFragmentViewModel : ViewModel() {
    private var testMutableLiveData = MutableLiveData(0)
    private val testLiveData : LiveData<Int>
        get() = testMutableLiveData

    // .map 같은 경우 값을 직접으로 사용
    val map = testLiveData.map {
        it + it
    }

    // .switchMap 같은 경우 값을 간접적으로 사용, return 값이 있어야 함
    val switchMap  = testLiveData.switchMap {
        multiply(it)
    }

    fun setLiveData(count : Int){
        testMutableLiveData.value = count
    }
    fun multiply( count : Int) : MutableLiveData<Int>{
        val liveData : MutableLiveData<Int> = MutableLiveData()
        liveData.value = count * count
        return liveData
    }

}