package com.deerbrain.sunmooncalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getData.setOnClickListener {
            getDataPressed()
        }
    }

    fun getDataPressed(){
        val today = Now()
        val smc: SunMoonCalculator = SunMoonCalculator(date: today, longitude: -34.2, latitude: -82.2)

        smc.calcSunAndMoon()
        // i can get all the data doing
        val data1 = smc.sunTransit
        val data2 = smc.moonDistance
        //etc
    }
}