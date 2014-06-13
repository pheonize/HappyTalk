package com.example.happytalk.app;

/**
 * Created by oVANILLAz on 5/21/14 AD.
 */
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.ExpandableListView;
import android.widget.TextView;

import com.example.happytalk.app.Database.ConversationDAL;
import com.example.happytalk.app.Database.Database;
import com.example.happytalk.app.Database.Favorite;
import com.example.happytalk.app.Database.FavoriteDAL;


import java.util.ArrayList;

public class FavoriteActivity extends Activity{


    private MyListAdapter listAdapter;
    private ExpandableListView myList;
    String lang_from,lang_to;
    private static FavoriteDAL db;

    SQLiteDatabase sqLiteDatabase;
    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.favorite);

        checkLanguage();

        //Create

        db = new FavoriteDAL(this);

        sqLiteDatabase = db.getWritableDatabase();
    }

    public void checkLanguage() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        String lang_from = extras.getString("strCountryFrom", "");
        if (lang_from != null) {
            //Do something

            Log.d("--Conservation_FROM", lang_from);
            TextView langFrom = (TextView) findViewById(R.id.txtLangFrom);
            langFrom.setText(lang_from);


        }

        String lang_to = extras.getString("strCountryTo", "");
        if (lang_to != null) {
            //Do something
            Log.d("--Conservation_TO", lang_to);
            TextView langTo = (TextView) findViewById(R.id.txtLangTo);
            langTo.setText(lang_to);

        }
        displayList(lang_from, lang_to);



    }

    public void displayList(String lang_from,String lang_to){
        if (lang_from.equals("Thai") && lang_to.equals("China") || lang_from.equals("ไทย") && lang_to.equals("จีน")) {
            db= new FavoriteDAL(this);
            db.loadThaiToChina();
            //get ref to the expandableListView
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(FavoriteActivity.this, db.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);




        }
    }








}
