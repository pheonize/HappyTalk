package com.example.happytalk.app;

/**
 * Created by oVANILLAz on 5/21/14 AD.
 */
import android.database.Cursor;
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

    FavoriteDAL favoriteDAL;
    SQLiteDatabase sqLiteDatabase;

    ArrayList<Child> childList = new ArrayList<Child>();
    Child child;
    GroupHeader groupHeader;

    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.favorite);

        checkLanguage();


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


        displayList(lang_from,lang_to);

    }

    public void displayList(String lang_from,String lang_to) {

            favoriteDAL = new FavoriteDAL(this);
            sqLiteDatabase = favoriteDAL.getWritableDatabase();
            loadFavorite();

            //loadFavorite();
            //get ref to the expandableListView
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(FavoriteActivity.this, getGroupHeaderList(), lang_from, lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);





    }

    public void loadFavorite() {


        String select = " SELECT * FROM " + FavoriteDAL.TABLE_FAVORITE;
        Cursor mCursor = sqLiteDatabase.rawQuery(select, null);




            child = new Child(mCursor.getString(7), mCursor.getString(6), mCursor.getString(4), mCursor.getString(3), mCursor.getString(5), null, null);
            childList.add(child);
            child.setSoundPath(mCursor.getInt(8));

            groupHeader = new GroupHeader(mCursor.getString(4), mCursor.getString(5), childList);
            groupHeaderList.add(groupHeader);


    }

    public ArrayList<GroupHeader> getGroupHeaderList() {
        return groupHeaderList;
    }
}











