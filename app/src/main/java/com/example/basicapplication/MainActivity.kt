package com.example.basicapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import com.farimarwat.grizzly.GrizzlyMonitorBuilder


const val TAG = "BasicActivity"
class MainActivity : AppCompatActivity(){
   
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        DummyObject.initialize()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,DummyObject.data)

    }

}