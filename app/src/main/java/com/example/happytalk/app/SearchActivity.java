package com.example.happytalk.app;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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
import java.util.Locale;

/**
 * Created by oVANILLAz on 6/11/14 AD.
 */
public class SearchActivity extends Activity implements SearchView.OnQueryTextListener, SearchView.OnCloseListener {

    private ConversationDAL loadConversation;
    private ThingDAL loadThing;
    private PlaceDAL loadPlace;
    private EmergencyDAL loadEmergency;
    private LogisticDAL loadLogistic;
    private DALconnection daLconnection;

    private MyListAdapter listAdapter;
    private MyListAdapter listAdapter1;
    private ExpandableListView myList;
    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();
    private String strCountryFrom, strCountryTo;

    EditText editSearch;
    private SearchView search;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        checkLanguage();
        initSearch();


    }

//    private void initSearch() {
//        editSearch = (EditText)findViewById(R.id.searchText);
//        editSearch.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable arg0) {
//                String text = editSearch.getText().toString().toLowerCase();
//                listAdapter.filter(text);
//            }
//        });
//
//    }


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

        if (lang_from.equals("Thai") && lang_to.equals("Brunei") || lang_from.equals("ไทย") && lang_to.equals("บรูไน")) {

            //display the list
            // loadThaiToBrunei();
            daLconnection = new DALconnection();
            daLconnection.loadThaiToBrunei();



            //get ref to the expandableListView
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);

            //attach the adapter to the list
            myList.setAdapter(listAdapter);

        }
        if (lang_from.equals("Thai") && lang_to.equals("China") || lang_from.equals("ไทย") && lang_to.equals("จีน")) {
            daLconnection = new DALconnection();
            daLconnection.loadThaiToChina();
            //get ref to the expandableListView
            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);



        }
        if (lang_from.equals("Thai") && lang_to.equals("Thai") || lang_from.equals("ไทย") && lang_to.equals("ไทย")) {
            daLconnection = new DALconnection();
            daLconnection.loadThaiToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Cambodia") || lang_from.equals("ไทย") && lang_to.equals("กัมพูชา")) {
            daLconnection = new DALconnection();
            daLconnection.loadThaiToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }
        if (lang_from.equals("Thai") && lang_to.equals("Indonesia") || lang_from.equals("ไทย") && lang_to.equals("อินโดนีเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadThaiToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }
        if (lang_from.equals("Thai") && lang_to.equals("Laos") || lang_from.equals("ไทย") && lang_to.equals("ลาว")) {
            daLconnection = new DALconnection();
            daLconnection.loadThaiToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Malaysia") || lang_from.equals("ไทย") && lang_to.equals("มาเลเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadThaiToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }
        if (lang_from.equals("Thai") && lang_to.equals("Myanmar") || lang_from.equals("ไทย") && lang_to.equals("พม่า")) {
            daLconnection = new DALconnection();
            daLconnection.loadThaiToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Philippines") || lang_from.equals("ไทย") && lang_to.equals("ฟิลิปปินส์")) {
            daLconnection = new DALconnection();
            daLconnection.loadThaiToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Singapore") || lang_from.equals("ไทย") && lang_to.equals("สิงคโปร์")) {
            daLconnection = new DALconnection();
            daLconnection.loadThaiToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Thai") && lang_to.equals("Vietnam") || lang_from.equals("ไทย") && lang_to.equals("เวียดนาม")) {
            daLconnection = new DALconnection();
            daLconnection.loadThaiToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("China") || lang_from.equals("บรูไน") && lang_to.equals("จีน")) {
            daLconnection = new DALconnection();
            daLconnection.loadBruneiToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Thai") || lang_from.equals("บรูไน") && lang_to.equals("ไทย")) {
            daLconnection = new DALconnection();
            daLconnection.loadBruneiToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Brunei") || lang_from.equals("บรูไน") && lang_to.equals("บรูไน")) {
            daLconnection = new DALconnection();
            daLconnection.loadBruneiToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Cambodia") || lang_from.equals("บรูไน") && lang_to.equals("กัมพูชา")) {
            daLconnection = new DALconnection();
            daLconnection.loadBruneiToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Indonesia") || lang_from.equals("บรูไน") && lang_to.equals("อินโดนีเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadBruneiToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Laos") || lang_from.equals("บรูไน") && lang_to.equals("ลาว")) {
            daLconnection = new DALconnection();
            daLconnection.loadBruneiToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Brunei") && lang_to.equals("Malaysia") || lang_from.equals("บรูไน") && lang_to.equals("มาเลเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadBruneiToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Myanmar") || lang_from.equals("บรูไน") && lang_to.equals("พม่า")) {
            daLconnection = new DALconnection();
            daLconnection.loadBruneiToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Philippines") || lang_from.equals("บรูไน") && lang_to.equals("ฟิลิปปินส์")) {
            daLconnection = new DALconnection();
            daLconnection.loadBruneiToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Singapore") || lang_from.equals("บรูไน") && lang_to.equals("สิงคโปร์")) {
            daLconnection = new DALconnection();
            daLconnection.loadBruneiToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Brunei") && lang_to.equals("Vietnam") || lang_from.equals("บรูไน") && lang_to.equals("เวียดนาม")) {
            daLconnection = new DALconnection();
            daLconnection.loadBruneiToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("China") || lang_from.equals("กัมพูชา") && lang_to.equals("จีน")) {
            daLconnection = new DALconnection();
            daLconnection.loadCambodiaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Thai") || lang_from.equals("กัมพูชา") && lang_to.equals("ไทย")) {
            daLconnection = new DALconnection();
            daLconnection.loadCambodiaToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Brunei") || lang_from.equals("กัมพูชา") && lang_to.equals("บรูไน")) {
            daLconnection = new DALconnection();
            daLconnection.loadCambodiaToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Cambodia") || lang_from.equals("กัมพูชา") && lang_to.equals("กัมพูชา")) {
            daLconnection = new DALconnection();
            daLconnection.loadCambodiaToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Indonesia") || lang_from.equals("กัมพูชา") && lang_to.equals("อินโดนีเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadCambodiaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Indonesia") || lang_from.equals("กัมพูชา") && lang_to.equals("อินโดนีเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadCambodiaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Laos") || lang_from.equals("กัมพูชา") && lang_to.equals("ลาว")) {
            daLconnection = new DALconnection();
            daLconnection.loadCambodiaToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Malaysia") || lang_from.equals("กัมพูชา") && lang_to.equals("มาเลเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadCambodiaToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Myanmar") || lang_from.equals("กัมพูชา") && lang_to.equals("พม่า")) {
            daLconnection = new DALconnection();
            daLconnection.loadCambodiaToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Cambodia") && lang_to.equals("Philippines") || lang_from.equals("กัมพูชา") && lang_to.equals("ฟิลิปปินส์")) {
            daLconnection = new DALconnection();
            daLconnection.loadCambodiaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Singapore") || lang_from.equals("กัมพูชา") && lang_to.equals("สิงคโปร์")) {
            daLconnection = new DALconnection();
            daLconnection.loadCambodiaToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Cambodia") && lang_to.equals("Vietnam") || lang_from.equals("กัมพูชา") && lang_to.equals("เวียดนาม")) {
            daLconnection = new DALconnection();
            daLconnection.loadCambodiaToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("China") || lang_from.equals("จีน") && lang_to.equals("จีน")) {
            daLconnection = new DALconnection();
            daLconnection.loadChinaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Thai") || lang_from.equals("จีน") && lang_to.equals("ไทย")) {
            daLconnection = new DALconnection();
            daLconnection.loadChinaToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Brunei") || lang_from.equals("จีน") && lang_to.equals("บรูไน")) {
            daLconnection = new DALconnection();
            daLconnection.loadChinaToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Cambodia") || lang_from.equals("จีน") && lang_to.equals("กัมพูชา")) {
            daLconnection = new DALconnection();
            daLconnection.loadChinaToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Indonesia") || lang_from.equals("จีน") && lang_to.equals("อินโดเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadChinaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Laos") || lang_from.equals("จีน") && lang_to.equals("ลาว")) {
            daLconnection = new DALconnection();
            daLconnection.loadChinaToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Malaysia") || lang_from.equals("จีน") && lang_to.equals("มาเลเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadChinaToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Myanmar") || lang_from.equals("จีน") && lang_to.equals("พม่า")) {
            daLconnection = new DALconnection();
            daLconnection.loadChinaToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Philippines") || lang_from.equals("จีน") && lang_to.equals("ฟิลิปปินส์")) {
            daLconnection = new DALconnection();
            daLconnection.loadChinaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Singapore") || lang_from.equals("จีน") && lang_to.equals("สิงคโปร์")) {
            daLconnection = new DALconnection();
            daLconnection.loadChinaToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("China") && lang_to.equals("Vietnam") || lang_from.equals("จีน") && lang_to.equals("เวียดนาม")) {
            daLconnection = new DALconnection();
            daLconnection.loadChinaToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("China") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("จีน")) {
            daLconnection = new DALconnection();
            daLconnection.loadIndonesiaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }



        if (lang_from.equals("Indonesia") && lang_to.equals("Thai") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ไทย")) {
            daLconnection = new DALconnection();
            daLconnection.loadIndonesiaToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Brunei") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("บรูไน")) {
            daLconnection = new DALconnection();
            daLconnection.loadIndonesiaToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Cambodia") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("กัมพูชา")) {
            daLconnection = new DALconnection();
            daLconnection.loadIndonesiaToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Indonesia") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("อินโดนีเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadIndonesiaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Laos") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ลาว")) {
            daLconnection = new DALconnection();
            daLconnection.loadIndonesiaToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Malaysia") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("มาเลเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadIndonesiaToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Myanmar") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("พม่า")) {
            daLconnection = new DALconnection();
            daLconnection.loadIndonesiaToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Philippines") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("ฟิลิปปินส์")) {
            daLconnection = new DALconnection();
            daLconnection.loadIndonesiaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Singapore") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("สิงคโปร")) {
            daLconnection = new DALconnection();
            daLconnection.loadIndonesiaToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Indonesia") && lang_to.equals("Vietnam") || lang_from.equals("อินโดนีเซีย") && lang_to.equals("เวียดนาม")) {
            daLconnection = new DALconnection();
            daLconnection.loadIndonesiaToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("China") || lang_from.equals("ลาว") && lang_to.equals("จีน")) {
            daLconnection = new DALconnection();
            daLconnection.loadLaosToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Thai") || lang_from.equals("ลาว") && lang_to.equals("ไทย")) {
            daLconnection = new DALconnection();
            daLconnection.loadLaosToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Brunei") || lang_from.equals("ลาว") && lang_to.equals("บรูไน")) {
            daLconnection = new DALconnection();
            daLconnection.loadLaosToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Cambodia") || lang_from.equals("ลาว") && lang_to.equals("กัมพูชา")) {
            daLconnection = new DALconnection();
            daLconnection.loadLaosToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Indonesia") || lang_from.equals("ลาว") && lang_to.equals("อินโดนีเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadLaosToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Laos") || lang_from.equals("ลาว") && lang_to.equals("ลาว")) {
            daLconnection = new DALconnection();
            daLconnection.loadLaosToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Malaysia") || lang_from.equals("ลาว") && lang_to.equals("มาเลเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadLaosToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Myanmar") || lang_from.equals("ลาว") && lang_to.equals("พม่า")) {
            daLconnection = new DALconnection();
            daLconnection.loadLaosToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Laos") && lang_to.equals("Philippines") || lang_from.equals("ลาว") && lang_to.equals("ฟิลิปปินส์")) {
            daLconnection = new DALconnection();
            daLconnection.loadLaosToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Singapore") || lang_from.equals("ลาว") && lang_to.equals("สิงคโปร์")) {
            daLconnection = new DALconnection();
            daLconnection.loadLaosToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Laos") && lang_to.equals("Vietnam") || lang_from.equals("ลาว") && lang_to.equals("เวียดนาม")) {
            daLconnection = new DALconnection();
            daLconnection.loadLaosToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("China") || lang_from.equals("มาเลเซีย") && lang_to.equals("จีน")) {
            daLconnection = new DALconnection();
            daLconnection.loadMalaysiaToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Thai") || lang_from.equals("มาเลเซีย") && lang_to.equals("ไทย")) {
            daLconnection = new DALconnection();
            daLconnection.loadMalaysiaToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Brunei") || lang_from.equals("มาเลเซีย") && lang_to.equals("บรูไน")) {
            daLconnection = new DALconnection();
            daLconnection.loadMalaysiaToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Cambodia") || lang_from.equals("มาเลเซีย") && lang_to.equals("กัมพูชา")) {
            daLconnection = new DALconnection();
            daLconnection.loadMalaysiaToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Indonesia") || lang_from.equals("มาเลเซีย") && lang_to.equals("อินโดนีเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadMalaysiaToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Laos") || lang_from.equals("มาเลเซีย") && lang_to.equals("ลาว")) {
            daLconnection = new DALconnection();
            daLconnection.loadMalaysiaToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Malaysia") || lang_from.equals("มาเลเซีย") && lang_to.equals("มาเลเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadMalaysiaToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Myanmar") || lang_from.equals("มาเลเซีย") && lang_to.equals("พม่า")) {
            daLconnection = new DALconnection();
            daLconnection.loadMalaysiaToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Philippines") || lang_from.equals("มาเลเซีย") && lang_to.equals("ฟิลิปปินส์")) {
            daLconnection = new DALconnection();
            daLconnection.loadMalaysiaToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Singapore") || lang_from.equals("มาเลเซีย") && lang_to.equals("สิงคโปร์")) {
            daLconnection = new DALconnection();
            daLconnection.loadMalaysiaToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Malaysia") && lang_to.equals("Vietnam") || lang_from.equals("มาเลเซีย") && lang_to.equals("เวียดนาม")) {
            daLconnection = new DALconnection();
            daLconnection.loadMalaysiaToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("China") || lang_from.equals("พม่า") && lang_to.equals("จีน")) {
            daLconnection = new DALconnection();
            daLconnection.loadMyanmarToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Thai") || lang_from.equals("พม่า") && lang_to.equals("ไทย")) {
            daLconnection = new DALconnection();
            daLconnection.loadMyanmarToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Brunei") || lang_from.equals("พม่า") && lang_to.equals("บรูไน")) {
            daLconnection = new DALconnection();
            daLconnection.loadMyanmarToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Myanmar") && lang_to.equals("Cambodia") || lang_from.equals("พม่า") && lang_to.equals("กัมพูชา")) {
            daLconnection = new DALconnection();
            daLconnection.loadMyanmarToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Myanmar") && lang_to.equals("Indonesia") || lang_from.equals("พม่า") && lang_to.equals("อินโดนีเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadMyanmarToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Laos") || lang_from.equals("พม่า") && lang_to.equals("ลาว")) {
            daLconnection = new DALconnection();
            daLconnection.loadMyanmarToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Malaysia") || lang_from.equals("พม่า") && lang_to.equals("มาเลเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadMyanmarToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Myanmar") || lang_from.equals("พม่า") && lang_to.equals("พม่า")) {
            daLconnection = new DALconnection();
            daLconnection.loadMyanmarToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Philippines") || lang_from.equals("พม่า") && lang_to.equals("ฟิลิปปินส์")) {
            daLconnection = new DALconnection();
            daLconnection.loadMyanmarToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Myanmar") && lang_to.equals("Singapore") || lang_from.equals("พม่า") && lang_to.equals("สิงคโปร์")) {
            daLconnection = new DALconnection();
            daLconnection.loadMyanmarToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Myanmar") && lang_to.equals("Vietnam") || lang_from.equals("พม่า") && lang_to.equals("เวียดนาม")) {
            daLconnection = new DALconnection();
            daLconnection.loadMyanmarToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("China") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("จีน")) {
            daLconnection = new DALconnection();
            daLconnection.loadPhilippinesToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Thai") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("ไทย")) {
            daLconnection = new DALconnection();
            daLconnection.loadPhilippinesToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Brunei") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("บรูไน")) {
            daLconnection = new DALconnection();
            daLconnection.loadPhilippinesToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Cambodia") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("กัมพูชา")) {
            daLconnection = new DALconnection();
            daLconnection.loadPhilippinesToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Indonesia") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("อินโดนีเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadPhilippinesToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Laos") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("ลาว")) {
            daLconnection = new DALconnection();
            daLconnection.loadPhilippinesToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Malaysia") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("มาเลเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadPhilippinesToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Myanmar") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("พม่า")) {
            daLconnection = new DALconnection();
            daLconnection.loadPhilippinesToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Philippines") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("ฟิลิปปินส์")) {
            daLconnection = new DALconnection();
            daLconnection.loadPhilippinesToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Singapore") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("สิงคโปร์")) {
            daLconnection = new DALconnection();
            daLconnection.loadPhilippinesToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Philippines") && lang_to.equals("Vietnam") || lang_from.equals("ฟิลิปปินส์") && lang_to.equals("เวียดนาม")) {
            daLconnection = new DALconnection();
            daLconnection.loadPhilippinesToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("China") || lang_from.equals("สิงคโปร์") && lang_to.equals("จีน")) {
            daLconnection = new DALconnection();
            daLconnection.loadSingaporeToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Singapore") && lang_to.equals("Thai") || lang_from.equals("สิงคโปร์") && lang_to.equals("ไทย")) {
            daLconnection = new DALconnection();
            daLconnection.loadSingaporeToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Singapore") && lang_to.equals("Brunei") || lang_from.equals("สิงคโปร์") && lang_to.equals("บรูไน")) {
            daLconnection = new DALconnection();
            daLconnection.loadSingaporeToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Cambodia") || lang_from.equals("สิงคโปร์") && lang_to.equals("กัมพูชา")) {
            daLconnection = new DALconnection();
            daLconnection.loadSingaporeToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Indonesia") || lang_from.equals("สิงคโปร์") && lang_to.equals("อินโดนีเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadSingaporeToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Laos") || lang_from.equals("สิงคโปร์") && lang_to.equals("ลาว")) {
            daLconnection = new DALconnection();
            daLconnection.loadSingaporeToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Malaysia") || lang_from.equals("สิงคโปร์") && lang_to.equals("มาเลเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadSingaporeToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Myanmar") || lang_from.equals("สิงคโปร์") && lang_to.equals("พม่า")) {
            daLconnection = new DALconnection();
            daLconnection.loadSingaporeToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Philippines") || lang_from.equals("สิงคโปร์") && lang_to.equals("ฟิลิปปินส์")) {
            daLconnection = new DALconnection();
            daLconnection.loadSingaporeToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Singapore") || lang_from.equals("สิงคโปร์") && lang_to.equals("สิงคโปร์")) {
            daLconnection = new DALconnection();
            daLconnection.loadSingaporeToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Singapore") && lang_to.equals("Vietnam") || lang_from.equals("สิงคโปร์") && lang_to.equals("เวียดนาม")) {
            daLconnection = new DALconnection();
            daLconnection.loadSingaporeToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("China") || lang_from.equals("เวียดนาม") && lang_to.equals("จีน")) {
            daLconnection = new DALconnection();
            daLconnection.loadVietnamToChina();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Thai") || lang_from.equals("เวียดนาม") && lang_to.equals("ไทย")) {
            daLconnection = new DALconnection();
            daLconnection.loadVietnamToThai();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Brunei") || lang_from.equals("เวียดนาม") && lang_to.equals("บรูไน")) {
            daLconnection = new DALconnection();
            daLconnection.loadVietnamToBrunei();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Cambodia") || lang_from.equals("เวียดนาม") && lang_to.equals("กัมพูชา")) {
            daLconnection = new DALconnection();
            daLconnection.loadVietnamToCambodia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Indonesia") || lang_from.equals("เวียดนาม") && lang_to.equals("อินโดนีเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadVietnamToIndonesia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }


        if (lang_from.equals("Vietnam") && lang_to.equals("Laos") || lang_from.equals("เวียดนาม") && lang_to.equals("ลาว")) {
            daLconnection = new DALconnection();
            daLconnection.loadVietnamToLaos();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Malaysia") || lang_from.equals("เวียดนาม") && lang_to.equals("มาเลเซีย")) {
            daLconnection = new DALconnection();
            daLconnection.loadVietnamToMalaysia();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Myanmar") || lang_from.equals("เวียดนาม") && lang_to.equals("พม่า")) {
            daLconnection = new DALconnection();
            daLconnection.loadVietnamToMyanmar();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Philippines") || lang_from.equals("เวียดนาม") && lang_to.equals("ฟิลิปปินส์")) {
            daLconnection = new DALconnection();
            daLconnection.loadVietnamToPhilippines();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Singapore") || lang_from.equals("เวียดนาม") && lang_to.equals("สิงคโปร์")) {
            daLconnection = new DALconnection();
            daLconnection.loadVietnamToSingapore();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }

        if (lang_from.equals("Vietnam") && lang_to.equals("Vietnam") || lang_from.equals("เวียดนาม") && lang_to.equals("เวียดนาม")) {
            daLconnection = new DALconnection();
            daLconnection.loadVietnamToVietnam();

            myList = (ExpandableListView) findViewById(R.id.groupListview);
            //create the adapter by passing your ArrayList data
            listAdapter = new MyListAdapter(SearchActivity.this, daLconnection.getGroupHeaderList(),lang_from,lang_to);
            //attach the adapter to the list
            myList.setAdapter(listAdapter);
        }







    }
    private void initSearch(){
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        search = (SearchView)findViewById(R.id.searchText);
        search.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        search.setIconifiedByDefault(false);
        search.setOnQueryTextListener(this);
        search.setOnCloseListener((SearchView.OnCloseListener) this);
    }


    public boolean onClose() {
        listAdapter.filterData("");

        return false;
    }

    @Override
    public boolean onQueryTextChange(String query) {
        listAdapter.filterData(query);

        return false;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        listAdapter.filterData(query);

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
