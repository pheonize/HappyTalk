package com.example.happytalk.app;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by oVANILLAz on 6/3/14 AD.
 */
public class SettingActivity extends Activity {

    String[] setting =new String[] {"Language","About"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        
        initSettingListView();
    }

    private void initSettingListView() {

        ListView listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,setting);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (String.valueOf(position).equals("0")){
                    Intent intent;
                    intent = new Intent(getApplicationContext(), LanguageActivity.class);
                    startActivity(intent);

                    }
                else {
                    Intent intent;
                    intent = new Intent(getApplicationContext(), AboutActivity.class);
                    startActivity(intent);
                }
            }
        });



    }

}
