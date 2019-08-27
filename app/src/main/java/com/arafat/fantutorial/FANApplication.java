package com.arafat.fantutorial;

import android.app.Application;

import com.facebook.ads.AudienceNetworkAds;

public class FANApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize the Audience Network SDK
        AudienceNetworkAds.initialize(this);
    }
}
