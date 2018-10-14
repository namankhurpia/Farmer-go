package com.namankhurpia.appchallenge;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class profiletab extends AppCompatActivity {

    private TextView  account;
    private ImageView logout;

    String bankbal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profiletab);

        account=(TextView)findViewById(R.id.accountbalance);
        logout=(ImageView)findViewById(R.id.logout);

        DatabaseReference db = FirebaseDatabase.getInstance().getReference();
        DatabaseReference rfone=db.child("bankbalance");
        rfone.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                bankbal=dataSnapshot.getValue(String.class);
                account.setText(bankbal);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(profiletab.this,MainActivity.class));
            }
        });

    }
}
