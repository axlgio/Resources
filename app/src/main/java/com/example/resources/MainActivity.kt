package com.example.resources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.resources.databinding.ActiviyMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActiviyMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}