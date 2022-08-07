package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.w("lifecycle","Entrei no CREATE - estou criando a tela")
    }

    override fun onStart() {
        super.onStart()
        Log.w("lifecycle","Entrei no START - deixei a tela visivel para você")
//        finish()
    }

    override fun onResume() {
        super.onResume()
        Log.w("lifecycle","Entrei no RESUME - agora você pode interagir com a tela")
    }

    override fun onPause() {
        super.onPause()
        Log.w("lifecycle","Entrei no PAUSE - a tela perdeu o foco, você nao pode mais interagir")
    }

    override fun onStop() {
        super.onStop()
        Log.w("lifecycle","Entrei no STOP - a tela não está mais visível mas ainda existe")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.w("lifecycle","\nEntrei no DESTROY - a tela foi destruída")
    }

    override fun onRestart() {
        super.onRestart()
        Log.w("lifecycle","\nEntrei no RESTART - a tela está retomando o foco")
    }



}