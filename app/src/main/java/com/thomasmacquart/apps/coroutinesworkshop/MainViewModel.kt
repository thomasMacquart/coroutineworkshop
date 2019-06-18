package com.thomasmacquart.apps.coroutinesworkshop

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay


class MainViewModel : ViewModel() {

    val observable = MutableLiveData<String>()

    fun onFirstClicked() {
        //TODO exercice 1
        //delay(2000)

        observable.postValue("I love croissants")
    }


}