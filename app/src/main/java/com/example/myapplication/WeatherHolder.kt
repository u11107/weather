package com.example.myapplication

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.WeatherViewBinding


class WeatherHolder(item: View) : RecyclerView.ViewHolder(item) {
    private val binding = WeatherViewBinding.bind(item)

    fun bind(weather: Weather) = with(binding) {
        textDay.text = weather.day//присваеваем значение дня
        textTemp.text = weather.temp.toString()//присваеваем значение температуры
        val cloudsIcon = if (weather.cloudiness) {
            R.drawable.cloudy
        } else if (weather.rain) {
            R.drawable.rain
        } else if (weather.windy) {
            R.drawable.windy
        } else {
            R.drawable.sun
        }
        iV.setImageResource(cloudsIcon)
        textDay.text = weather.day
        textTemp.text = weather.temp.toString()
    }
}
