package com.example.android.meemiwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//// click Listners
        TextView numberClickListner = (TextView)findViewById(R.id.numbers_main_text);
        numberClickListner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberIntet = new Intent(MainActivity.this,NumberJava.class);
                startActivity(numberIntet);
                Toast.makeText(v.getContext(),"go to number view",Toast.LENGTH_SHORT).show();
            }
        });
        TextView colorsCilickListener = (TextView) findViewById(R.id.colors_main_text);
        colorsCilickListener.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(MainActivity.this,ColorsJava.class);
                startActivity(colorsIntent);
                Toast.makeText(v.getContext(),"go to color view",Toast.LENGTH_SHORT).show();
            }});
        TextView familyClickListener = (TextView) findViewById(R.id.family_main_text);
        familyClickListener.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent familtyIntent = new Intent(MainActivity.this,FamilyJava.class);
                startActivity(familtyIntent);
                Toast.makeText(v.getContext(),"go to family view",Toast.LENGTH_SHORT).show();
            }
        });
        TextView phrasesClickListener = (TextView) findViewById(R.id.phrases_main_text);
        phrasesClickListener.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(MainActivity.this,PhrasesJava.class);
                startActivity(phrasesIntent);
                Toast.makeText(v.getContext(),"go to phrases view",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
