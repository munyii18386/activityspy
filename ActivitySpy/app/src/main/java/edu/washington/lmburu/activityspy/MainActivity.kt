package edu.washington.lmburu.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       if (savedInstanceState != null ){
            for (key in savedInstanceState.keySet()) {
                Log.i(TAG, "Bundle: savedInstanceStateKey --> $key  savedInstanceStateValue: --> ${savedInstanceState.get(key)}")
            }
        } else{
           Log.i(TAG, "Hey,.. I have nothing in my bundle")
       }

        Log.i(TAG, "onCreate event fired")
    }

    override fun onStart(){
        super.onStart()
        Log.i(TAG, "onStart event fired")
    }

    override fun onResume(){
        super.onResume()
        Log.i(TAG, "onResume event fired")
    }

    override fun onPause(){
        super.onPause()
        Log.i(TAG, "onPause event fired")
    }

    override fun onStop(){
        super.onStop()
        Log.i(TAG, "onStop event fired")
    }

    override fun onRestart(){
        super.onRestart()
        Log.i(TAG, "onRestart event fired")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.e(TAG, "We’re going down, Captain!")
    }
}
