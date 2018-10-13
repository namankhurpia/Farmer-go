package com.namankhurpia.appchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.freshchat.consumer.sdk.Freshchat;
import com.freshchat.consumer.sdk.FreshchatConfig;
import com.freshchat.consumer.sdk.FreshchatUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FreshchatConfig freshchatConfig=new FreshchatConfig("4ac30fe6-e9ca-4cd2-8044-1110a044c6e3","83f4f757-9f2f-4597-9095-df61dd93cc35");


        freshchatConfig.setCameraCaptureEnabled(true);
        freshchatConfig.setGallerySelectionEnabled(true);


        Freshchat.getInstance(getApplicationContext()).init(freshchatConfig);
        FreshchatUser freshUser=Freshchat.getInstance(getApplicationContext()).getUser();

        freshUser.setFirstName("Rahul");
        freshUser.setLastName("Chhabra");
        freshUser.setEmail("rahul.chhabra1998@gmail.com");
        freshUser.setPhone("+91", "7092180004");

        Freshchat.getInstance(getApplicationContext()).setUser(freshUser);

        Freshchat.getInstance(getApplicationContext()).init(freshchatConfig);


        Freshchat.showConversations(getApplicationContext());


    }
}
