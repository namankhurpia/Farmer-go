package com.namankhurpia.appchallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.freshchat.consumer.sdk.Freshchat;
import com.freshchat.consumer.sdk.FreshchatConfig;
import com.freshchat.consumer.sdk.FreshchatUser;

public class chatactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_chatactivity);

        FreshchatConfig freshchatConfig=new FreshchatConfig("4ac30fe6-e9ca-4cd2-8044-1110a044c6e3","83f4f757-9f2f-4597-9095-df61dd93cc35");


        freshchatConfig.setCameraCaptureEnabled(true);
        freshchatConfig.setGallerySelectionEnabled(true);


        Freshchat.getInstance(getApplicationContext()).init(freshchatConfig);
        FreshchatUser freshUser=Freshchat.getInstance(getApplicationContext()).getUser();

        freshUser.setFirstName("Naman");
        freshUser.setLastName("Khurpia");
        freshUser.setEmail("namankhurpia2@gmail.com");
        freshUser.setPhone("+91", "9039658263");

        Freshchat.getInstance(getApplicationContext()).setUser(freshUser);

        Freshchat.getInstance(getApplicationContext()).init(freshchatConfig);


        Freshchat.showConversations(getApplicationContext());
    }
}
