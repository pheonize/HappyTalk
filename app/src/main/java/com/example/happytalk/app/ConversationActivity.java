package com.example.happytalk.app;

/**
 * Created by oVANILLAz on 5/21/14 AD.
 */

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import android.widget.SearchView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.TextView;


import com.example.happytalk.app.Database.Database;

import java.util.ArrayList;
import java.util.HashMap;


public class ConversationActivity extends Activity {


    //DB
    private static Database db;
    SQLiteDatabase sqLiteDatabase;
    private Cursor cursor;
    Context context;
    private MediaPlayer mediaPlayer;

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






        if (lang_from.equals("Thai") && lang_to.equals("Brunei")) {
//
//           ListView listView = (ListView) findViewById(R.id.listViewInfo);
//            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
//                    android.R.layout.simple_list_item_1,dirArray);
//
//            listView.setAdapter(adapter);
            final ArrayList<HashMap<String,String>> dataList = db.ShowAllData();
            ListView listView = (ListView)findViewById(R.id.listViewInfo);
            SimpleAdapter adt = new SimpleAdapter(ConversationActivity.this,dataList,R.layout.showitemdb_custom,
                    new String[]{"wordFrom","wordEN"},new int[]{R.id.mainWord,R.id.subWord});
            listView.setAdapter(adt);

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

    private void showDetail() {
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

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        // Associate searchable configuration with the SearchView
//
//        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
//        SearchView searchView = (SearchView) menu.findItem(R.id.action_search)
//                .getActionView();
//        searchView.setSearchableInfo(searchManager
//                .getSearchableInfo(getComponentName()));
//
//        return super.onCreateOptionsMenu(menu);
//
//
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        switch (item.getItemId()) {
//            case R.id.action_settings:
//                Setting();
//                return true;
//
//        }
//        return super.onOptionsItemSelected(item);
//    }
//
//    private void Setting() {
//        Intent intent ;
//        intent= new Intent(getApplicationContext(), SettingActivity.class);
//        startActivity(intent);
//
//    }


    //Play sound

//    @Override
//    public void onCompletion(MediaPlayer mp) {
//        mediaPlayer.release();
//        mediaPlayer = null;
//       btnSound.setText("Play");
//    }
//
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        if (mediaPlayer != null) {
//            mediaPlayer.release();
//            mediaPlayer = null;
//        }
//    }
}





