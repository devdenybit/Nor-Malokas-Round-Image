package com.luciada.normotos;
import android.content.res.Resources;
import com.luciada.modids.Applicationclass;
public class MyApplicationclass extends Applicationclass {
    private static MyApplicationclass myApp;
    public static Resources resource;
    @Override
    public void onCreate() {
        super.onCreate();
        resource = getResources();
        myApp = this;
    }
}

