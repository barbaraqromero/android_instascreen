package br.com.zup.instagram

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
        printLogcat("on start")
    }

    override fun onResume() {
        super.onResume()
        printLogcat("on resume")
    }

    override fun onPause() {
        super.onPause()
        printLogcat("on pause")
    }

    override fun onStop() {
        super.onStop()
        printLogcat("on stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        printLogcat("on destroy")
    }

    override fun onRestart() {
        super.onRestart()
        printLogcat("on restart")
    }

    fun printLogcat(message: String) {
        Log.i("exercicio", message)

    }

}
