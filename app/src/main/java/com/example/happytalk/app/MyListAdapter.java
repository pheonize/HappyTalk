package com.example.happytalk.app;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.Toast;

import com.example.happytalk.app.Database.Favorite;
import com.example.happytalk.app.Database.FavoriteDAL;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by oVANILLAz on 6/9/14 AD.
 */
public class MyListAdapter extends BaseExpandableListAdapter {

    private Context context;

    private ArrayList<GroupHeader> groupHeadersList;
    private ArrayList<GroupHeader> originalList;
    private MediaPlayer mediaPlayer;
    Button btnSound;
    Button btnFavorite;

//    private String lang_from,lang_to ;

    private ArrayList<GroupHeader> groupHeader = new ArrayList<GroupHeader>();

    private Child child;


    FavoriteDAL favoriteDAL;
    SQLiteDatabase sqLiteDatabase;



    Cursor mCursor;
    String lang_from,lang_to,wordEN,wordFrom,wordTo,karaokeTH,karaokeEN;




    public MyListAdapter(Context context,ArrayList<GroupHeader> groupHeadersList,String lang_from,String lang_To){
        this.context = context;
        this.groupHeadersList = new ArrayList<GroupHeader>();
        this.groupHeadersList.addAll(groupHeadersList);
        this.originalList = new ArrayList<GroupHeader>();
        this.originalList.addAll(groupHeadersList);
        this.lang_from = lang_from;
        this.lang_to = lang_To;



    }

    @Override
    public Object getChild(int groupPosition,int childPosition){
        ArrayList<Child> childList = groupHeadersList.get(groupPosition).getChildList();
        return childList.get(childPosition);
    }

    @Override
    public long getChildId(int groupPosition,int childPosition){
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, final int childPosition,boolean isLastChild,View view ,ViewGroup parent){
       child = (Child) getChild(groupPosition, childPosition);
        if(view==null){
           LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.child_item,null);
       }

        TextView txtwordFrom = (TextView) view.findViewById(R.id.txtWordFrom);
        TextView txtwordEN = (TextView) view.findViewById(R.id.txtWordEN);
        TextView txtwordTo =(TextView) view.findViewById(R.id.txtWordTo);
        TextView txtkaraokeTH = (TextView) view.findViewById(R.id.txtKaraokeTH);
        TextView txtkaraokeEN = (TextView) view.findViewById(R.id.txtKaraokeEN);


        btnSound = (Button) view.findViewById(R.id.sounds);
        btnFavorite = (Button) view.findViewById(R.id.favorite);





        btnSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(child.getSoundPath() != -1)

                    loadSound(child.getSoundPath());

            }
        });

        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



               Favorite();
                //db = new FavoriteDAL(context);
                //sqLiteDatabase = db.getWritableDatabase();
//                if(mCursor.getCount() ==0){
//
//
//                    String insert = "INSERT INTO " + FavoriteDAL.TABLE_FAVORITE + " (" + FavoriteDAL.COLUMN_LANGFROM
//                            + ", " + FavoriteDAL.COLUMN_LANGTO + ", " + FavoriteDAL.COLUMN_WORDEN + ", "
//                            + FavoriteDAL.COLUMN_WORDFROM + ", " + FavoriteDAL.COLUMN_WORDTO + ", " + FavoriteDAL.COLUMN_KARAOKEEN +
//                            ", " + FavoriteDAL.COLUMN_KARAOKETH + ") VALUES ('" +  lang_from + "', '" + lang_to +
//                            "', '" + child.getWordEN() + "', '" + child.getWordFrom() + "', '" + child.getWordTo() + "', '"
//                            + child.getKaraokeEN() + "', '" + child.getKaraokeTH() + "');";
//
//
//                    sqLiteDatabase.execSQL(insert);
//
//                    Toast.makeText(context , "Add Favorite Success" ,Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    lang_from = mCursor.getString(mCursor.getColumnIndex(FavoriteDAL.COLUMN_LANGFROM));
//                    lang_to = mCursor.getString(mCursor.getColumnIndex(FavoriteDAL.COLUMN_LANGTO));
//                    wordEN = mCursor.getString(mCursor.getColumnIndex(FavoriteDAL.COLUMN_WORDEN));
//                    wordFrom = mCursor.getString(mCursor.getColumnIndex(FavoriteDAL.COLUMN_WORDFROM));
//                    wordTo = mCursor.getString(mCursor.getColumnIndex(FavoriteDAL.COLUMN_WORDTO));
//                    karaokeEN = mCursor.getString(mCursor.getColumnIndex(FavoriteDAL.COLUMN_KARAOKEEN));
//                    karaokeTH = mCursor.getString(mCursor.getColumnIndex(FavoriteDAL.COLUMN_KARAOKETH));
//
//                    String delete = "DELETE FROM " + FavoriteDAL.TABLE_FAVORITE + "WHERE "
//                            + FavoriteDAL.COLUMN_LANGFROM + "='" + lang_from + "'"
//                            + " AND " + FavoriteDAL.COLUMN_LANGTO + "='" + lang_to + "'"
//                            + " AND " + FavoriteDAL.COLUMN_WORDEN + "='" + wordEN + "'"
//                            + " AND " + FavoriteDAL.COLUMN_WORDFROM + "='" + wordFrom + "'"
//                            + " AND " + FavoriteDAL.COLUMN_WORDTO + "='" + wordTo + "'"
//                            + " AND " + FavoriteDAL.COLUMN_KARAOKEEN + "='" + karaokeEN + "'"
//                            + " AND " + FavoriteDAL.COLUMN_KARAOKETH + "='" + karaokeTH + "';";
//
//                    sqLiteDatabase.execSQL(delete);
//                    mCursor.requery();
//
//                    Toast.makeText(context,"Same data" ,Toast.LENGTH_SHORT).show();
//                }
//
//
//                db.close();
//                sqLiteDatabase.close();

            }


        });





        txtwordFrom.setText(child.getWordFrom().trim());
        txtwordEN.setText(child.getWordEN().trim());
        txtwordTo.setText(child.getWordTo().trim());
        txtkaraokeEN.setText(child.getKaraokeEN().trim());
        txtkaraokeTH.setText(child.getKaraokeTH().trim());

        return view;
    }



    private void Favorite() {
        favoriteDAL = new FavoriteDAL(context);
        String wordEN = child.getWordEN();
        String wordFrom = child.getWordFrom();
        String wordTo = child.getWordTo();
        String karaokeEN = child.getKaraokeEN();
        String karaokeTH = child.getKaraokeTH();
        int sound = child.getSoundPath();


        String insert = "INSERT INTO " + FavoriteDAL.TABLE_FAVORITE + " (" + FavoriteDAL.COLUMN_LANGFROM
                + ", " + FavoriteDAL.COLUMN_LANGTO + ", " + FavoriteDAL.COLUMN_WORDEN + ", "
                + FavoriteDAL.COLUMN_WORDFROM + ", " + FavoriteDAL.COLUMN_WORDTO + ", " + FavoriteDAL.COLUMN_KARAOKEEN +
                ", " + FavoriteDAL.COLUMN_KARAOKETH + ", " + FavoriteDAL.COLUMN_SOUND + " ) VALUES ('" + lang_from + "', '" + lang_to +
                "', '" + wordEN + "', '" + wordFrom + "', '" + wordTo + "', '"
                + karaokeEN + "', '" + karaokeTH + "', '" + sound + "');";


        String delete = "DELETE FROM " + FavoriteDAL.TABLE_FAVORITE + " WHERE "


                 + FavoriteDAL.COLUMN_WORDFROM + "='" + wordFrom + "'"
                + " AND " + FavoriteDAL.COLUMN_WORDTO + "='" + wordTo + "'";


        sqLiteDatabase = favoriteDAL.getWritableDatabase();
       // if (sqLiteDatabase != null) {

            String select = " SELECT * FROM " + FavoriteDAL.TABLE_FAVORITE;
            Cursor mCursor = sqLiteDatabase.rawQuery(select, null);

        int magicSave = 0;
        if (mCursor .moveToFirst()) {
            while (mCursor.isAfterLast() == false) {

                if (mCursor.getString(4).equals(wordFrom) && mCursor.getString(5).equals(wordTo)) {
                    magicSave++;
                    sqLiteDatabase.execSQL(delete);
                    Toast.makeText(context, "Delete Favorite Success", Toast.LENGTH_SHORT).show();
                }
                mCursor.moveToNext();
            }

            if(magicSave == 0)
            {
                sqLiteDatabase.execSQL(insert);
                Toast.makeText(context, "Add Favorite Success", Toast.LENGTH_SHORT).show();
            }
        }
        else{
            sqLiteDatabase.execSQL(insert);
            Toast.makeText(context, "Add Favorite Success", Toast.LENGTH_SHORT).show();
        }
                //Toast.makeText(context, "Add Favorite Success", Toast.LENGTH_SHORT).show();
         //   }
//        else {
//            sqLiteDatabase.execSQL(insert);
//            Toast.makeText(context, "Add Favorite Success", Toast.LENGTH_SHORT).show();
//
//        }

    }
    @Override
    public int getChildrenCount(int groupPosition){
        ArrayList<Child> childList = groupHeadersList.get(groupPosition).getChildList();
        return childList.size();
    }

    @Override
    public Object getGroup(int groupPosition){
        return groupHeadersList.get(groupPosition);
    }

    @Override
    public int getGroupCount(){
        return groupHeadersList.size();
    }

    @Override
    public long getGroupId(int groupPosition){
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition,boolean isLastChild,View view,ViewGroup parent){

        GroupHeader groupHeader = (GroupHeader) getGroup(groupPosition);
        if(view == null){
            LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.group_listview,null);
        }

        TextView wordFrom = (TextView)view.findViewById(R.id.wordFrom);
        TextView wordEN = (TextView)view.findViewById(R.id.wordEN);

        wordFrom.setText(groupHeader.getWordFrom().trim());
        wordEN.setText(groupHeader.getWordEN().trim());

        return view;


    }

    @Override
    public boolean hasStableIds(){
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition,int childPosition){
        return true;
    }


    public void filterData(String query){
        query =query.toLowerCase();

        Log.v("MyListAdapter",String.valueOf(groupHeadersList.size()));
        groupHeadersList.clear();

        if(query.isEmpty()){
            groupHeadersList.addAll(originalList);

        }
        else{
            for(GroupHeader groupHeader:originalList){
                ArrayList<Child> groupHeaders = groupHeader.getChildList();
                ArrayList<Child> newList = new ArrayList<Child>();
                for(Child child : groupHeaders){
                    if(child.getWordFrom().toLowerCase().contains(query) || child.getWordTo().toLowerCase().contains(query)){
                        newList.add(child);
                    }
                }
                if(newList.size()>0){
                    GroupHeader nGroupHeader = new GroupHeader(groupHeader.getWordFrom(),groupHeader.getWordEN(),newList);
                    groupHeadersList.add(nGroupHeader);
                }


            }
        }


        Log.v("MyListAdapter" ,String.valueOf(groupHeadersList.size()));
        notifyDataSetChanged();
    }

    // Filter Class
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        groupHeadersList.clear();

        if(charText.length()==0){
            groupHeadersList.addAll(originalList);
            //groupHeadersList.clear();
        }
        else{
            for(GroupHeader groupHeader:originalList){
                ArrayList<Child> groupHeaders = groupHeader.getChildList();
                ArrayList<Child> newList = new ArrayList<Child>();
                for(Child child : groupHeaders){
                    if(child.getWordFrom().toLowerCase().contains(charText) || child.getWordTo().toLowerCase().contains(charText)){
                        newList.add(child);
                    }
                }
                if(newList.size()>0){
                    GroupHeader nGroupHeader = new GroupHeader(groupHeader.getWordFrom(),groupHeader.getWordEN(),newList);
                    groupHeadersList.add(nGroupHeader);
                }


            }
        }


        Log.v("MyListAdapter" ,String.valueOf(groupHeadersList.size()));
        notifyDataSetChanged();
    }






    //LoadSound


    public void loadSound(int soundPath) {
            MediaPlayer mp = MediaPlayer.create(context, soundPath);
            mp.start();

    }


}
