package com.abbinante.parstagram;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class); /* Register Post class. */
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("BQLobqTW3PZ8eGCnHkp9NnuSdiJLO6DDyqTLURlM")
                .clientKey("XCKkpJFIwYGhI5B2iIL34bscQA4UZfsfp2NrI8Uz")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}