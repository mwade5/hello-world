package com.wade.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

/* Purpose: The main activity is the entry point of the app (where program processing starts).
   When you run the application, an instance of this Activity is 'launched' and it's layout is loaded. */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
