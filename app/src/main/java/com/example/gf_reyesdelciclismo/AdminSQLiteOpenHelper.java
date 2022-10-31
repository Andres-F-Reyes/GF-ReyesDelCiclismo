package com.example.gf_reyesdelciclismo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class AdminSQLiteOpenHelper extends SQLiteOpenHelper{
    public AdminSQLiteOpenHelper (Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super (context, name, factory, version);
    }

    @Override
    public void onCreate (SQLiteDatabase GFReyes) {
        GFReyes.execSQL("create table agenda (numID integer primary key, eTPersonName text, textCategBox text, textEqpBox text, EMailBox text, checkBox boolean)");
    }

    @Override
    public void onUpgrade (SQLiteDatabase rene, int oldVersion, int newVersion) {

    }
}
