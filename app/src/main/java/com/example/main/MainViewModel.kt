package com.example.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){
    private val _someTestData = MutableLiveData<String>()
    val someTestData: LiveData<String>
        get() = _someTestData


    private val _counter = MutableLiveData<Int>()
    val counter: LiveData<Int>
        get() = _counter

    init {
        _someTestData.value = "Hello View Model"
        _counter.value = 0
    }

    fun incrementCounter() {
        _counter.value = (_counter.value ?: 0) + 1
    }

    fun setSomeTestData(someTestData: String) {
        _someTestData.value = someTestData
    }
}