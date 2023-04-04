package com.example.utilities

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.utilities.databinding.ActivityMainBinding
import com.facebook.drawee.backends.pipeline.Fresco

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val imgUrl = "https://fastly.picsum.photos/id/201/200/300.jpg?grayscale&hmac=BgHJjRdLh_COHXoc1t-UQZ-iPISHfWJ_kkRqeYpti4o"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Fresco.initialize(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgView.setImageURI(Uri.parse(imgUrl))
    }
}