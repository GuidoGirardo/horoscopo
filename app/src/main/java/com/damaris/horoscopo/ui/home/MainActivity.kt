package com.damaris.horoscopo.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.damaris.horoscopo.R
import com.damaris.horoscopo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}