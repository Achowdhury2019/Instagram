package com.codepath.aishac.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MmprbVQadK34imcwEFhdF9S4CKWoXDDaKSzdfknB")
                .clientKey("0T0LTrjtZrvLyppCffST7pn8SHVz00wM4QUQ9kFH")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
