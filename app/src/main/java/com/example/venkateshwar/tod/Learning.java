package com.example.venkateshwar.tod;

import java.util.Date;
import java.util.*;

/**
 * Created by Venkateshwar on 05-Nov-16.
 */
public class Learning {
    String data;
    String created;
    public Learning(){
        this.data=null;
        this.created=null;
    }
    public Learning(String data){
        this.data=data;
        this.created=android.text.format.DateFormat.format("yyyy-MMM-dd hh:mm:ss", new java.util.Date()).toString();
    }
    public Learning(Learning l){
        this.data=l.data;
        this.created=l.getCreated();
    }

    @Override
    public String toString() {
        return this.getData();
    }

    public String getData(){
        return this.data;
    }
    public String getCreated(){
        return this.created;
    }
}
