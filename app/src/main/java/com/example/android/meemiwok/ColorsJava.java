package com.example.android.meemiwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by MacBookPro on 8/14/17.
 */

public class ColorsJava extends AppCompatActivity {
    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.family_layout);

        LinearLayout familyRootView = (LinearLayout) findViewById(R.id.family_root_view);
        ListView familyListtView = new ListView(this);
        familyRootView.addView(familyListtView);

        ///// creat the arrayList from my new Class
        ArrayList<MyClass> listOfItmes = new ArrayList<MyClass>();
        listOfItmes.add(new MyClass("red", "weṭeṭṭi",R.drawable.color_red));
        listOfItmes.add(new MyClass("green","chokokki",R.drawable.color_green));
        listOfItmes.add((new MyClass("brown","ṭakaakki",R.drawable.color_brown)));
        listOfItmes.add(new MyClass("gray","ṭopoppi",R.drawable.color_gray));
        listOfItmes.add(new MyClass("black","kululli",R.drawable.color_black));
        listOfItmes.add(new MyClass("white","kelelli",R.drawable.color_white));
        listOfItmes.add(new MyClass("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        listOfItmes.add(new MyClass("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));


        MyAdapter numberAdapter = new MyAdapter(this,listOfItmes);
        familyListtView.setAdapter(numberAdapter);
    }

    }

