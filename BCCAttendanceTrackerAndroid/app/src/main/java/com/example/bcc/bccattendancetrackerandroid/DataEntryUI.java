package com.example.bcc.bccattendancetrackerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DataEntryUI extends AppCompatActivity {

    private TextView countTextBox;

    private static final int GET_COUNT = 1;
    private static final int RESOLVE_CONFLICT = 2;
    private static final int MAX_VALUE = 999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_entry_ui);

        countTextBox = (TextView) findViewById(R.id.count);
    }

    /**
     * Opens up the EntryCountUI and waits for it to finish.
     * @param view
     */
    public void openEnterCountUI(View view) {
        Intent intent = new Intent(this, HeadCountUI.class);
        intent.putExtra(HeadCountUI.COUNT,
                countTextBox.getText().toString());
        startActivityForResult(intent, GET_COUNT);
    }

    /**
     *
     * @param view
     */
    public void incrementCount(View view) {
        if(countTextBox.getText().toString().isEmpty()) {
            displayHeadCount(1);
        } else if (Integer.parseInt(countTextBox.getText().toString()) >= MAX_VALUE) {
            displayHeadCount(999);
        } else {
            displayHeadCount(Integer.parseInt(countTextBox.getText().toString()) + 1);
        }
    }

    /**
     *
     * @param view
     */
    public void decrementCount(View view) {
        if(countTextBox.getText().toString().isEmpty() ||
                Integer.parseInt(countTextBox.getText().toString()) <= 0) {
            displayHeadCount(0);
        } else {
            displayHeadCount(Integer.parseInt(countTextBox.getText().toString()) - 1);
        }
    }

    /**
     * Sets the count textbox to the given int value
     * @param headCount
     */
    private void displayHeadCount(int headCount) {
        countTextBox.setText(String.valueOf(headCount));
    }

    /**
     * Takes data from spinners and count field and sends it to server.
     * @param view
     */
    public void submitDataToServer(View view) {
        Intent intent = new Intent(this, ResolveConflictUI.class);
        startActivityForResult(intent, RESOLVE_CONFLICT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (GET_COUNT == requestCode && resultCode == RESULT_OK) {
            displayHeadCount(Integer.parseInt(data.getStringExtra(HeadCountUI.COUNT)));
        }
    }
}
