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


//    ExpandableListAdapter listAdapter;
//    ExpandableListView expandableListView;
//    List<String> listDataHeader;
//    HashMap<String,List<String>> listDataChild;



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

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.conversation);





        Configuration configuration = new Configuration();

        getResources().updateConfiguration(configuration,null);

        initWidget();
        search();




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

            //display list
            displayList();
            //expand all group
            expandAll();


//          //  ListView listView = (ListView) findViewById(R.id.groupListview);
//            expandableListView = (ExpandableListView) findViewById(R.id.groupListview);
//
//            prepareListData();
//
//            listAdapter = new ExpandableListAdapter(this,listDataHeader,listDataChild);
//
//            expandableListView.setAdapter(listAdapter);
//
//            //Listview Group clcik listener
//            expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
//                @Override
//                public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
//
//                    return false;
//                }
//            });
//
//            //listview group extend
//            expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
//                @Override
//                public void onGroupExpand(int groupPosition) {
//
//                }
//            });
//
//            //Listview group collasped listener
//            expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
//                @Override
//                public void onGroupCollapse(int groupPosition) {
//
//                }
//            });
//
//            expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
//                @Override
//                public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
//                    final String selected = (String) listAdapter.getChild(groupPosition, childPosition);
//
//                    Toast.makeText(getBaseContext(),selected,Toast.LENGTH_LONG).show();
//                    return false;
//                }
//            });



//            createGroupList();
//            createCollection();

//            expandableListView =(ExpandableListView) findViewById(R.id.groupListview);
//            final ExpandableListAdapter_on expandableListAdapter = new ExpandableListAdapter_on(this,groupList,group);
//            expandableListView.setAdapter(expandableListAdapter);
//           // setGroupIndicatorToRight();
//            expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
//                @Override
////                public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
//////                    String selected ;
//////                    selected = expandableListAdapter.getChild(groupPosition,childPosition).toString();
//////                    Toast.makeText(getBaseContext(),selected,Toast.LENGTH_LONG).show();
////                    return true;
////                }
////            });
//                public boolean onChildClick(ExpandableListView parent, View v,
//                                            int groupPosition, int childPosition, long id) {
//                    String string = "Child Click";
//                    int duration = Toast.LENGTH_SHORT;
//                    Toast toast = Toast.makeText(getApplicationContext(), string,
//                            duration);
//                    toast.show();
//                    return false;
//                }
//            });
//
//            expListView = (ExpandableListView) findViewById(R.id.groupListview);
//            final ExpandableListAdapter expandableListAdapter = new ExpandableListAdapter(this,groupList,listMap);
//            expListView.setAdapter(expandableListAdapter);
//            expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
//                @Override
//                public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
//
//                    final String selected = (String) expandableListAdapter.getChild(groupPosition, childPosition);
//
//                    Toast.makeText(getBaseContext(),selected,Toast.LENGTH_LONG).show();
//                    return true;
//                }
//            });

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

    //method to expand all group
    private void displayList() {
        //display the list
        loadSomeData();

        //get ref to the expandableListView
        myList = (ExpandableListView)findViewById(R.id.groupListview);
        //create the adapter by passing your ArrayList data
        listAdapter = new MyListAdapter(ConversationActivity.this,groupHeaderList);
        //attach the adapter to the list
        myList.setAdapter(listAdapter);
    }

    //method expand all groups
    private void expandAll(){
        int count = listAdapter.getGroupCount();
        for (int i = 0 ;i< count;i++){
            myList.expandGroup(i);
        }
    }

    private void loadSomeData() {
        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child("Test1","Test2","Test3","Test4","Test5",null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader("TEST",childList);
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

//    private void prepareListData() {
//        listDataHeader = new ArrayList<String>();
//        listDataChild = new HashMap<String, List<String>>();
//
//        //Add header data
//        listDataHeader.add("Test 1");
//        listDataHeader.add("Test 2");
//
//        //Add child
//        List<String> test1= new ArrayList<String>();
//        test1.add("a");
//        test1.add("b");
//        test1.add("c");
//        test1.add("d");
//
//        List<String> test2 = new ArrayList<String>();
//        test2.add("e");
//        test2.add("f");
//        test2.add("g");
//        test2.add("h");
//
//        listDataChild.put(listDataHeader.get(0),test1);
//        listDataChild.put(listDataHeader.get(1),test2);
//    }

//    private void createGroupList() {
//        groupList = new ArrayList<String>();
//        groupList.add("สวัสดี");
//    }
//
//    private void createCollection(){
//        String[] hello = {"Hello"};
//
//        group = new LinkedHashMap<String, List<String>>();
//        for(String child:groupList){
//            if(child.equals("สวัสดี")){
//                loadChild(hello);
//            }
//        }
//    }
//
//    private void loadChild(String[] Model) {
//        childList = new ArrayList<String>();
//        for (String model:Model){
//            childList.add(model);
//        }
//    }
//    private void setGroupIndicatorToRight() {
//        /* Get the screen width */
//        DisplayMetrics dm = new DisplayMetrics();
//        getWindowManager().getDefaultDisplay().getMetrics(dm);
//        int width = dm.widthPixels;
//
//        expandableListView.setIndicatorBounds(width - getDipsFromPixel(60), width
//                - getDipsFromPixel(5));
//    }
//
//    // Convert pixel to dip
//    public int getDipsFromPixel(float pixels) {
//        // Get the screen's density scale
//        final float scale = getResources().getDisplayMetrics().density;
//        // Convert the dps to pixels, based on density scale
//        return (int) (pixels * scale + 0.5f);
//    }


//    private void prepareListData() {
//        listDataHeader = new ArrayList<String>();
//        listDataChild = new HashMap<String, List<String>>();
//
//        //Adding child data
//        listDataHeader.add("สวัสดี");
//        listDataHeader.add("สวัสดีตอนกลางวัน");
//
//        //Adding child data
//        List<String> hello = new ArrayList<String>();
//        hello.add("Hello");
//        hello.add("Halo");
//        hello.add("Ha-lo");
//
//        List<String> hello2 = new ArrayList<String>();
//        hello2.add("test1");
//        hello2.add("test2");
//
//        listDataChild.put(listDataHeader.get(0),hello);
//        listDataChild.put(listDataHeader.get(1),hello2);
//
//    }




//    private void createGroupList() {
//        groupList = new ArrayList<String>();
//        groupList.add("สวัสดี");
//
////        final ArrayList<HashMap<String,String>> dataList = db.ShowAllData();
////            ListView listView = (ListView)findViewById(R.id.groupListview);
////            SimpleAdapter adt = new SimpleAdapter(ConversationActivity.this,dataList,R.layout.showitemdb_custom,
////                    new String[]{"wordFrom","wordEN"},new int[]{R.id.mainWord,R.id.subWord});
////            listView.setAdapter(adt);
//    }
//
//
//    //pass
//
//    //How to?
//    private void createCollection() {
//
////        final ArrayList<HashMap<String,String>> dataList = db.ShowAllData();
////        listMap = new LinkedHashMap<String, List<String>>();
////        TextView wordFrom = (TextView) findViewById(R.id.wordFrom);
////        TextView wordTo = (TextView) findViewById(R.id.wordEN);
//       String[] testModel = {"test1","test2","test3"};
//        listMap = new LinkedHashMap<String, List<String>>();
//        for(String group: groupList){
//            if(group.equals("TEST")){
//                loadChild(testModel);
//            }
//            else {
//            }
//
//            listMap.put(group,childList);
//        }
//    }
//
//    private void loadChild(String[] groupModel){
//        childList = new ArrayList<String>();
//        for(String model: groupModel)
//            childList.add(model);
//    }



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







