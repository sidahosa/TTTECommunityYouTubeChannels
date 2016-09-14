package com.thetttecommunity.tttecommunityyoutubechannels;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Dev_team extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dev_team);

        TextView tx = (TextView)findViewById(R.id.dev_title);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/flange.ttf");
        tx.setTypeface(custom_font);
    }

}
