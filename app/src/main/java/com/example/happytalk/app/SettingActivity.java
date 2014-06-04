package com.example.happytalk.app;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Locale;

/**
 * Created by oVANILLAz on 6/4/14 AD.
 */
public class SettingActivity extends PreferenceActivity implements OnSharedPreferenceChangeListener  {
    private static final int REQUEST_CHANGE_LANGUAGE =1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.setting);
        SharedPreferences settings =
                PreferenceManager.getDefaultSharedPreferences(this);
        settings.registerOnSharedPreferenceChangeListener(this);

        displayCurrentName(settings);
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


            default:
                return super.onOptionsItemSelected(item);

        }


    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        if (key.equals("langPref")) {
            //Display selected
            displayCurrentName(sharedPreferences);
            Toast.makeText(this, "Language changed", Toast.LENGTH_SHORT).show();

        }
    }

    private void displayCurrentName(SharedPreferences sharedPreferences) {

        Preference langPref = findPreference("langPref");

        String value = sharedPreferences.getString("langPref","");

        String msg ="Current language : " +sharedPreferences.getString("langPref","");


        if (value.equals("Thai")) {
            Configuration configuration = new Configuration();
            configuration.locale = new Locale("Th");
            getResources().updateConfiguration(configuration, null);
            startActivityForResult(new Intent(SettingActivity.this, SettingActivity.class),REQUEST_CHANGE_LANGUAGE);

            //onCreate(null);
        } else {
            Configuration configuration = new Configuration();
            configuration.locale = Locale.ENGLISH;
            getResources().updateConfiguration(configuration, null);

            //onCreate(null);
        }
        langPref.setSummary(msg);
    }
}
