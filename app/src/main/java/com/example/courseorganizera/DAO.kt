package com.example.courseorganizera

import java.sql.Connection
import java.sql.DriverManager

class DAO {
    // private var myconnection: ?? = ??

    var url = "mysql-49257-0.cloudclusters.net"
    var username = "Test"
    var password = "12345678"

    var connection: Connection = DriverManager.getConnection(url, username, password)

    fun iniciarSesion(){
        println(connection.prepareCall("SELECT * FROM User"))
    }
}