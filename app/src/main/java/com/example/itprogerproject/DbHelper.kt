package com.example.itprogerproject

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DbHelper(val context: Context, val factory: SQLiteDatabase.CursorFactory?) :
    SQLiteOpenHelper(context, "app",factory, 1) {



    override fun onCreate(db: SQLiteDatabase?) {
        val query = "CREATE table users (id int primary key, login text,email text,pass text)"
        db!!.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("drop table if exists users")
        onCreate(db)
    }

    fun addUser(user:User){
        val values = ContentValues()
        values.put("login",user.login)
        values.put("email",user.email)
        values.put("pass",user.pass)

        val db = this.writableDatabase
        db.insert("users", null,values)

        db.close()
    }

}