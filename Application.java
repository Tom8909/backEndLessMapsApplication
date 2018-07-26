package com.example.tom.backendlessmap;

import com.backendless.Backendless;

public class Application extends android.app.Application
{
    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl("https://api.backendless.com"); //connecting to API
        Backendless.initApp(getApplicationContext(), "74536495-97D5-2601-FF76-FDC266F32800", "BC6CC239-4C2F-DEDD-FFA0-FCB7DE9A3F00" );
    }
}
