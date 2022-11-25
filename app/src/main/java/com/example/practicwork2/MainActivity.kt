package com.example.practicwork2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        val buttonToShow =findViewById<Button>(R.id.button2)
        buttonToShow.visibility=View.VISIBLE
    }

    override fun onStop() {
        super.onStop()
 //

    }
    override fun onRestart() {
        super.onRestart()
    }
    fun showSomeMessage(view: View){
        val showMessage =Toast.makeText(this,"Сообщение", Toast.LENGTH_SHORT)

       showMessage.show()
    }
    fun showSettingsMenu(view: View){
        val newAct=Intent(this, NewActivity::class.java)
        startActivity(newAct)

    }
    }






