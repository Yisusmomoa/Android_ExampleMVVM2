package com.example.mvvm4.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.mvvm4.databinding.ActivityMainBinding
import com.example.mvvm4.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    private val quoteViewModel:QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //conectamos el viewodel al activity
        quoteViewModel.quoteModel.observe(this, Observer {
            currentQuote->
            //esto está enganchado a livedata y cuando nuestro livedata haga un cambio
            //generar una nueva cita se va a ejecutar
            binding.tvQuote.text=currentQuote.quote
            binding.tvAuthor.text=currentQuote.author

        })
        //setContentView(R.layout.activity_main)
        binding.viewContainer.setOnClickListener {
            quoteViewModel.randomeQuote()
        }
    }
}