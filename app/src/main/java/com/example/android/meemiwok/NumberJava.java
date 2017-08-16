package com.example.android.meemiwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by MacBookPro on 8/14/17.
 */

public class NumberJava extends AppCompatActivity {

    protected void onCreate(Bundle saveInstance){
        super.onCreate(saveInstance);
        setContentView(R.layout.number_layout);

        LinearLayout numberRootView = (LinearLayout) findViewById(R.id.number_root_view);
        ListView numberListView = new ListView(this);
        numberRootView.addView(numberListView);

        ///// creat the arrayList from my new Class
        ArrayList<MyClass> listOfItmes = new ArrayList<MyClass>();
        listOfItmes.add(new MyClass("one","lotto",R.drawable.number_one));
        listOfItmes.add(new MyClass("two","otiiko",R.drawable.number_two));
        listOfItmes.add((new MyClass("three","tolookosu",R.drawable.number_three)));
        listOfItmes.add(new MyClass("four","oyyisa",R.drawable.number_four));
        listOfItmes.add(new MyClass("five","massokka",R.drawable.number_five));
        listOfItmes.add(new MyClass("sex","temmokka",R.drawable.number_six));
        listOfItmes.add(new MyClass("seven","kenekaku",R.drawable.number_seven));
        listOfItmes.add(new MyClass("eight","kawinta",R.drawable.number_eight));
        listOfItmes.add(new MyClass("nine","wo’e",R.drawable.number_nine));
        listOfItmes.add(new MyClass("ten","na’aacha",R.drawable.number_ten));

        MyAdapter numberAdapter = new MyAdapter(this,listOfItmes);
        numberListView.setAdapter(numberAdapter);


    }
}
