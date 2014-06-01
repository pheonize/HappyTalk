package com.example.happytalk.app;

/**
 * Created by oVANILLAz on 5/21/14 AD.
 */

import android.app.Dialog;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;

import android.widget.ResourceCursorAdapter;
import android.widget.SearchView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TwoLineListItem;


import java.util.ArrayList;
import java.util.HashMap;


public class ConversationActivity extends Activity {


    //DB
    private static Database db;
    SQLiteDatabase sqLiteDatabase;
    private Cursor cursor;

//    String[] from = new String[]{Database.COLUMN_WORDFROM,Database.COLUMN_WORDTO};
//    int[] to =new int[]{R.id.mainWord,R.id.subWord};


    String[] country_list = {"Brunei", "Cambodia", "China", "Indonesia",
            "Laos", "Malaysia", "Myanmar", "Philippines", "Singapore",
            "Thai", "Vietnam"};
    Integer[] img = {R.drawable.brunei_flag, R.drawable.cambodia_flag,
            R.drawable.china_flag, R.drawable.indonesia_flag,
            R.drawable.laos_flag, R.drawable.malaysia,
            R.drawable.myanmar_flag, R.drawable.philippines_flag,
            R.drawable.singapore_flag, R.drawable.thailand_flag,
            R.drawable.vietnam_flag};

    private Spinner countryFrom, countryTo;
    private String strCountryFrom, strCountryTo;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.conversation);

        initWidget();

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

        //Spinner

        Spinner countryFrom = (Spinner) findViewById(R.id.spinner_show);
        countryFrom.setAdapter(new MyCustomAdapter(ConversationActivity.this, R.layout.spinner_row, country_list, img));
        countryFrom.setOnItemSelectedListener(new MyOnItemSelectedListener());

        Spinner countryTo = (Spinner) findViewById(R.id.spinner2_show);
        countryTo.setAdapter(new MyCustomAdapter(ConversationActivity.this, R.layout.spinner_row, country_list, img));
        countryTo.setOnItemSelectedListener(new MyOnItemSelectedListener());


//        //custom icon
//        int[] array_res = getImageArray(R.array.image_array
//                , R.drawable.ic_launcher);
//        String[] array_string = getStringArray(R.array.string_array);
//        //


        //DB

        db = new Database(this);

        sqLiteDatabase = db.getWritableDatabase();



        cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + Database.TABLE_CONVERSATION, null);
//
//
//        ArrayList<String> dirArray = new ArrayList<String>();

//        cursor = sqLiteDatabase.rawQuery("SELECT " + Database.COLUMN_WORDFROM + "," + Database.COLUMN_WORDTO
//                + " FROM " +Database.TABLE_CONVERSATION , null);

        ArrayList<String> dataArray = new ArrayList<String>();

        cursor.moveToFirst();
        while ( !cursor.isAfterLast() ){
            dataArray.add(cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDFROM)) + "\n"
                    + "" + cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDTO)));
            cursor.moveToNext();
        }





//        cursor.moveToFirst();
//        while (!cursor.isAfterLast()) {
//            dirArray.add(cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDFROM)));
//            //dirArray.add(cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDTO)));
//            cursor.moveToNext();
//        }




        if (lang_from.equals("Thai") && lang_to.equals("Brunei")) {
//        final ListView lv = getListView();
//            lv.setAdapter(listAdapter);


//           ListView listView = (ListView) findViewById(R.id.listViewInfo);
//           listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, dirArray));

            ListView dataList = (ListView) findViewById(R.id.listViewInfo);
            ArrayAdapter<String> adapterDir = new ArrayAdapter<String>(getApplicationContext()
                    , android.R.layout.simple_list_item_1, dataArray);
            dataList.setAdapter(adapterDir);


            dataList.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                    cursor.moveToPosition(arg2);

                    final Dialog dialog;
                    dialog = new Dialog(ConversationActivity.this);
                    dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
                    dialog.setContentView(R.layout.dialog_data);

                    TextView txtLangFrom = (TextView) dialog.findViewById(R.id.txtLangFrom);
                    txtLangFrom.setText(cursor.getString(cursor.getColumnIndex(Database.COLUMN_LANGFROM)));

                    TextView txtWordFrom = (TextView) dialog.findViewById(R.id.txtWordFrom);
                    txtWordFrom.setText(":" + cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDFROM)));

                    TextView txtLangTo = (TextView) dialog.findViewById(R.id.txtLangTo);
                    txtLangTo.setText(cursor.getString(cursor.getColumnIndex(Database.COLUMN_LANGTO)));


                    TextView txtWordTo = (TextView) dialog.findViewById(R.id.txtWordTo);
                    txtWordTo.setText(":" + cursor.getString(cursor.getColumnIndex(Database.COLUMN_WORDTO)));


                    TextView txtKaraokeTH = (TextView) dialog.findViewById(R.id.txtKaraokeTH);
                    txtKaraokeTH.setText(":" + cursor.getString(cursor.getColumnIndex(Database.COLUMN_KARAOKETH)));


                    TextView txtKaraokeEN = (TextView) dialog.findViewById(R.id.txtKaraokeEN);
                    txtKaraokeEN.setText(":" + cursor.getString(cursor.getColumnIndex(Database.COLUMN_KARAOKEEN)));


                    //Back btn
//                    Button btnBack = (Button) dialog.findViewById(R.id.btnBack);
//                    btnBack.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            dialog.cancel();
//                        }
//                    });

                    dialog.show();

                }
            });


        } else {
            Intent intent;
            intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }


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

    public int[] getImageArray(int resId, int defResId) {
        TypedArray my_image_array = getResources().obtainTypedArray(resId);
        int[] array_res = new int[my_image_array.length()];
        for (int i = 0; i < array_res.length; i++)
            array_res[i] = my_image_array.getResourceId(i, defResId);
        my_image_array.recycle();
        return array_res;
    }

    public String[] getStringArray(int resId) {
        TypedArray my_string_array = getResources().obtainTypedArray(resId);
        String[] array_string = new String[my_string_array.length()];
        for (int i = 0; i < array_string.length; i++)
            array_string[i] = my_string_array.getString(i);
        my_string_array.recycle();
        return array_string;
    }



    //custom listview
//    private class MyListAdapter extends ResourceCursorAdapter{
//        public MyListAdapter(Context context,int layout,Cursor cursor){
//            super(context,layout,cursor);
//        }
//
//        @Override
//        public void bindView(View view,Context context,Cursor cursor){
//            TextView mainWord = (TextView) view.findViewById(R.id.mainWord);
//            mainWord.setText(cursor.getString(cursor.getColumnIndexOrThrow(Database.COLUMN_WORDFROM)));
//
//            TextView subWord = (TextView) view.findViewById(R.id.mainWord);
//            subWord.setText(cursor.getString(cursor.getColumnIndexOrThrow(Database.COLUMN_WORDTO)));
//
//        }
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.activity_main_actions, menu);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main_actions, menu);


        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search)
                .getActionView();
        searchView.setSearchableInfo(searchManager
                .getSearchableInfo(getComponentName()));

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.action_search:
                //Search();
                return true;
            case R.id.action_settings:
                Setting();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    private void Setting() {
        Intent intent;
        intent = new Intent(getApplicationContext(), SettingActivity.class);
        startActivity(intent);
    }



    //spinner
    public class MyCustomAdapter extends ArrayAdapter<String> {

        public MyCustomAdapter(Context context, int textViewResourceId, String[] objects, Integer[] img) {
            super(context, textViewResourceId, objects);
        }

        @Override
        public View getDropDownView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return getCustomView(position, convertView, parent);
        }

        public View getCustomView(int position, View convertView, ViewGroup parent) {
            //return super.getView(position,convertView,parent);

            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.spinner_row, parent, false);
            TextView label = (TextView) row.findViewById(R.id.country);
            label.setText(country_list[position]);

            ImageView icon = (ImageView) row.findViewById(R.id.flag);
            icon.setImageResource(img[position]);
            return row;
        }

    }

    //print
    public class MyOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {



            switch (parent.getId()) {
                case R.id.spinner_show:

                    strCountryFrom = String.valueOf(countryFrom.getSelectedItem());

                    break;

                case R.id.spinner2_show:
                    strCountryTo = String.valueOf(countryTo.getSelectedItem());

                    break;

                default:
                    break;

            }
            //Log.d("country:",parent.getItemAtPosition(pos).toString());

        }

        public void onNothingSelected(AdapterView parent) {
            // Do nothing.
        }

    }
}





