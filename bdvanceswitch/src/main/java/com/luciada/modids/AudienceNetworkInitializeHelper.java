package com.luciada.modids;

import static com.luciada.modids.BuildConfig.DEBUG;

import android.content.Context;
import android.util.Log;

import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;

public class AudienceNetworkInitializeHelper
    implements AudienceNetworkAds.InitListener {


    public static void initialize(Context context) {
        if (!AudienceNetworkAds.isInitialized(context)) {
            if (DEBUG) {
                AdSettings.turnOnSDKDebugger(context);
            }

            AudienceNetworkAds
                .buildInitSettings(context)
                .withInitListener(new AudienceNetworkInitializeHelper())
                .initialize();
        }
    }

    @Override
    public void onInitialized(AudienceNetworkAds.InitResult result) {
        Log.e(AudienceNetworkAds.TAG, result.getMessage());
    }
}
