package com.example.happytalk.app;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.SimpleCursorTreeAdapter;

import com.example.happytalk.app.Database.Database;

/**
 * Created by oVANILLAz on 6/6/14 AD.
 */
public class MyExpandableListAdapter extends SimpleCursorTreeAdapter {

    Database db;
    SQLiteOpenHelper mdb;

    public MyExpandableListAdapter(Cursor cursor, Context context, int groupLayout,
                                   int childLayout, String[] groupFrom, int[] groupTo, String[] childrenFrom,
                                   int[] childrenTo) {
        super(context, cursor, groupLayout, groupFrom, groupTo,
                childLayout, childrenFrom, childrenTo);
    }



    @Override
    protected Cursor getChildrenCursor(Cursor groupCursor) {
        Cursor childCursor = db.fetchChildren(groupCursor.getString(groupCursor.getColumnIndex("id")));

        childCursor.moveToFirst();
        return childCursor;
    }


}
