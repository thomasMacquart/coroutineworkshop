package com.thomasmacquart.apps.coroutinesworkshop

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class MainViewModel(private val repo : MainRepo) : ViewModel() {

    val observable = MutableLiveData<String>()
    val movieObservable = MutableLiveData<String>()

    fun onFirstClicked() {
        //TODO exercice 1
        /*delay(2000)

        observable.postValue("I love croissants")*/
    }

    fun onSecondCLicked() {
        //TODO exercice 2
            /*val result = repo.doRequest()

            when (result) {
                is NetworkResult.onSuccess -> movieObservable.postValue("Success")
                is NetworkResult.Failed -> movieObservable.postValue(result.error)
            }*/
    }

}