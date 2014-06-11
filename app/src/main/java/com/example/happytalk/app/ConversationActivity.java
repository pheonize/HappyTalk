package com.example.happytalk.app;

/**
 * Created by oVANILLAz on 5/21/14 AD.
 */

import android.app.ActionBar;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.provider.SearchRecentSuggestions;
import android.util.Log;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ExpandableListView;

import android.widget.MediaController;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.VideoView;


import com.example.happytalk.app.Database.ConversationDAL;
import com.example.happytalk.app.Database.Database;

import java.util.ArrayList;


public class ConversationActivity extends Activity {


    //DB
    private static Database db;
    SQLiteDatabase sqLiteDatabase;
    Context context;
    Button btnSound;
    String langTo, langFrom;
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

    private Spinner countryFrom, countryTo;
    private String strCountryFrom, strCountryTo;
    private ArrayList<Parent> parents;

    //Last version
    private SearchView search;
    private MyListAdapter listAdapter;
    private ExpandableListView myList;
    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();

    private ConversationDAL loadWording;

    private VideoView videoView;
    private MediaController mediaPlayer;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.conversation);


        Configuration configuration = new Configuration();

        getResources().updateConfiguration(configuration, null);

        initWidget();
//        search();
        //searchWidget();

        checkLanguage();

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


        // if (lang_from.equals("Thai") && lang_to.equals("Brunei") || lang_from.equals("ไทย") && lang_to.equals("บรูไน")) {

        //display list
        // displayList();
        //expand all group
        //expandAll();


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


//        } else {
//            Intent intent;
//            intent = new Intent(getApplicationContext(), MainActivity.class);
//            startActivity(intent);
//        }
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
            TextView langFrom = (TextView) findViewById(R.id.txtLangFrom);
            langFrom.setText(lang_from);


        }

        String lang_to = extras.getString("strCountryTo", "");
        if (lang_to != null) {
            //Do something
            Log.d("--Conservation_TO", lang_to);
            TextView langTo = (TextView) findViewById(R.id.txtLangTo);
            langTo.setText(lang_to);

        }
        displayList(lang_from, lang_to);
    }


    //method to expand all group
    public void displayList(String lang_from, String lang_to) {


        if (lang_from.equals("Thai") && lang_to.equals("Brunei") || lang_from.equals("ไทย") && lang_to.equals("บรูไน")) {

            //display the list
            // loadThaiToBrunei();
            loadWording = new ConversationDAL();
            loadWording.loadThaiToBrunei();


            //get ref to the expandableListView
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);


        }

        if (lang_from.equals("Thai") && lang_to.equals("China") || lang_from.equals("ไทย") && lang_to.equals("จีน")) {
            loadWording = new ConversationDAL();
            loadWording.loadThaiToChina();
            //get ref to the expandableListView
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);


//            videoView =(VideoView)findViewById(R.id.sound);
//            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" +R.raw.sound);
//
//            mediaPlayer = new MediaController(this);
//            videoView.setMediaController(mediaPlayer);
//            videoView.setVideoURI(uri);
//            videoView.start();


        }
        if (lang_from.equals("Thai") && lang_to.equals("Thai") || lang_from.equals("ไทย") && lang_to.equals("ไทย")) {
            loadWording = new ConversationDAL();
            loadWording.loadThaiToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Cambodia") || lang_from.equals("ไทย") && lang_to.equals("กัมพูชา")) {
            loadWording = new ConversationDAL();
            loadWording.loadThaiToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }
        if (lang_from.equals("Thai") && lang_to.equals("Indonesia") || lang_from.equals("ไทย") && lang_to.equals("อินโดนีเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadThaiToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }
        if (lang_from.equals("Thai") && lang_to.equals("Laos") || lang_from.equals("ไทย") && lang_to.equals("ลาว")) {
            loadWording = new ConversationDAL();
            loadWording.loadThaiToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Malaysia") || lang_from.equals("ไทย") && lang_to.equals("มาเลเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadThaiToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }
        if (lang_from.equals("Thai") && lang_to.equals("Myanmar") || lang_from.equals("ไทย") && lang_to.equals("พม่า")) {
            loadWording = new ConversationDAL();
            loadWording.loadThaiToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Philippines") || lang_from.equals("ไทย") && lang_to.equals("ฟิลิปปินส์")) {
            loadWording = new ConversationDAL();
            loadWording.loadThaiToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Singapore") || lang_from.equals("ไทย") && lang_to.equals("สิงคโปร์")) {
            loadWording = new ConversationDAL();
            loadWording.loadThaiToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Vietnam") || lang_from.equals("ไทย") && lang_to.equals("เวียดนาม")) {
            loadWording = new ConversationDAL();
            loadWording.loadThaiToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("China") || lang_from.equals("บรูไน") && lang_to.equals("จีน")) {
            loadWording = new ConversationDAL();
            loadWording.loadBruneiToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Thai") || lang_from.equals("บรูไน") && lang_to.equals("ไทย")) {
            loadWording = new ConversationDAL();
            loadWording.loadBruneiToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Brunei") || lang_from.equals("บรูไน") && lang_to.equals("บรูไน")) {
            loadWording = new ConversationDAL();
            loadWording.loadBruneiToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Cambodia") || lang_from.equals("บรูไน") && lang_to.equals("กัมพูชา")) {
            loadWording = new ConversationDAL();
            loadWording.loadBruneiToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Indonesia") || lang_from.equals("บรูไน") && lang_to.equals("อินโดนีเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadBruneiToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Laos") || lang_from.equals("บรูไน") && lang_to.equals("ลาว")) {
            loadWording = new ConversationDAL();
            loadWording.loadBruneiToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Brunei") && lang_to.equals("Malaysia") || lang_from.equals("บรูไน") && lang_to.equals("มาเลเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadBruneiToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Myanmar") || lang_from.equals("บรูไน") && lang_to.equals("พม่า")) {
            loadWording = new ConversationDAL();
            loadWording.loadBruneiToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Philippines") || lang_from.equals("บรูไน") && lang_to.equals("ฟิลิปปินส์")) {
            loadWording = new ConversationDAL();
            loadWording.loadBruneiToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Singapore") || lang_from.equals("บรูไน") && lang_to.equals("สิงคโปร์")) {
            loadWording = new ConversationDAL();
            loadWording.loadBruneiToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Vietnam") || lang_from.equals("บรูไน") && lang_to.equals("เวียดนาม")) {
            loadWording = new ConversationDAL();
            loadWording.loadBruneiToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("China") || lang_from.equals("กัมพูชา") && lang_to.equals("จีน")) {
            loadWording = new ConversationDAL();
            loadWording.loadCambodiaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Thai") || lang_from.equals("กัมพูชา") && lang_to.equals("ไทย")) {
            loadWording = new ConversationDAL();
            loadWording.loadCambodiaToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Brunei") || lang_from.equals("กัมพูชา") && lang_to.equals("บรูไน")) {
            loadWording = new ConversationDAL();
            loadWording.loadCambodiaToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Cambodia") || lang_from.equals("กัมพูชา") && lang_to.equals("กัมพูชา")) {
            loadWording = new ConversationDAL();
            loadWording.loadCambodiaToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Indonesia") || lang_from.equals("กัมพูชา") && lang_to.equals("อินโดนีเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadCambodiaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Indonesia") || lang_from.equals("กัมพูชา") && lang_to.equals("อินโดนีเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadCambodiaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Laos") || lang_from.equals("กัมพูชา") && lang_to.equals("ลาว")) {
            loadWording = new ConversationDAL();
            loadWording.loadCambodiaToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Malaysia") || lang_from.equals("กัมพูชา") && lang_to.equals("มาเลเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadCambodiaToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Myanmar") || lang_from.equals("กัมพูชา") && lang_to.equals("พม่า")) {
            loadWording = new ConversationDAL();
            loadWording.loadCambodiaToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Cambodia") && lang_to.equals("Philippines") || lang_from.equals("กัมพูชา") && lang_to.equals("ฟิลิปปินส์")) {
            loadWording = new ConversationDAL();
            loadWording.loadCambodiaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Singapore") || lang_from.equals("กัมพูชา") && lang_to.equals("สิงคโปร์")) {
            loadWording = new ConversationDAL();
            loadWording.loadCambodiaToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Vietnam") || lang_from.equals("กัมพูชา") && lang_to.equals("เวียดนาม")) {
            loadWording = new ConversationDAL();
            loadWording.loadCambodiaToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("China") || lang_from.equals("จีน") && lang_to.equals("จีน")) {
            loadWording = new ConversationDAL();
            loadWording.loadChinaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Thai") || lang_from.equals("จีน") && lang_to.equals("ไทย")) {
            loadWording = new ConversationDAL();
            loadWording.loadChinaToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Brunei") || lang_from.equals("จีน") && lang_to.equals("บรูไน")) {
            loadWording = new ConversationDAL();
            loadWording.loadChinaToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Cambodia") || lang_from.equals("จีน") && lang_to.equals("กัมพูชา")) {
            loadWording = new ConversationDAL();
            loadWording.loadChinaToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Indonesia") || lang_from.equals("จีน") && lang_to.equals("อินโดเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadChinaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Laos") || lang_from.equals("จีน") && lang_to.equals("ลาว")) {
            loadWording = new ConversationDAL();
            loadWording.loadChinaToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Malaysia") || lang_from.equals("จีน") && lang_to.equals("มาเลเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadChinaToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Myanmar") || lang_from.equals("จีน") && lang_to.equals("พม่า")) {
            loadWording = new ConversationDAL();
            loadWording.loadChinaToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Philippines") || lang_from.equals("จีน") && lang_to.equals("ฟิลิปปินส์")) {
            loadWording = new ConversationDAL();
            loadWording.loadChinaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Singapore") || lang_from.equals("จีน") && lang_to.equals("สิงคโปร์")) {
            loadWording = new ConversationDAL();
            loadWording.loadChinaToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Vietnam") || lang_from.equals("จีน") && lang_to.equals("เวียดนาม")) {
            loadWording = new ConversationDAL();
            loadWording.loadChinaToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("China") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("จีน")) {
            loadWording = new ConversationDAL();
            loadWording.loadIndonesiaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Thai") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ไทย")) {
            loadWording = new ConversationDAL();
            loadWording.loadIndonesiaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Thai") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ไทย")) {
            loadWording = new ConversationDAL();
            loadWording.loadIndonesiaToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Brunei") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("บรูไน")) {
            loadWording = new ConversationDAL();
            loadWording.loadIndonesiaToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Cambodia") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("กัมพูชา")) {
            loadWording = new ConversationDAL();
            loadWording.loadIndonesiaToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Indonesia") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("อินโดนีเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadIndonesiaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Laos") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ลาว")) {
            loadWording = new ConversationDAL();
            loadWording.loadIndonesiaToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Malaysia") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("มาเลเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadIndonesiaToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Myanmar") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("พม่า")) {
            loadWording = new ConversationDAL();
            loadWording.loadIndonesiaToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Philippines") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ฟิลิปปินส์")) {
            loadWording = new ConversationDAL();
            loadWording.loadIndonesiaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Singapore") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("สิงคโปร")) {
            loadWording = new ConversationDAL();
            loadWording.loadIndonesiaToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Vietnam") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("เวียดนาม")) {
            loadWording = new ConversationDAL();
            loadWording.loadIndonesiaToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("China") || lang_from.equals("ลาว") && lang_to.equals("จีน")) {
            loadWording = new ConversationDAL();
            loadWording.loadLaosToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Thai") || lang_from.equals("ลาว") && lang_to.equals("ไทย")) {
            loadWording = new ConversationDAL();
            loadWording.loadLaosToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Brunei") || lang_from.equals("ลาว") && lang_to.equals("บรูไน")) {
            loadWording = new ConversationDAL();
            loadWording.loadLaosToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Cambodia") || lang_from.equals("ลาว") && lang_to.equals("กัมพูชา")) {
            loadWording = new ConversationDAL();
            loadWording.loadLaosToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Indonesia") || lang_from.equals("ลาว") && lang_to.equals("อินโดนีเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadLaosToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Laos") || lang_from.equals("ลาว") && lang_to.equals("ลาว")) {
            loadWording = new ConversationDAL();
            loadWording.loadLaosToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Malaysia") || lang_from.equals("ลาว") && lang_to.equals("มาเลเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadLaosToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Myanmar") || lang_from.equals("ลาว") && lang_to.equals("พม่า")) {
            loadWording = new ConversationDAL();
            loadWording.loadLaosToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Laos") && lang_to.equals("Philippines") || lang_from.equals("ลาว") && lang_to.equals("ฟิลิปปินส์")) {
            loadWording = new ConversationDAL();
            loadWording.loadLaosToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Singapore") || lang_from.equals("ลาว") && lang_to.equals("สิงคโปร์")) {
            loadWording = new ConversationDAL();
            loadWording.loadLaosToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Vietnam") || lang_from.equals("ลาว") && lang_to.equals("เวียดนาม")) {
            loadWording = new ConversationDAL();
            loadWording.loadLaosToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("China") || lang_from.equals("มาเลเซีย") && lang_to.equals("จีน")) {
            loadWording = new ConversationDAL();
            loadWording.loadMalaysiaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Thai") || lang_from.equals("มาเลเซีย") && lang_to.equals("ไทย")) {
            loadWording = new ConversationDAL();
            loadWording.loadMalaysiaToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Brunei") || lang_from.equals("มาเลเซีย") && lang_to.equals("บรูไน")) {
            loadWording = new ConversationDAL();
            loadWording.loadMalaysiaToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Cambodia") || lang_from.equals("มาเลเซีย") && lang_to.equals("กัมพูชา")) {
            loadWording = new ConversationDAL();
            loadWording.loadMalaysiaToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Indonesia") || lang_from.equals("มาเลเซีย") && lang_to.equals("อินโดนีเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadMalaysiaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Laos") || lang_from.equals("มาเลเซีย") && lang_to.equals("ลาว")) {
            loadWording = new ConversationDAL();
            loadWording.loadMalaysiaToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Malaysia") || lang_from.equals("มาเลเซีย") && lang_to.equals("มาเลเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadMalaysiaToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Myanmar") || lang_from.equals("มาเลเซีย") && lang_to.equals("พม่า")) {
            loadWording = new ConversationDAL();
            loadWording.loadMalaysiaToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Philippines") || lang_from.equals("มาเลเซีย") && lang_to.equals("ฟิลิปปินส์")) {
            loadWording = new ConversationDAL();
            loadWording.loadMalaysiaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Singapore") || lang_from.equals("มาเลเซีย") && lang_to.equals("สิงคโปร์")) {
            loadWording = new ConversationDAL();
            loadWording.loadMalaysiaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Vietnam") || lang_from.equals("มาเลเซีย") && lang_to.equals("เวียดนาม")) {
            loadWording = new ConversationDAL();
            loadWording.loadMalaysiaToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("China") || lang_from.equals("พม่า") && lang_to.equals("จีน")) {
            loadWording = new ConversationDAL();
            loadWording.loadMyanmarToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Thai") || lang_from.equals("พม่า") && lang_to.equals("ไทย")) {
            loadWording = new ConversationDAL();
            loadWording.loadMyanmarToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Brunei") || lang_from.equals("พม่า") && lang_to.equals("บรูไน")) {
            loadWording = new ConversationDAL();
            loadWording.loadMyanmarToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Brunei") || lang_from.equals("พม่า") && lang_to.equals("บรูไน")) {
            loadWording = new ConversationDAL();
            loadWording.loadMyanmarToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Cambodia") || lang_from.equals("พม่า") && lang_to.equals("กัมพูชา")) {
            loadWording = new ConversationDAL();
            loadWording.loadMyanmarToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Myanmar") && lang_to.equals("Indonesia") || lang_from.equals("พม่า") && lang_to.equals("อินโดนีเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadMyanmarToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Laos") || lang_from.equals("พม่า") && lang_to.equals("ลาว")) {
            loadWording = new ConversationDAL();
            loadWording.loadMyanmarToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Malaysia") || lang_from.equals("พม่า") && lang_to.equals("มาเลเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadMyanmarToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Myanmar") || lang_from.equals("พม่า") && lang_to.equals("พม่า")) {
            loadWording = new ConversationDAL();
            loadWording.loadMyanmarToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Philippines") || lang_from.equals("พม่า") && lang_to.equals("ฟิลิปปินส์")) {
            loadWording = new ConversationDAL();
            loadWording.loadMyanmarToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Myanmar") && lang_to.equals("Singapore") || lang_from.equals("พม่า") && lang_to.equals("สิงคโปร์")) {
            loadWording = new ConversationDAL();
            loadWording.loadMyanmarToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Vietnam") || lang_from.equals("พม่า") && lang_to.equals("เวียดนาม")) {
            loadWording = new ConversationDAL();
            loadWording.loadMyanmarToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("China") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("จีน")) {
            loadWording = new ConversationDAL();
            loadWording.loadPhilippinesToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Thai") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("ไทย")) {
            loadWording = new ConversationDAL();
            loadWording.loadPhilippinesToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Brunei") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("บรูไน")) {
            loadWording = new ConversationDAL();
            loadWording.loadPhilippinesToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Cambodia") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("กัมพูชา")) {
            loadWording = new ConversationDAL();
            loadWording.loadPhilippinesToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Indonesia") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("อินโดนีเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadPhilippinesToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Laos") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("ลาว")) {
            loadWording = new ConversationDAL();
            loadWording.loadPhilippinesToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Malaysia") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("มาเลเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadPhilippinesToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Myanmar") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("พม่า")) {
            loadWording = new ConversationDAL();
            loadWording.loadPhilippinesToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Philippines") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("ฟิลิปปินส์")) {
            loadWording = new ConversationDAL();
            loadWording.loadPhilippinesToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Singapore") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("สิงคโปร์")) {
            loadWording = new ConversationDAL();
            loadWording.loadPhilippinesToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Vietnam") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("เวียดนาม")) {
            loadWording = new ConversationDAL();
            loadWording.loadPhilippinesToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("China") || lang_from.equals("สิงคโปร์") && lang_to.equals("จีน")) {
            loadWording = new ConversationDAL();
            loadWording.loadSingaporeToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Singapore") && lang_to.equals("Thai") || lang_from.equals("สิงคโปร์") && lang_to.equals("ไทย")) {
            loadWording = new ConversationDAL();
            loadWording.loadSingaporeToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Singapore") && lang_to.equals("Brunei") || lang_from.equals("สิงคโปร์") && lang_to.equals("บรูไน")) {
            loadWording = new ConversationDAL();
            loadWording.loadSingaporeToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Cambodia") || lang_from.equals("สิงคโปร์") && lang_to.equals("กัมพูชา")) {
            loadWording = new ConversationDAL();
            loadWording.loadSingaporeToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Indonesia") || lang_from.equals("สิงคโปร์") && lang_to.equals("อินโดนีเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadSingaporeToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Laos") || lang_from.equals("สิงคโปร์") && lang_to.equals("ลาว")) {
            loadWording = new ConversationDAL();
            loadWording.loadSingaporeToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Malaysia") || lang_from.equals("สิงคโปร์") && lang_to.equals("มาเลเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadSingaporeToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Myanmar") || lang_from.equals("สิงคโปร์") && lang_to.equals("พม่า")) {
            loadWording = new ConversationDAL();
            loadWording.loadSingaporeToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Philippines") || lang_from.equals("สิงคโปร์") && lang_to.equals("ฟิลิปปินส์")) {
            loadWording = new ConversationDAL();
            loadWording.loadSingaporeToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Singapore") || lang_from.equals("สิงคโปร์") && lang_to.equals("สิงคโปร์")) {
            loadWording = new ConversationDAL();
            loadWording.loadSingaporeToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Vietnam") || lang_from.equals("สิงคโปร์") && lang_to.equals("เวียดนาม")) {
            loadWording = new ConversationDAL();
            loadWording.loadSingaporeToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("China") || lang_from.equals("เวียดนาม") && lang_to.equals("จีน")) {
            loadWording = new ConversationDAL();
            loadWording.loadVietnamToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Thai") || lang_from.equals("เวียดนาม") && lang_to.equals("ไทย")) {
            loadWording = new ConversationDAL();
            loadWording.loadVietnamToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Brunei") || lang_from.equals("เวียดนาม") && lang_to.equals("บรูไน")) {
            loadWording = new ConversationDAL();
            loadWording.loadVietnamToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Cambodia") || lang_from.equals("เวียดนาม") && lang_to.equals("กัมพูชา")) {
            loadWording = new ConversationDAL();
            loadWording.loadVietnamToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Indonesia") || lang_from.equals("เวียดนาม") && lang_to.equals("อินโดนีเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadVietnamToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Vietnam") && lang_to.equals("Laos") || lang_from.equals("เวียดนาม") && lang_to.equals("ลาว")) {
            loadWording = new ConversationDAL();
            loadWording.loadVietnamToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Malaysia") || lang_from.equals("เวียดนาม") && lang_to.equals("มาเลเซีย")) {
            loadWording = new ConversationDAL();
            loadWording.loadVietnamToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Myanmar") || lang_from.equals("เวียดนาม") && lang_to.equals("พม่า")) {
            loadWording = new ConversationDAL();
            loadWording.loadVietnamToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Philippines") || lang_from.equals("เวียดนาม") && lang_to.equals("ฟิลิปปินส์")) {
            loadWording = new ConversationDAL();
            loadWording.loadVietnamToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Singapore") || lang_from.equals("เวียดนาม") && lang_to.equals("สิงคโปร์")) {
            loadWording = new ConversationDAL();
            loadWording.loadVietnamToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Vietnam") || lang_from.equals("เวียดนาม") && lang_to.equals("เวียดนาม")) {
            loadWording = new ConversationDAL();
            loadWording.loadVietnamToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


    }


    public boolean onQueryTextChange(String newText) {
        myList.setTextFilterEnabled(true);
        if (TextUtils.isEmpty(newText)) {
            myList.clearTextFilter();
        } else {
            myList.setFilterText(newText.toString());
        }
        return true;
    }


    //method expand all groups
    private void expandAll() {
        int count = listAdapter.getGroupCount();
        for (int i = 0; i < count; i++) {
            myList.expandGroup(i);
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
            case R.id.action_search:
                Intent intent;
                intent = new Intent(getApplicationContext(),SearchActivity.class);
                intent.putExtra("strCountryFrom", strCountryFrom);
                intent.putExtra("strCountryTo", strCountryTo);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}







