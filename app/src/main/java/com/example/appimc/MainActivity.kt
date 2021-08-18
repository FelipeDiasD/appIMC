package com.example.appimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.w("Lifecycle", "Entrei no start = tela visível para o usuário")
    }

    override fun onResume() {
        super.onResume()
        Log.w("Lifecycle", "Entrei no resume = agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("Lifecycle", "Entrei no pause = a tela perdeu o foco, você não  mais pode interagir com a tela")
    }

    override fun onStop() {
        super.onStop()
        Log.w("Lifecycle", "Entrei no stop = tela não está mais visível, mas existe")

    }

    override fun onRestart() {
        super.onRestart()
        Log.w("Lifecycle", "Entrei no restart = agora você pode interagir com a tela")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("Lifecycle", "Entrei no destroy = agora você pode interagir com a tela")
    }




}