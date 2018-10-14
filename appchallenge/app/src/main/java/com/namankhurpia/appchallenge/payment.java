package com.namankhurpia.appchallenge;

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

import org.w3c.dom.Text;

public class payment extends AppCompatActivity {

    TextView bankbalance,status;
    ImageButton yes,no;

    String bankbal;
    int intbankbal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        bankbalance=(TextView)findViewById(R.id.bankbalance);
        status=(TextView)findViewById(R.id.status);

        yes=(ImageButton)findViewById(R.id.yes);
        no=(ImageButton)findViewById(R.id.no);

        DatabaseReference db = FirebaseDatabase.getInstance().getReference();
        DatabaseReference rfone=db.child("bankbalance");
        rfone.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                bankbal=dataSnapshot.getValue(String.class);
                bankbalance.setText(bankbal);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });












        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
