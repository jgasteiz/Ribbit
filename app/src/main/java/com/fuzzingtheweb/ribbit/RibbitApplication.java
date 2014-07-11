package com.fuzzingtheweb.ribbit;

import android.app.Application;

import com.parse.Parse;

public class RibbitApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "GEJcUEKlbjawS08Mh71QaPEN6KQzQqRb1lp7SOd4", "4qZRzAhE5n9cWXPdxetKLCPsOq8KmBZrTlvQKyBv");
    }
}
