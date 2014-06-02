package com.example.happytalk.app;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;

import com.example.happytalk.app.Database.Database;


/**
 * Created by oVANILLAz on 5/31/14 AD.
 */
public class ViewAllWord extends ListActivity {

    private Database myData;
    private SimpleCursorAdapter dbAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        myData = new Database(this);
        //Cursor dbList = myData.readAllConversation();


    }
}
