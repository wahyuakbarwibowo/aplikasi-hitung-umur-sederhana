package com.wahyuakbarwibowo.hitungumur

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHitung.setOnClickListener{
            // deklarasi edit text
            val tahunLahir = etInputUmur.text.toString()

            //get tahun saat ini dengan calender
            val tahun: Int = Calendar.getInstance().get(Calendar.YEAR)

            //hasil
            var umur = 0
            if (tahunLahir.toIntOrNull() != null){
                umur = tahun - tahunLahir.toInt()
                tvUmur.text = "Umur = $umur tahun"
            }else{
                tvUmur.text = "Tahun tidak valid"
            }

        }
    }
}
