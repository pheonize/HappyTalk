package com.example.happytalk.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.happytalk.app.Database.ConversationDAL;
import com.example.happytalk.app.Database.DALconnection;
import com.example.happytalk.app.Database.EmergencyDAL;
import com.example.happytalk.app.Database.LogisticDAL;
import com.example.happytalk.app.Database.PlaceDAL;
import com.example.happytalk.app.Database.ThingDAL;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/11/14 AD.
 */
public class SearchActivity extends Activity implements SearchView.OnQueryTextListener {

    private ConversationDAL loadConversation;
    private ThingDAL loadThing;
    private PlaceDAL loadPlace;
    private EmergencyDAL loadEmergency;
    private LogisticDAL loadLogistic;
    private DALconnection daLconnection;

    private MyListAdapter listAdapter;
    private ExpandableListView myList;
    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();
    private String strCountryFrom, strCountryTo;

    EditText editSerch;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        checkLanguage();
        initSearch();


    }

    private void initSearch() {

    }

    private void checkLanguage() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        String lang_from = extras.getString("strCountryFrom", "");
        if (lang_from != null) {
            //Do something

            Log.d("--Conservation_FROM", lang_from);
            //TextView langFrom = (TextView) findViewById(R.id.txtLangFrom);
            //langFrom.setText(lang_from);

        }

        String lang_to = extras.getString("strCountryTo", "");
        if (lang_to != null) {
            //Do something
            Log.d("--Conservation_TO", lang_to);
            //TextView langTo = (TextView) findViewById(R.id.txtLangTo);
            //langTo.setText(lang_to);

        }
        initData(lang_from, lang_to);
    }

    public void initData(String lang_from, String lang_to) {


        if (lang_from.equals("Thai") && lang_to.equals("China") || lang_from.equals("ไทย") && lang_to.equals("จีน")) {
            daLconnection = new DALconnection();
            daLconnection.loadThaiToChinaConversation();
            //get ref to the expandableListView
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Brunei") || lang_from.equals("ไทย") && lang_to.equals("บรูไน")) {


            daLconnection = new DALconnection();
            //daLconnection.loadThaiToBrunei();

            //get ref to the expandableListView
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);


        }


    }



    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }


















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);



        return super.onCreateOptionsMenu(menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_settings:
                Intent i;
                i = new Intent(getApplicationContext(), SettingActivity.class);
                startActivity(i);
                return true;
            //break;
            case R.id.action_search:
                // search action
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}