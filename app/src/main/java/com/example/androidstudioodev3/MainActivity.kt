package com.example.androidstudioodev3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidstudioodev3.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   // private lateinit var tasarim: ActivityMainBinding

    //var urunAdet = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        //tasarim = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* setContentView(tasarim.root)
        tasarim.textViewAdet.text = urunAdet.toString()
        tasarim.buttonArti.setOnClickListener {
            urunAdet++
            tasarim.textViewAdet.text = urunAdet.toString()
            if (urunAdet > 5){
                urunAdet = 5
                tasarim.textViewAdet.text = urunAdet.toString()
            }
        }
        tasarim.buttonEksi.setOnClickListener {
            urunAdet--
            tasarim.textViewAdet.text = urunAdet.toString()
            if ( urunAdet < 1){
                urunAdet = 1
                tasarim.textViewAdet.text = urunAdet.toString()
            }

        }*/

    }
}