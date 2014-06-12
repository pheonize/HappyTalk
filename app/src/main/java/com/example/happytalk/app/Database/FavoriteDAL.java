package com.example.happytalk.app.Database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by oVANILLAz on 6/12/14 AD.
 */
public class FavoriteDAL {
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME="HappyTalk";

    public static final String TABLE_FAVORITE = "favorite";
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//        return;
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FAVORITE);
//    }
}
