package com.magicalme.myfirstapp;

import android.os.Bundle;
import android.app.Activity;

public class DisplayMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
