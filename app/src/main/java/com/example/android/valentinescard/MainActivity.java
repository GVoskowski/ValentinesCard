package com.example.android.valentinescard;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text_1);
        TextView textView2 = (TextView) findViewById(R.id.text_2);
        Typeface typeFace = Typeface.createFromAsset(getAssets(), "CuteLove.ttf");
        textView.setTypeface(typeFace);
        textView2.setTypeface(typeFace);


final MediaPlayer sound = MediaPlayer.create(this,R.raw.coco2);
    FloatingActionButton playsound = (FloatingActionButton) this.findViewById(R.id.floatingActionButton);
    playsound.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            sound.start();
        }
    });
    }
}


