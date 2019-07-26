package com.hya.callphone

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button2.setOnClickListener {
            Toast.makeText(this,"按钮被点击",Toast.LENGTH_SHORT).show()
//            startActivity(Intent().setAction(Intent.ACTION_CALL).setData(Uri.parse("tel://13903497066")))
            Log.v("MainActivity","ssss")
        }
    }

    fun click(view: View){
        view.setOnClickListener {
            Toast.makeText(this,"llllla",Toast.LENGTH_SHORT).show()
        }
    }
}
