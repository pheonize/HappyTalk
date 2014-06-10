package com.example.happytalk.app;

/**
 * Created by oVANILLAz on 5/21/14 AD.
 */

import android.app.Fragment;
import android.app.SearchManager;
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

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;

import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;



import com.example.happytalk.app.Database.Database;
import com.example.happytalk.app.Database.DAL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


public class ConversationActivity extends Activity implements SearchView.OnQueryTextListener,SearchView.OnCloseListener {


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
    private  ArrayList<Parent> parents;

    //Last version
    private SearchView search;
    private MyListAdapter listAdapter;
    private ExpandableListView myList;
    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();

    private DAL loadWording;




    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.conversation);





        Configuration configuration = new Configuration();

        getResources().updateConfiguration(configuration,null);

        initWidget();
        search();

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
        displayList(lang_from,lang_to);
    }


    //method to expand all group
    public void displayList(String lang_from,String lang_to) {





        if (lang_from.equals("Thai") && lang_to.equals("Brunei") || lang_from.equals("ไทย") && lang_to.equals("บรูไน")) {

            //display the list
           // loadThaiToBrunei();
            loadWording = new DAL();
            loadWording.loadThaiToBrunei();
            //get ref to the expandableListView
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);


        }

        if(lang_from.equals("Thai") && lang_to.equals("China") || lang_from.equals("ไทย")&&lang_to.equals("จีน")){
            loadWording = new DAL();
            loadWording.loadThaiToChina();
            //get ref to the expandableListView
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);

        }
        if(lang_from.equals("Thai") && lang_to.equals("Thai") || lang_from.equals("ไทย") && lang_to.equals("ไทย")){
            loadWording = new DAL();
            loadWording.loadThaiToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if(lang_from.equals("Thai") && lang_to.equals("Cambodia") || lang_from.equals("ไทย") && lang_to.equals("กัมพูชา") ){
            loadWording = new DAL();
            loadWording.loadThaiToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(ConversationActivity.this, loadWording.getGroupHeaderList());
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

    }


    //method expand all groups
    private void expandAll(){
        int count = listAdapter.getGroupCount();
        for (int i = 0 ;i< count;i++){
            myList.expandGroup(i);
        }
    }

    private void loadThaiToBrunei() {

            ArrayList<Child> childList = new ArrayList<Child>();
            Child child = new Child("Test1", "Test2", "Test3", "Test4", "Test5", null, null);
            childList.add(child);

            GroupHeader groupHeader = new GroupHeader("TEST", "SUB", childList);
            groupHeaderList.add(groupHeader);


    }

    @Override
    public boolean onClose(){
        listAdapter.filterData("");
        expandAll();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String qry) {
        listAdapter.filterData(qry);
        expandAll();
        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String qry) {
        listAdapter.filterData(qry);
        expandAll();
        return false;
    }

    private void search() {
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        search = (SearchView) findViewById(R.id.search);
        search.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        search.setIconifiedByDefault(false);
        search.setOnQueryTextListener(this);
        search.setOnCloseListener(this);

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







