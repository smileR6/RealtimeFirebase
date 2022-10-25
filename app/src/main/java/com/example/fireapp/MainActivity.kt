package com.example.fireapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    //private var mAuth:FirebaseAuth? = null
    private lateinit var send: Button
    private  lateinit var edittext: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        send = findViewById(R.id.send)
        edittext = findViewById(R.id.edittext)

        send.setOnClickListener {
            Toast.makeText(this,"Firebase", Toast.LENGTH_SHORT).show()
        }

        var firebasedatabase = FirebaseDatabase.getInstance()
        var databaseReference = firebasedatabase.reference
        databaseReference.setValue("vipi")




    }
}