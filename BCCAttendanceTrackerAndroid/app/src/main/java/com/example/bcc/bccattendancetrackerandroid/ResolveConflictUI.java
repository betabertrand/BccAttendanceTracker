package com.example.bcc.bccattendancetrackerandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResolveConflictUI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resolve_conflict_ui);
    }

    public void cancel(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }

    public void replace(View view) {
        setResult(RESULT_OK);
        finish();
    }
}
