package com.example.courseorganizera

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.sql.Connection
import java.sql.DriverManager

class MainActivity : AppCompatActivity() {

    var url = "mysql-49257-0.cloudclusters.net:11674"
    var username = "Test"
    var password = "12345678"
    var connection: Connection = DriverManager.getConnection(url, username, password)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciarSesion()
    }

    fun iniciarSesion(){
        println(connection.prepareCall("SELECT * FROM User"))
    }
}