package com.veenvliet.livedataexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.veenvliet.livedataexample.viewmodel.MainViewModel
import kotlinx.android.synthetic.main.main_activity.*

/**
 * example of MVVM using LiveData
 */
class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        // attach ViewModel and button click listeners
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel.score.observe(this, Observer { newScore ->
            tvScore.text = newScore.toString()
        })
        btnPlus.setOnClickListener { mainViewModel.incScore() }
        btnMinus.setOnClickListener { mainViewModel.decScore() }
    }

}
