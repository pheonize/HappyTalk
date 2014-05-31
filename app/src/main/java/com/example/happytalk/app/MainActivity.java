package com.example.happytalk.app;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
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
import android.widget.ImageView;
import android.widget.ListView;
import android.content.res.TypedArray;
import android.content.Intent;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;

import android.widget.AdapterView.OnItemSelectedListener;


import java.util.List;


public class MainActivity extends Activity {




    private Spinner countryFrom,countryTo;


    private String strCountryFrom,strCountryTo;




    String[] country_list ={"Brunei","Cambodia","China","Indonesia",
            "Laos","Malaysia","Myanmar","Philippines","Singapore",
            "Thai","Vietnam"};

    Integer[] img ={R.drawable.brunei_flag,R.drawable.cambodia_flag,
            R.drawable.china_flag,R.drawable.indonesia_flag,
            R.drawable.laos_flag,R.drawable.malaysia,
            R.drawable.myanmar_flag,R.drawable.philippines_flag,
            R.drawable.singapore_flag,R.drawable.thailand_flag,
            R.drawable.vietnam_flag};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);




        //Test DB //
        //Database
        Database db = new Database(this);

        Log.d("Insert : ","Inserting ..");
//        db.addConversation(new Conversation("Thai","Brunei","สวัสดี","Halo","ฮาโล","Ha-lo"," "));
//        db.addThing(new Thing("Thai","Brunei","ฉันรู้สึกหิว","Saya lapar","ซายา ลาปัร","sar-yar-lar-par",""));
//        db.addPlace(new Place("Thai","Brunei","ห้องน้ำไปทางไหน","Di mana kamar kecil (toilet) ?" ," ดีมานา กามัร เกอจีล(ตอยเลต)","dee-mar-nar-gar-mar-geu-jeel(toi-let)",""));
//        db.addEmergency(new Emergency("Thai","Brunei","ช่วยด้วย  ฉันโดนปล้น","Tolong, Saya baru saja dirampok",
//                "โตโลง, ซายา บารู ซาจา ดีรัมปก","to-long-sar-yar-bar-ru-sar-jar-dee-ram-pok",""));
//        db.addLogistic(new Logistic("Thai","Brunei","ด่านศุลกากร","Kantor bea cukai","กันโตร เบยา จูไก","gan-tor- ber-ya-ju-gai",""));


        Log.d("Reading: ", "Reading all conversation..");
        List<Conversation> conversations = db.getAllConversation();

        for(Conversation con:conversations ){
            String log ="Id: "+con.getId()+" ,LangFrom :" +con.getLangFrom()+",LangTo :"+con.getLangTo()+
                    ",Word TH: " + con.getWordFrom()+ ",Word To: " + con.getWordTo() + ",Karaoke TH:" + con.getKaraokeTH()+
                    ",Karaoke EN:" + con.getKaraokeEN() + "Sound :" +con.getSound();
            Log.d("Language :",log);
        }


        //---End Test -----//



        initWidget();




        Spinner countryFrom = (Spinner)findViewById(R.id.spinner_show);

        int selectedIntemPosittion = countryFrom.getSelectedItemPosition();
        countryFrom.setAdapter(new MyCustomAdapter(MainActivity.this,R.layout.spinner_row,country_list,img));
        countryFrom.setOnItemSelectedListener(new MyOnItemSelectedListener());

        Spinner countryTo = (Spinner)findViewById(R.id.spinner2_show);
        countryTo.setAdapter(new MyCustomAdapter(MainActivity.this,R.layout.spinner_row,country_list,img));
        countryTo.setOnItemSelectedListener(new MyOnItemSelectedListener());



        //custom icon
        int[] array_res = getImageArray(R.array.image_array
                , R.drawable.ic_launcher);
        String[] array_string = getStringArray(R.array.string_array);
        //

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(new CustomListViewAdapter(getApplicationContext()
                , android.R.id.text1, array_string, array_res));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            //arg2 =input value use to switchcase
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent = new Intent(getApplicationContext(),ConversationActivity.class);
                        intent.putExtra("strCountryFrom",strCountryFrom);
                        intent.putExtra("strCountryTo",strCountryTo);
                        Log.d("countryFrom",strCountryFrom);
                        Log.d("countryTo",strCountryTo);


                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getApplicationContext(),ThingActivity.class);
                        intent.putExtra("strCountryFrom",strCountryFrom);
                        intent.putExtra("strCountryTo",strCountryTo);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getApplicationContext(),PlaceActivity.class);
                        intent.putExtra("strCountryFrom",strCountryFrom);
                        intent.putExtra("strCountryTo",strCountryTo);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getApplicationContext(),HelpActivity.class);
                        intent.putExtra("strCountryFrom",strCountryFrom);
                        intent.putExtra("strCountryTo",strCountryTo);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getApplicationContext(),LogisticActivity.class);
                        intent.putExtra("strCountryFrom",strCountryFrom);
                        intent.putExtra("strCountryTo",strCountryTo);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getApplicationContext(),FavoriteActivity.class);
                        startActivity(intent);
                        break;
                }
            }



        });
    }




    private void initWidget() {
        countryFrom = (Spinner) findViewById(R.id.spinner_show);

        countryTo = (Spinner) findViewById(R.id.spinner2_show);
       // btnSearch = (Button) findViewById(R.id.btn_go);
    }


    //spinner
    public class MyCustomAdapter extends ArrayAdapter<String>{

        public MyCustomAdapter(Context context,int textViewResourceId,String[] objects,Integer[] img){
            super(context,textViewResourceId,objects);
        }
        @Override
        public View getDropDownView(int position,View convertView,ViewGroup parent){
            return getCustomView(position,convertView,parent);
        }

        @Override
        public View getView(int position,View convertView,ViewGroup parent){
            return getCustomView(position,convertView,parent);
        }

        public View getCustomView(int position,View convertView,ViewGroup parent){
            //return super.getView(position,convertView,parent);

            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.spinner_row,parent,false);
            TextView label = (TextView)row.findViewById(R.id.country);
            label.setText(country_list[position]);

            ImageView icon = (ImageView)row.findViewById(R.id.flag);
            icon.setImageResource(img[position]);
            return row;
        }

    }
    //print
    public class MyOnItemSelectedListener implements OnItemSelectedListener{

        public void onItemSelected(AdapterView<?> parent,View view,int pos,long id){


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






    public int[] getImageArray(int resId, int defResId) {
        TypedArray my_image_array = getResources().obtainTypedArray(resId);
        int[] array_res = new int[my_image_array.length()];
        for(int i = 0 ; i < array_res.length ; i++)
            array_res[i] = my_image_array.getResourceId(i, defResId);
        my_image_array.recycle();
        return array_res;
    }

    public String[] getStringArray(int resId) {
        TypedArray my_string_array = getResources().obtainTypedArray(resId);
        String[] array_string = new String[my_string_array.length()];
        for(int i = 0 ; i < array_string.length ; i++)
            array_string[i] = my_string_array.getString(i);
        my_string_array.recycle();
        return array_string;
    }





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

        switch (item.getItemId()){
            case R.id.action_search :
                //Search();
                return true;
            case R.id.action_settings:
                Setting();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
    private void Setting(){
        Intent intent ;
        intent= new Intent(getApplicationContext(), SettingActivity.class);
        startActivity(intent);
    }


}
