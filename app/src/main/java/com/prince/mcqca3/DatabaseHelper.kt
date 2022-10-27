package com.prince.mcqca3

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context, nothing: Nothing?) : SQLiteOpenHelper( context , DATABASE_NAME , null , DATABASE_VERSION   ) {


    companion object  {
        const val DATABASE_NAME = "mydb"
        const val DATABASE_VERSION = 1 ;
        const val TABLE_NAME = "mytable"
        const val EMAIL = "email"
        const val PASSWORD = "password"
        const val NAME = "name"

    }

    override fun onCreate(p0: SQLiteDatabase?) {

        val query = "CREATE TABLE $TABLE_NAME( $EMAIL varchar(50) primary key  , $NAME varchar(50) , $PASSWORD varchar(50) )"

        p0?.execSQL( query )

    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {

        val query = "DROP TABLE $TABLE_NAME "

        p0?.execSQL( query )


    }

    fun create( Name : String , Email : String , Password : String ){

        val db = this.writableDatabase

        val values = ContentValues()
        values.put("name" , Name )
        values.put("email" , Email )
        values.put("password" , Password )

        db.insert( TABLE_NAME , null , values )

    }

    fun createSession( Email : String , Password: String ):Boolean{

        val db = this.readableDatabase

        val query = "SELECT * FROM $TABLE_NAME"

        val cursor = db.rawQuery( query , null )

        if( cursor == null )return false

        val indexEmail = cursor.getColumnIndex( "email" )
        val indexPassword = cursor.getColumnIndex("password")

        while( cursor.moveToNext() ){
            if( cursor.getString( indexEmail ) == Email && cursor.getString( indexPassword ) == Password )return true
        }

        return false ;
    }

}