package com.namankhurpia.appchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class payment_bank extends AppCompatActivity {
    EditText t1, t2, t3, t4;
    TextView tv;
    Switch s1;
    ToggleButton tb;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_bank);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        tv = findViewById(R.id.tv);
        s1 = findViewById(R.id.s1);
        tb = findViewById(R.id.tb);
        b = findViewById(R.id.b);
    }
}
