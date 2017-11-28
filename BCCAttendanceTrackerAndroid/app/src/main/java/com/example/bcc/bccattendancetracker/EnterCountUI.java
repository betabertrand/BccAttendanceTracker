package com.example.bcc.bccattendancetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EnterCountUI extends AppCompatActivity {

    public static final String COUNT = "com.example.bcc.bccattendancetracker.COUNT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_count_ui);
    }

    /**
     * Close the EnterCountUI and return the value in the count textbox to the DataEntryUI .
     * @param view
     */
    public void enterCount(View view) {
        Intent data = new Intent();
        data.putExtra(COUNT, ((TextView) findViewById(R.id.enter_count)).getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }
}
