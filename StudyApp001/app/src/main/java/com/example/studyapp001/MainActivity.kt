package com.example.studyapp001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.studyapp001.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var debugText = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nextButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.resetButton.setOnClickListener {
            debugText = ""
            binding.debugText.text = debugText
        }

        updateDebugText("onCreate")
    }

    override fun onStart() {
        super.onStart()

        updateDebugText("onStart")
    }

    override fun onResume() {
        super.onResume()

        updateDebugText("onResume")
    }

    override fun onPause() {
        super.onPause()

        updateDebugText("onPause")
    }

    override fun onStop() {
        super.onStop()

        updateDebugText("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()

        updateDebugText("onDestroy")
    }

    private fun updateDebugText(lifecycleName: String) {
        debugText += "$lifecycleName\n"
        binding.debugText.text = debugText
    }
}