package com.example.mvvm4.ui.view.pokelist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvm4.databinding.ActivityPokeListBinding
import com.example.mvvm4.ui.view.pokeinfo.PokeInfo
import com.example.mvvm4.ui.viewmodel.PokeListViewModel

class PokeList : AppCompatActivity() {
    private lateinit var binding:ActivityPokeListBinding
    private val pokeListViewModel:PokeListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPokeListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
    //setContentView(R.layout.activity_poke_list)
    }
    private fun initUI(){
        binding.pokelistRecyclerView.layoutManager=LinearLayoutManager(this)
        binding.pokelistRecyclerView.adapter=PokeListAdapter{
            val intent=Intent(this, PokeInfo::class.java)
            intent.putExtra("id" , it)
            startActivity(intent)
        }
        pokeListViewModel.onCreate()
        pokeListViewModel.pokeListViewModel.observe(this, Observer { list ->
            (binding.pokelistRecyclerView.adapter as PokeListAdapter).setData(list)
        })
    }

}