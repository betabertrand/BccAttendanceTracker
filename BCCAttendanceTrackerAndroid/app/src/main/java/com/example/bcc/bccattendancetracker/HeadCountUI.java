package com.example.bcc.bccattendancetracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class HeadCountUI extends AppCompatActivity {

    public static final String COUNT = "com.example.bcc.bccattendancetracker.COUNT";

    String HeadCount = "0";
    int headCountInt = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_count_ui);

        ((TextView) findViewById(R.id.textBoxHeadCount)).setText(getIntent().getStringExtra(COUNT));
    }

    /** Called when the user touches the button */
    public void sendMessageB1(View view)
    {
        TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
        if(HeadCount.length()!=3)
        {
            HeadCount = HeadCount+"1";
            ChangeToIntAndBack();
            t.setText(HeadCount);
        }
    }

    /** Called when the user touches the button */
    public void sendMessageB2(View view)
    {
        TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
        if(HeadCount.length()!=3)
        {
            HeadCount = HeadCount + "2";
            ChangeToIntAndBack();
            t.setText(HeadCount);

        }
    }

    public void sendMessageB3(View view)
    {
        TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
        if(HeadCount.length()!=3)
        {
            HeadCount = HeadCount + "3";
            ChangeToIntAndBack();
            t.setText(HeadCount);
        }
    }

    public void sendMessageB4(View view)
    {
        TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
        if(HeadCount.length()!=3)
        {
            HeadCount = HeadCount + "4";
            ChangeToIntAndBack();
            t.setText(HeadCount);
        }
    }

    public void sendMessageB5(View view)
    {
        TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
        if(HeadCount.length()!=3)
        {
            HeadCount = HeadCount + "5";
            ChangeToIntAndBack();
            t.setText(HeadCount);
        }
    }

    public void sendMessageB6(View view)
    {
        TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
        if(HeadCount.length()!=3)
        {
            HeadCount = HeadCount + "6";
            ChangeToIntAndBack();
            t.setText(HeadCount);
        }
    }

    public void sendMessageB7(View view)
    {
        TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
        if(HeadCount.length()!=3)
        {
            HeadCount = HeadCount + "7";
            ChangeToIntAndBack();
            t.setText(HeadCount);
        }
    }

    public void sendMessageB8(View view)
    {
        TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
        if(HeadCount.length()!=3)
        {
            HeadCount = HeadCount + "8";
            ChangeToIntAndBack();
            t.setText(HeadCount);
        }
    }

    public void sendMessageB9(View view)
    {
        TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
        if(HeadCount.length()!=3)
        {
            HeadCount = HeadCount + "9";
            ChangeToIntAndBack();
            t.setText(HeadCount);
        }
    }

    public void sendMessageB0(View view)
    {
        TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
        if(HeadCount.length()!=3)
        {
            t.setText(HeadCount + "0");
            HeadCount = HeadCount + "0";
        }
    }

    public void sendMessageBBack(View view)
    {
        TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
        if(HeadCount.length()!=0)
        {
            HeadCount = HeadCount.substring(0, HeadCount.length()-1);
            t.setText(HeadCount);
        }
    }

    public void sendMessageBInc(View view)
    {
        if(!HeadCount.equals(""))
        {
            headCountInt = Integer.parseInt(HeadCount.trim());
            if (headCountInt <= 998) {
                headCountInt += 1;
                HeadCount = String.valueOf(headCountInt);
                TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
                t.setText(HeadCount);
            }
        }
    }

    public void sendMessageBDec(View view)
    {
        if(!HeadCount.equals(""))
        {
            headCountInt = Integer.parseInt(HeadCount.trim());
            if (headCountInt > 0) {
                headCountInt -= 1;
                HeadCount = String.valueOf(headCountInt);
                TextView t = (TextView) findViewById(R.id.textBoxHeadCount);
                t.setText(HeadCount);
            }
        }
    }

    public void ChangeToIntAndBack()
    {
        headCountInt = Integer.parseInt(HeadCount.trim());
        HeadCount = String.valueOf(headCountInt);

    }

    /**
     * Close the EnterCountUI and return the value in the count textbox to the DataEntryUI .
     * @param view
     */
    public void enterHeadCount(View view) {
        Intent data = new Intent();
        data.putExtra(COUNT, ((TextView) findViewById(R.id.textBoxHeadCount)).getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }
}
