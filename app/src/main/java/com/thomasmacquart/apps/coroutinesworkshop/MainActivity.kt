package com.thomasmacquart.apps.coroutinesworkshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

//Dont do this at home, I cut a lot of corners in this app to focus on coroutines (dependencies injection etc..)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewModel = ViewModelProviders.of(this)
                .get(MainViewModel::class.java)

        first_button.setOnClickListener { viewModel.onFirstClicked() }

        viewModel.observable.observe(this, Observer {
            first_result.text = it
        })
    }
}
