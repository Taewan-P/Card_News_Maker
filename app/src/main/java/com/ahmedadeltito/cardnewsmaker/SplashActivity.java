package com.ahmedadeltito.cardnewsmaker;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

/**
 * Created by kiera on 2017. 12. 1..
 */

public class SplashActivity extends Activity {

    private final int SPLASH_DISPLAY_LENGTH = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try{
            Thread.sleep(SPLASH_DISPLAY_LENGTH); // 1 seconds
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
