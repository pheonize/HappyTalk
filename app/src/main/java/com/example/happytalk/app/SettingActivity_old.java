package com.example.happytalk.app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.ActionBar;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.preference.PreferenceActivity;
import android.widget.Toast;

/**
 * Created by oVANILLAz on 5/27/14 AD.
 */
public class SettingActivity_old extends PreferenceActivity implements SharedPreferences.OnSharedPreferenceChangeListener{


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
                Intent i = new Intent(this,SettingActivity_old.class);
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

