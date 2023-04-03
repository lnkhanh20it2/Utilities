package com.example.utilities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.utilities.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val imgUrl = "https://picsum.photos/200/300"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Picasso.get()
            .load(imgUrl)
            .into(binding.imgView)
    }
}