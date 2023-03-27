package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val weatherAdapter = WeatherAdapter(
            listOf(
                Weather("Пн", cloudiness = true, rain = false, windy = true, -10),
                Weather("Вт", cloudiness = false, rain = true, windy = false, -23),
                Weather("Ср", cloudiness = true, rain = true, windy = true, -10),
                Weather("Чт", cloudiness = true, rain = false, windy = false, +12),
                Weather("Пт", cloudiness = false, rain = false, windy = true, -20),
                Weather("Сб", cloudiness = true, rain = true, windy = false, +23),
                Weather("Вс", cloudiness = false, rain = false, windy = true, -13),
                Weather("Вс", cloudiness = false, rain = false, windy = true, -13),
                Weather("Вс", cloudiness = false, rain = false, windy = true, -13),
                Weather("Вс", cloudiness = false, rain = false, windy = true, -13),
                Weather("Вс", cloudiness = false, rain = false, windy = true, -13),
                Weather("Вс", cloudiness = false, rain = false, windy = true, -13),
                Weather("Вс", cloudiness = false, rain = false, windy = true, -13),
                Weather("Вс", cloudiness = false, rain = false, windy = true, -13),
                Weather("Вс", cloudiness = false, rain = false, windy = true, -13),
                Weather("Вс", cloudiness = false, rain = false, windy = true, -13),
                Weather("Вс", cloudiness = false, rain = false, windy = true, -13),
                Weather("Вс", cloudiness = false, rain = false, windy = true, -13),
            )
        )
        binding.recView.adapter = weatherAdapter
    }
}

