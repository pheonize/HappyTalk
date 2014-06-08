package com.example.happytalk.app;

import android.media.Image;
import android.widget.ImageView;

/**
 * Created by oVANILLAz on 6/8/14 AD.
 */
public class Child {
    private String karaokeEN;
    private String karaokeTH;
    private String wordFrom;
    private String wordEN;
    private String wordTo;

    public String getWordFrom() {
        return wordFrom;
    }

    public void setWordFrom(String wordFrom) {
        this.wordFrom = wordFrom;
    }

    public String getWordEN() {
        return wordEN;
    }

    public void setWordEN(String wordEN) {
        this.wordEN = wordEN;
    }

    public String getWordTo() {
        return wordTo;
    }

    public void setWordTo(String wordTo) {
        this.wordTo = wordTo;
    }

    public Image getSound() {
        return sound;
    }

    public void setSound(Image sound) {
        this.sound = sound;
    }

    public Image getFavorite() {
        return favorite;
    }

    public void setFavorite(Image favorite) {
        this.favorite = favorite;
    }

    private Image sound;
    private Image favorite;

    public String getKaraokeEN(){
        return karaokeEN;
    }
    public void setKaraokeEN(String karaokeEN){
        this.karaokeEN = karaokeEN;
    }
    public String getKaraokeTH(){
        return karaokeTH;
    }
    public void setKaraokeTH(String karaokeTH){
        this.karaokeTH = karaokeTH;
    }




}
