package com.example.st.project4.CustomAdapter;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by ST on 26-thg 1-18.
 */

public class item_fragment_tab1 {
    String img;
    String name;
    String time;
    String smscuoi;

    public item_fragment_tab1(String img, String name, String time, String smscuoi) {
        this.img = img;
        this.name = name;
        this.time = time;
        this.smscuoi = smscuoi;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSmscuoi() {
        return smscuoi;
    }

    public void setSmscuoi(String smscuoi) {
        this.smscuoi = smscuoi;
    }
}
