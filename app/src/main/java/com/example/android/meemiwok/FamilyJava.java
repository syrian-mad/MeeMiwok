package com.example.android.meemiwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by MacBookPro on 8/14/17.
 */

public class FamilyJava extends AppCompatActivity {
    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.family_layout);

        LinearLayout familyRootView = (LinearLayout) findViewById(R.id.family_root_view);
        ListView familyListtView = new ListView(this);
        familyRootView.addView(familyListtView);

        ///// creat the arrayList from my new Class
        ArrayList<MyClass> listOfItems = new ArrayList<MyClass>();
        listOfItems.add(new MyClass("father","әpә",R.drawable.family_father));
        listOfItems.add(new MyClass("mother","әṭa",R.drawable.family_mother));
        listOfItems.add(new MyClass("son","angsi",R.drawable.family_son));
        listOfItems.add(new MyClass("daughter","tune",R.drawable.family_daughter));
        listOfItems.add(new MyClass("older brother","taachi",R.drawable.family_older_brother));
        listOfItems.add(new MyClass("younger brother","chalitti",R.drawable.family_younger_brother));
        listOfItems.add(new MyClass("older sister","teṭe",R.drawable.family_older_sister));
        listOfItems.add(new MyClass("younger sister","kolliti",R.drawable.family_younger_sister));
        listOfItems.add(new MyClass("grandmother","ama",R.drawable.family_grandmother));
        listOfItems.add(new MyClass("grandfather","paapa",R.drawable.family_grandfather));


        MyAdapter numberAdapter = new MyAdapter(this,listOfItems);
        familyListtView.setAdapter(numberAdapter);
    }
}
