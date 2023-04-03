package com.example.utilities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.size.Scale
import coil.transform.CircleCropTransformation
import com.example.utilities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val imgUrl = "https://scontent.fdad2-1.fna.fbcdn.net/v/t39.30808-6/334699619_1224353065163196_8335431917113233325_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=r6Ro1qPMnk4AX_rMQ5d&_nc_ht=scontent.fdad2-1.fna&oh=00_AfD-g3xESKlUpwq9KuBA0atwyOXtJEODDW9pI_GzL_KoYw&oe=642EA67E"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgView.load(imgUrl) {
//            transformations(CircleCropTransformation())
            crossfade(true)
            scale(Scale.FIT)
            size(width = 250, height = 300)
        }
    }
}