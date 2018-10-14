package com.namankhurpia.appchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.firebase.client.Firebase;

import org.w3c.dom.Text;

public class billing extends AppCompatActivity {

    private ImageButton add,reduce;
    private TextView costeachitem;





    int valuefinal;
    int amountp=0;
    String amountps;
    int amountperveggip=673;
    int gstamount=68;

    int totalbeforegst=0;
    String totalbeforegststring;

    private TextView amounteachitem,costbeforegst,gst,costaftergst;
    int costbeforegstint=0,gstint=0,costaftergstint=0;

    private ImageButton proceedtopayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //proceedtopayment=(ImageButton)findViewById(R.id.proceedtopayment);




        setContentView(R.layout.activity_billing);
        add=(ImageButton)findViewById(R.id.add);
        reduce=(ImageButton)findViewById(R.id.reduce);

        amounteachitem=(TextView)findViewById(R.id.amounteachitem);
        costeachitem=(TextView)findViewById(R.id.costeachitem);

        costbeforegst=(TextView)findViewById(R.id.costbeforegst);
        gst=(TextView)findViewById(R.id.gst);
        costaftergst=(TextView)findViewById(R.id.costaftergst);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                amountp=amountp+1;
                amountps=Integer.toString(amountp);
                amounteachitem.setText(amountps);

                costeachitem.setText("673");

                gst.setText("68");

                costbeforegstint=amountperveggip*amountp;
                String costbeforegststring=Integer.toString(costbeforegstint);
                costbeforegst.setText(costbeforegststring);

                costaftergstint=costbeforegstint+gstint;
                String costaftergststring=Integer.toString(costaftergstint);
                costaftergst.setText(costaftergststring);








            }
        });

        reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valuefinal=amountperveggip;
                amountp=amountp-1;
                amountps=Integer.toString(amountp);
                amounteachitem.setText(amountps);

                costeachitem.setText("673");

                gst.setText("68");

                costbeforegstint=amountperveggip*amountp;
                String costbeforegststring=Integer.toString(costbeforegstint);
                costbeforegst.setText(costbeforegststring);

                costaftergstint=costbeforegstint+gstint;
                String costaftergststring=Integer.toString(costaftergstint);
                costaftergst.setText(costaftergststring);




            }
        });








    }

    private void sendvaluetofirebase() {

       Firebase mrootref=new Firebase("https://appchallenge-3719e.firebaseio.com/");

        String name="transaction amount";

        Firebase childref = mrootref.child(name);
        childref.setValue(costaftergst);

    }



    public void Process(View v)
    {

        //sendvaluetofirebase();
        Intent i=new Intent(billing.this,payment.class);
        startActivity(i);
    }





}



