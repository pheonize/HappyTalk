package com.example.happytalk.app;

/**
 * Created by oVANILLAz on 5/21/14 AD.
 */

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.app.ExpandableListActivity;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

public class ConversationActivity extends ExpandableListActivity
{
    // Create ArrayList to hold parent Items and Child Items
    private ArrayList<String> parentItems = new ArrayList<String>();
    private ArrayList<Object> childItems = new ArrayList<Object>();

    //DB
    Database db = new Database(this);

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

        if (lang_from.equals("Thai") && lang_to.equals("Brunei")) {

            // Create Expandable List and set it's properties
            ExpandableListView expandableList = getExpandableListView();
            expandableList.setDividerHeight(2);
            expandableList.setGroupIndicator(null);
            expandableList.setClickable(true);

            // Set the Items of Parent
            setGroupParents();
            // Set The Child Data
            setChildData();

            // Create the Adapter
            MyExpandableAdapter adapter = new MyExpandableAdapter(parentItems, childItems);

            adapter.setInflater((LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE), this);

            // Set the Adapter to expandableList
            expandableList.setAdapter(adapter);
            expandableList.setOnChildClickListener(this);
        }
        else{
            Intent intent;
            intent = new Intent(getApplicationContext(),ThingActivity.class);
            startActivity(intent);
        }
    }

    // method to add parent Items
    public void setGroupParents()
    {
        List<Conversation> conversations = db.getConversationParentList();
        

        parentItems.add("Fruits");
        parentItems.add("Flowers");
        parentItems.add("Animals");
        parentItems.add("Birds");

    }

    // method to set child data of each parent
    public void setChildData()
    {

        // Add Child Items for Fruits
        ArrayList<String> child = new ArrayList<String>();
        child.add("Apple");
        child.add("Mango");
        child.add("Banana");
        child.add("Orange");

        childItems.add(child);

        // Add Child Items for Flowers
        child = new ArrayList<String>();
        child.add("Rose");
        child.add("Lotus");
        child.add("Jasmine");
        child.add("Lily");

        childItems.add(child);

        // Add Child Items for Animals
        child = new ArrayList<String>();
        child.add("Lion");
        child.add("Tiger");
        child.add("Horse");
        child.add("Elephant");

        childItems.add(child);

        // Add Child Items for Birds
        child = new ArrayList<String>();
        child.add("Parrot");
        child.add("Sparrow");
        child.add("Peacock");
        child.add("Pigeon");

        childItems.add(child);
    }
}
