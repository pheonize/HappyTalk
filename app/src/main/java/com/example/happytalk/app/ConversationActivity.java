package com.example.happytalk.app;

/**
 * Created by oVANILLAz on 5/21/14 AD.
 */

import android.app.Dialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.app.ExpandableListActivity;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class ConversationActivity extends Activity
{
    // Create ArrayList to hold parent Items and Child Items
    private ArrayList<String> parentItems = new ArrayList<String>();
    private ArrayList<Object> childItems = new ArrayList<Object>();
   // private SimpleCursorAdapter

    //DB
    Database db;
    SQLiteDatabase sqLiteDatabase;
    Cursor cursor;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        String lang_from = extras.getString("strCountryFrom", "");
        if (lang_from != null) {
            //Do something
            Log.d("--Conservation_FROM", lang_from);

        }

        String lang_to = extras.getString("strCountryTo", "");
        if (lang_to != null) {
            //Do something
            Log.d("--Conservation_TO", lang_to);
        }


        //DB
        db = new Database(this);
        sqLiteDatabase = db.getWritableDatabase();

        List<Conversation> conversations = db.getAllConversation();

        for(Conversation con:conversations ){
            String log ="Id: "+con.getId()+" ,LangFrom :" +con.getLangFrom()+",LangTo :"+con.getLangTo()+
                    ",Word TH: " + con.getWordFrom()+ ",Word To: " + con.getWordTo() + ",Karaoke TH:" + con.getKaraokeTH()+
                    ",Karaoke EN:" + con.getKaraokeEN() + "Sound :" +con.getSound();
            Log.d("Language :",log);
        }
        cursor =  sqLiteDatabase.rawQuery("SELECT * FROM "+ Database.TABLE_CONVERSATION,null);

        ArrayList<String> dirArray = new ArrayList<String>();

        cursor.moveToFirst();
        while (!cursor.isAfterLast()){
            dirArray.add(cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDFROM)));
            cursor.moveToNext();
        }


        if (lang_from.equals("Thai") && lang_to.equals("Brunei")) {

            ListView listView = (ListView) findViewById(R.id.listViewFromDB);
            listView.setAdapter(new ArrayAdapter(this,android.R.layout.simple_list_item_1,dirArray));

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                    cursor.moveToPosition(arg2);

                    final Dialog dialog;
                    dialog = new Dialog(ConversationActivity.this);
                    dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
                    dialog.setContentView(R.layout.dialog_data);

                    TextView txtWordFrom  = (TextView) dialog.findViewById(R.id.txtWordFrom);
                    txtWordFrom.setText(cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDFROM)));

                    TextView txtWordTo  = (TextView) dialog.findViewById(R.id.txtWordTo);
                    txtWordFrom.setText(cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDTO)));

                    TextView txtKaraokeTH  = (TextView) dialog.findViewById(R.id.txtKaraokeTH);
                    txtWordFrom.setText(cursor.getString(cursor.getColumnIndex(Database.COLUMN_KARAOKETH)));

                    TextView txtKaraokeEN  = (TextView) dialog.findViewById(R.id.txtKaraokeEN);
                    txtWordFrom.setText(cursor.getString(cursor.getColumnIndex(Database.COLUMN_KARAOKEEN)));


                    //Back btn
                    Button btnBack = (Button)dialog.findViewById(R.id.btnBack);
                    btnBack.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.cancel();
                        }
                    });

                    dialog.show();

                }
            });


        }

        else{
            Intent intent;
           intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }



//        if (lang_from.equals("Thai") && lang_to.equals("Brunei")) {
//
//            prepareResurce();
//            // Create Expandable List and set it's properties
//            ExpandableListView expandableList = getExpandableListView();
//            expandableList.setDividerHeight(2);
//            expandableList.setGroupIndicator(null);
//            expandableList.setClickable(true);
//
//            // Set the Items of Parent
//            setGroupParents();
//            // Set The Child Data
//            setChildData();
//
//            // Create the Adapter
//            MyExpandableAdapter adapter = new MyExpandableAdapter(parentItems, childItems);
//
//            adapter.setInflater((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE), this);
//
//            // Set the Adapter to expandableList
//            expandableList.setAdapter(adapter);
//            expandableList.setOnChildClickListener(this);
//        }
//        else{
//            Intent intent;
//            intent = new Intent(getApplicationContext(),ThingActivity.class);
//            startActivity(intent);
//        }
    }
    public void onPause(){
        super.onPause();
        db.close();
        sqLiteDatabase.close();
    }





    // method to add parent Items
//    public void setGroupParents()
//    {
//       //List<Conversation> conversations = db.getConversationParentList();
//
//
//
//        parentItems.add("Fruits");
//        parentItems.add("Flowers");
//        parentItems.add("Animals");
//        parentItems.add("Birds");
//
//    }
//
//    // method to set child data of each parent
//    public void setChildData()
//    {
//
//        // Add Child Items for Fruits
//        ArrayList<String> child = new ArrayList<String>();
//        child.add("Apple");
//        child.add("Mango");
//        child.add("Banana");
//        child.add("Orange");
//
//        childItems.add(child);
//
//        // Add Child Items for Flowers
//        child = new ArrayList<String>();
//        child.add("Rose");
//        child.add("Lotus");
//        child.add("Jasmine");
//        child.add("Lily");
//
//        childItems.add(child);
//
//        // Add Child Items for Animals
//        child = new ArrayList<String>();
//        child.add("Lion");
//        child.add("Tiger");
//        child.add("Horse");
//        child.add("Elephant");
//
//        childItems.add(child);
//
//        // Add Child Items for Birds
//        child = new ArrayList<String>();
//        child.add("Parrot");
//        child.add("Sparrow");
//        child.add("Peacock");
//        child.add("Pigeon");
//
//        childItems.add(child);
//    }
}
