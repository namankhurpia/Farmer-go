package com.namankhurpia.appchallenge;

import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class selectveggie extends AppCompatActivity {

    private ImageButton bro,cap,tom,spin,peas,okra;

    private TextView brocolival;

    String valbroco;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectveggie);


        bro=(ImageButton)findViewById(R.id.broco);
        cap=(ImageButton)findViewById(R.id.cap);
        tom=(ImageButton)findViewById(R.id.tom);
        spin=(ImageButton)findViewById(R.id.spina);
        peas=(ImageButton)findViewById(R.id.peas);
        okra=(ImageButton)findViewById(R.id.okra);

        brocolival=(TextView)findViewById(R.id.brocolival);


        //fetching

        DatabaseReference db = FirebaseDatabase.getInstance().getReference();
        DatabaseReference rfone=db.child("brocoli");
        rfone.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                valbroco=dataSnapshot.getValue(String.class);
                brocolival.setText(valbroco);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
















        bro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(selectveggie.this,billing.class);
                i.putExtra("valuevia",valbroco);
                startActivity(i);



            }
        });

        cap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(selectveggie.this,billing.class);
                startActivity(i);

            }
        });

        tom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(selectveggie.this,billing.class);
                startActivity(i);
            }
        });

        spin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(selectveggie.this,billing.class);
                startActivity(i);
            }
        });


        peas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(selectveggie.this,billing.class);
                startActivity(i);
            }
        });



        okra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(selectveggie.this,billing.class);
                startActivity(i);
            }
        });









    }



}
