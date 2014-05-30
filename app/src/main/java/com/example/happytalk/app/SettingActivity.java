package com.example.happytalk.app;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.app.ActionBar;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.preference.PreferenceActivity;
import android.widget.Toast;


import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by oVANILLAz on 5/27/14 AD.
 */
public class SettingActivity extends PreferenceActivity implements SharedPreferences.OnSharedPreferenceChangeListener{


    //private Spinner language;
    //private String chooseLanguage;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        //setContentView(R.layout.setting);

        addPreferencesFromResource(R.xml.setting);
        SharedPreferences setting = PreferenceManager.getDefaultSharedPreferences(this);
        setting.registerOnSharedPreferenceChangeListener(this);
        displayCurrentName(setting);


        // get action bar
        ActionBar actionBar = getActionBar();
        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);

//        String[] settingMenu = {"About"};
//
//        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,R.layout.listview_setting,settingMenu);
//
//        ListView settingList = (ListView) findViewById(R.id.action_settings);
//        settingList.setAdapter(mAdapter);
//
//        settingList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                Intent intent;
//                switch (position) {
//                    case 0:
//                        intent = new Intent(getApplicationContext(), LanguageActivity.class);
//                        startActivity(intent);
//                        break;
//                    case 1:
//                        intent = new Intent(getApplicationContext(), AboutActivity.class);
//                        startActivity(intent);
//                        break;
//                    default:
//                        break;
//                }
//            }
//        });
//
//        initWidget();
//
//        chooseSpinner();
//    }
//
//    private void chooseSpinner() {
//        ArrayList<String> mySpinner = new ArrayList<String>();
//        mySpinner.add("Thai");
//        mySpinner.add("English");
//
//        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,mySpinner);
//        language.setAdapter(myAdapter);
//
//    }
//
//
//
//    private void initWidget() {
//        language = (Spinner) findViewById(R.id.language);
//
//    }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main_actions,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.action_settings:
                Intent i = new Intent(this,SettingActivity.class);
                startActivity(i);
                return true;
//            case R.id.action_aboutus:
//                Intent j = new Intent(this,AboutActivity.class);
//                startActivity(j);
//                return true;

            default:
                return super.onOptionsItemSelected(item);

        }


    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if(key.equals("langPref")){
            //Display selected
            displayCurrentName(sharedPreferences);
            Toast.makeText(this,"Language changed",Toast.LENGTH_SHORT).show();
        }
    }

    private void displayCurrentName(SharedPreferences sharedPreferences) {

        Preference langPref = findPreference("langPref");

        String msg ="Current language : " +sharedPreferences.getString("langPref","");

        langPref.setSummary(msg);
    }
}

