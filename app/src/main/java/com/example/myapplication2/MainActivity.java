package com.example.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] tags  = {"feed-0","entry-1","title-2","category-3","author-2","link-2","updated-2","summary-2"};
    }


    public void getContent(){
        try{


        }catch (Exception e){
            Log.d("main  : ",e.getMessage());
        }


    }
}