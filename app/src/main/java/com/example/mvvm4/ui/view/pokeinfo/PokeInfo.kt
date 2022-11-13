package com.example.mvvm4.ui.view.pokeinfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mvvm4.databinding.ActivityPokeInfoBinding
import com.example.mvvm4.databinding.ActivityPokeListBinding

class PokeInfo : AppCompatActivity() {
    private lateinit var binding: ActivityPokeInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPokeInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_poke_info)
    }
}