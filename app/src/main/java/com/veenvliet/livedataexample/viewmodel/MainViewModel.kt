package com.veenvliet.livedataexample.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel() : ViewModel() {
    val score: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>(0)
    }

    fun incScore() {
        score.value = score.value?.inc()
    }

    fun decScore() {
        score.value = score.value?.dec()
    }

}
