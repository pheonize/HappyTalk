package com.example.happytalk.app;

/**
 * Created by oVANILLAz on 5/21/14 AD.
 */

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ListView;

import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import com.example.happytalk.app.Database.Database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class ConversationActivity extends Activity {


    //DB
    private static Database db;
    SQLiteDatabase sqLiteDatabase;
    Context context;
    Button btnSound;
    String langTo,langFrom;
    String[] country_list = {"Brunei", "Cambodia", "China", "Indonesia",
            "Laos", "Malaysia", "Myanmar", "Philippines", "Singapore",
            "Thai", "Vietnam"};
    Integer[] img = {R.drawable.brunei_flag, R.drawable.cambodia_flag,
            R.drawable.china_flag, R.drawable.indonesia_flag,
            R.drawable.laos_flag, R.drawable.malaysia,
            R.drawable.myanmar_flag, R.drawable.philippines_flag,
            R.drawable.singapore_flag, R.drawable.thailand_flag,
            R.drawable.vietnam_flag};
    private Cursor cursor;
    private MediaPlayer mediaPlayer;
    private Spinner countryFrom, countryTo;
    private String strCountryFrom, strCountryTo;

    Map<String, List<String>> listMap;
    List<String> groupList;
    List<String> childList;

    ExpandableListView expListView;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.conversation);


        Configuration configuration = new Configuration();

        getResources().updateConfiguration(configuration,null);

        initWidget();

        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }

        final String lang_from = extras.getString("strCountryFrom", "");
        if (lang_from != null) {
            //Do something

            Log.d("--Conservation_FROM", lang_from);
            TextView langFrom = (TextView) findViewById(R.id.txtLangFrom);
            langFrom.setText(lang_from);

        }

        final String lang_to = extras.getString("strCountryTo", "");
        if (lang_to != null) {
            //Do something
            Log.d("--Conservation_TO", lang_to);
            TextView langTo = (TextView) findViewById(R.id.txtLangTo);
            langTo.setText(lang_to);
        }

        //DB

        db = new Database(this);

        sqLiteDatabase = db.getWritableDatabase();

//        cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + Database.TABLE_CONVERSATION, null);
//
//        ArrayList<String> dirArray = new ArrayList<String>();
//
//        cursor.moveToFirst();
//        while (!cursor.isAfterLast()) {
//            dirArray.add(cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDEN)) +
//                     System.getProperty("line.separator") + "" + cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDTO)));
//            cursor.moveToNext();
//        }






        if (lang_from.equals("Thai") && lang_to.equals("Brunei") || lang_from.equals("ไทย") && lang_to.equals("บรูไน")) {

            createGroupList();
            createCollection();

            expListView = (ExpandableListView) findViewById(R.id.groupListview);
            final ExpandableListAdapter expandableListAdapter = new ExpandableListAdapter(this,groupList,listMap);
            expListView.setAdapter(expandableListAdapter);
            expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
                @Override
                public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

                    final String selected = (String) expandableListAdapter.getChild(groupPosition, childPosition);

                    Toast.makeText(getBaseContext(),selected,Toast.LENGTH_LONG).show();
                    return true;
                }
            });

//
//           ListView listView = (ListView) findViewById(R.id.listViewInfo);
//            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
//                    android.R.layout.simple_list_item_1,dirArray);
//
//            listView.setAdapter(adapter);




            //work
//            final ArrayList<HashMap<String,String>> dataList = db.ShowAllData();
//            ListView listView = (ListView)findViewById(R.id.listViewInfo);
//            SimpleAdapter adt = new SimpleAdapter(ConversationActivity.this,dataList,R.layout.showitemdb_custom,
//                    new String[]{"wordFrom","wordEN"},new int[]{R.id.mainWord,R.id.subWord});
//            listView.setAdapter(adt);


            /////

//            listView.setOnItemClickListener(new OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                    Intent intent;
//                    intent = new Intent(getApplicationContext(),ShowDataActivity.class);
//
//                    //Send data
//
//                    intent.putExtra("strLangFrom",lang_from);
//                    intent.putExtra("strLangTo",lang_to);
//
//                    String wordFrom = ((TextView)view.findViewById(R.id.txtWordFrom)).getText().toString();
//                    intent.putExtra("wordFrom",wordFrom);
//                    String wordTo = ((TextView)view.findViewById(R.id.txtWordTo)).getText().toString();
//                    intent.putExtra("wordTo",wordTo);
//                    String wordEN =((TextView)view.findViewById(R.id.txtWordEN)).getText().toString();
//                    intent.putExtra("wordEN",wordEN);
//                    String karaokeEN = ((TextView)view.findViewById(R.id.txtKaraokeEN)).getText().toString();
//                    intent.putExtra("karaokeEN",karaokeEN);
//                    String karaokeTH =((TextView)view.findViewById(R.id.txtKaraokeTH)).getText().toString();
//                    intent.putExtra("karaokeTH",karaokeTH);
//
//
//                    startActivity(intent);
//
//                }
//            });listView.setOnItemClickListener(new OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                    Intent intent;
//                    intent = new Intent(getApplicationContext(),ShowDataActivity.class);
//
//                    //Send data
//
//                    intent.putExtra("strLangFrom",lang_from);
//                    intent.putExtra("strLangTo",lang_to);
//
//                    String wordFrom = ((TextView)view.findViewById(R.id.txtWordFrom)).getText().toString();
//                    intent.putExtra("wordFrom",wordFrom);
//                    String wordTo = ((TextView)view.findViewById(R.id.txtWordTo)).getText().toString();
//                    intent.putExtra("wordTo",wordTo);
//                    String wordEN =((TextView)view.findViewById(R.id.txtWordEN)).getText().toString();
//                    intent.putExtra("wordEN",wordEN);
//                    String karaokeEN = ((TextView)view.findViewById(R.id.txtKaraokeEN)).getText().toString();
//                    intent.putExtra("karaokeEN",karaokeEN);
//                    String karaokeTH =((TextView)view.findViewById(R.id.txtKaraokeTH)).getText().toString();
//                    intent.putExtra("karaokeTH",karaokeTH);
//
//
//                    startActivity(intent);
//
//                }
//            });listView.setOnItemClickListener(new OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                    Intent intent;
//                    intent = new Intent(getApplicationContext(),ShowDataActivity.class);
//
//                    //Send data
//
//                    intent.putExtra("strLangFrom",lang_from);
//                    intent.putExtra("strLangTo",lang_to);
//
//                    String wordFrom = ((TextView)view.findViewById(R.id.txtWordFrom)).getText().toString();
//                    intent.putExtra("wordFrom",wordFrom);
//                    String wordTo = ((TextView)view.findViewById(R.id.txtWordTo)).getText().toString();
//                    intent.putExtra("wordTo",wordTo);
//                    String wordEN =((TextView)view.findViewById(R.id.txtWordEN)).getText().toString();
//                    intent.putExtra("wordEN",wordEN);
//                    String karaokeEN = ((TextView)view.findViewById(R.id.txtKaraokeEN)).getText().toString();
//                    intent.putExtra("karaokeEN",karaokeEN);
//                    String karaokeTH =((TextView)view.findViewById(R.id.txtKaraokeTH)).getText().toString();
//                    intent.putExtra("karaokeTH",karaokeTH);
//
//
//                    startActivity(intent);
//
//                }
//            });


//            listView.setOnItemClickListener(new OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
//                    String strWordFrom = dataList.get(arg2).get("wordFrom").toString();
//                    String strWordEN = dataList.get(arg2).get("wordEN").toString();
//                    cursor.moveToPosition(arg2);
//                    final Dialog dialog;
//                    dialog = new Dialog(ConversationActivity.this);
//
//                   // AlertDialog dialog = new AlertDialog.Builder(context).create();
//                    dialog.setTitle("Detail");
//
//                    dialog.setContentView(R.layout.dialog_data);
//
//                    TextView txtLangFrom = (TextView) dialog.findViewById(R.id.txtLangFrom);
//                    txtLangFrom.setText(cursor.getString(cursor.getColumnIndex(Database.COLUMN_LANGFROM)));
//
//                    TextView txtWordFrom = (TextView) dialog.findViewById(R.id.txtWordFrom);
//                    txtWordFrom.setText(":" + cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDFROM)));
//
//                    TextView txtLangTo = (TextView) dialog.findViewById(R.id.txtLangTo);
//                    txtLangTo.setText(cursor.getString(cursor.getColumnIndex(Database.COLUMN_LANGTO)));
//
//
//                    TextView txtWordTo = (TextView) dialog.findViewById(R.id.txtWordTo);
//                    txtWordTo.setText(":" + cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDTO)));
//
//
//                    TextView txtKaraokeTH = (TextView) dialog.findViewById(R.id.txtKaraokeTH);
//                    txtKaraokeTH.setText(":" + cursor.getString(cursor.getColumnIndex(Database.COLUMN_KARAOKETH)));
//
//
//                    TextView txtKaraokeEN = (TextView) dialog.findViewById(R.id.txtKaraokeEN);
//                    txtKaraokeEN.setText(":" + cursor.getString(cursor.getColumnIndex(Database.COLUMN_KARAOKEEN)));
//
//
//
//                    //Back btn
//                    Button btnBack = (Button) dialog.findViewById(R.id.btnSound);
//                    btnBack.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            dialog.cancel();
//                        }
//                    });
//
//
//                    dialog.show();
//                }
//            });


        } else {
            Intent intent;
            intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    }











    //pass

    private void createGroupList() {
        groupList = new ArrayList<String>();
        groupList.add("TEST");

//        final ArrayList<HashMap<String,String>> dataList = db.ShowAllData();
//            ListView listView = (ListView)findViewById(R.id.groupListview);
//            SimpleAdapter adt = new SimpleAdapter(ConversationActivity.this,dataList,R.layout.showitemdb_custom,
//                    new String[]{"wordFrom","wordEN"},new int[]{R.id.mainWord,R.id.subWord});
//            listView.setAdapter(adt);
    }

    //How to?
    private void createCollection() {

//        final ArrayList<HashMap<String,String>> dataList = db.ShowAllData();
//        listMap = new LinkedHashMap<String, List<String>>();
//        TextView wordFrom = (TextView) findViewById(R.id.wordFrom);
//        TextView wordTo = (TextView) findViewById(R.id.wordEN);
       String[] testModel = {"test1","test2","test3"};
        listMap = new LinkedHashMap<String, List<String>>();
        for(String group: groupList){
            if(group.equals("TEST")){
                loadChild(testModel);
            }
            else {
            }

            listMap.put(group,childList);
        }
    }
    private void loadChild(String[] groupModel){
        childList = new ArrayList<String>();
        for(String model: groupModel)
            childList.add(model);
    }
    private void setGroupIndicatorToRight() {
        /* Get the screen width */
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;

        expListView.setIndicatorBounds(width - getDipsFromPixel(60), width
                - getDipsFromPixel(5));
    }

    // Convert pixel to dip
    public int getDipsFromPixel(float pixels) {
        // Get the screen's density scale
        final float scale = getResources().getDisplayMetrics().density;
        // Convert the dps to pixels, based on density scale
        return (int) (pixels * scale + 0.5f);
    }



    private void initWidget() {
        countryFrom = (Spinner) findViewById(R.id.spinner_show);

        countryTo = (Spinner) findViewById(R.id.spinner2_show);

    }

    public void onPause() {
        super.onPause();
        db.close();
        sqLiteDatabase.close();
    }


@Override
public boolean onCreateOptionsMenu(Menu menu) {
    MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.activity_main_actions, menu);
    return true;
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
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}





