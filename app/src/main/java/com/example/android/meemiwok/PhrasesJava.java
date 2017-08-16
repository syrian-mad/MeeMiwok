package com.example.android.meemiwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by MacBookPro on 8/14/17.
 */

public class PhrasesJava extends AppCompatActivity {
    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.phrases_layout);

        LinearLayout phrasesRootView = (LinearLayout) findViewById(R.id.phrases_root_view);
        ListView phrasesListView = new ListView(this);
        phrasesRootView.addView(phrasesListView);

        ///// creat the arrayList from my new Class
        ArrayList<MyClass> listOfItems = new ArrayList<MyClass>();
        listOfItems.add(new MyClass("where r u going","minto wuksus"));
        listOfItems.add(new MyClass("what is ur name","tinnә oyaase'nә"));
        listOfItems.add(new MyClass("my name is","oyaaset"));
        listOfItems.add(new MyClass("How are you feeling?","michәksәs?"));
        listOfItems.add(new MyClass("I’m feeling good.","kuchi achit"));
        listOfItems.add(new MyClass("Are you coming?","әәnәs'aa?"));
        listOfItems.add(new MyClass("Yes, I’m coming.","hәә’ әәnәm"));
        listOfItems.add(new MyClass("I’m coming.","әәnәm"));
        listOfItems.add(new MyClass("Let’s go.","yoowutis"));
        listOfItems.add(new MyClass("Come here.","әnni'nem"));


        MyAdapter numberAdapter = new MyAdapter(this,listOfItems);
        phrasesListView.setAdapter(numberAdapter);


    }
}
