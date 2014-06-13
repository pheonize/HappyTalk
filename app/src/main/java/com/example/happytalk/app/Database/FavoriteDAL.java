package com.example.happytalk.app.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import com.example.happytalk.app.Child;
import com.example.happytalk.app.GroupHeader;

import java.util.ArrayList;

/**
 * Created by oVANILLAz on 6/12/14 AD.
 */
public class FavoriteDAL extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME="HappyTalk";

    public static final String TABLE_FAVORITE = "favorite";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_LANGFROM ="langFrom";
    public static final String COLUMN_LANGTO ="langTo";
    public static final String COLUMN_WORDEN ="wordEN";
    public static final String COLUMN_WORDFROM = "wordFrom";
    public static final String COLUMN_WORDTO ="wordTo";
    public static final String COLUMN_KARAOKETH="karaokeTH";
    public static final String COLUMN_KARAOKEEN = "karaokeEN";

    private Context context;
    SQLiteDatabase db;
    private ArrayList<GroupHeader> groupHeaderList = new ArrayList<GroupHeader>();


    public FavoriteDAL(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);


    }



    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_FAVORITE_TABLE =  "CREATE TABLE "+ TABLE_FAVORITE + "("
                + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COLUMN_LANGFROM +
                " TEXT, " + COLUMN_LANGTO + " TEXT, " + COLUMN_WORDEN + " TEXT, "+  COLUMN_WORDFROM + " TEXT, " +
                COLUMN_WORDTO + " TEXT, " + COLUMN_KARAOKETH + " TEXT, " + COLUMN_KARAOKEEN +
                " TEXT " + ")";
        db.execSQL(CREATE_FAVORITE_TABLE);
        Toast.makeText(context,"Create "+ TABLE_FAVORITE ,Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_FAVORITE);

        onCreate(db);
    }

    public void addFavorite(Favorite favorite){
        db =this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COLUMN_LANGFROM,favorite.getLangFrom());
        values.put(COLUMN_LANGTO,favorite.getLangTo());
        values.put(COLUMN_WORDEN,favorite.getWordEN());
        values.put(COLUMN_WORDFROM,favorite.getWordFrom());
        values.put(COLUMN_WORDTO,favorite.getWordTo());
        values.put(COLUMN_KARAOKETH,favorite.getKaraokeTH());
        values.put(COLUMN_KARAOKEEN,favorite.getKaraokeEN());


        db.insert(TABLE_FAVORITE,null,values);
        Toast.makeText(context,"insert finish",Toast.LENGTH_SHORT).show();
        db.close();
    }

    public void removeFavorite(Favorite favorite){
        db = this.getWritableDatabase();

        db.delete(TABLE_FAVORITE, COLUMN_ID + " = ?",
                new String[] {String.valueOf(favorite.getId())});
        db.close();

    }




    //Load favorite list


    public void loadThaiToChina(){



        ArrayList<Child> childList = new ArrayList<Child>();
        Child child = new Child(COLUMN_KARAOKEEN,COLUMN_KARAOKETH,COLUMN_WORDFROM,COLUMN_WORDEN,COLUMN_WORDTO,null,null);
        childList.add(child);

        GroupHeader groupHeader = new GroupHeader(COLUMN_WORDFROM,COLUMN_WORDTO,childList);
        groupHeaderList.add(groupHeader);


    }


    public ArrayList<GroupHeader> getGroupHeaderList()
    {
        return groupHeaderList;
    }

}
