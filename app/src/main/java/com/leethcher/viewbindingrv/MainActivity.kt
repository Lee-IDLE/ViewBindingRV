package com.leethcher.viewbindingrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.leethcher.viewbindingrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MainAdapter(TaskList.taskList)
        binding.taskRV.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}