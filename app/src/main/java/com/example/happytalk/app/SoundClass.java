package com.example.happytalk.app;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by oVANILLAz on 6/12/14 AD.
 */
public class SoundClass extends Activity{

   // private MediaPlayer mediaPlayer;
    Button btnSound;
    private Context context;
    //private MyListAdapter myListAdapter;


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.child_item);
//    }

    public void loadSound(){


        MediaPlayer mp = MediaPlayer.create(getApplicationContext(),R.raw.th);
            mp.start();
       // Toast.makeText(context,"Test",Toast.LENGTH_LONG).show();

//        btnSound.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context,"Test",Toast.LENGTH_LONG).show();
//            }
//        });
    }




}
