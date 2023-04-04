package com.example.utilities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.utilities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val imgUrl = "https://fastly.picsum.photos/id/866/200/300.jpg?hmac=rcadCENKh4rD6MAp6V_ma-AyWv641M4iiOpe1RyFHeI"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Glide.with(applicationContext)
            .load(imgUrl)
            .into(binding.photoView)
    }
}