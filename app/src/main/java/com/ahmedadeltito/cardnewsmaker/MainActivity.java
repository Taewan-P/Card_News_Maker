package com.ahmedadeltito.cardnewsmaker;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.yellowten.cardnewsmaker.LicenseActivity;

public class MainActivity extends MediaActivity {


    public void openUserGallery(View view) {
        openGallery();
    }

    public void openUserCamera(View view) {
        startCameraActivity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Activity transition Code
        Button button1 = (Button)findViewById(R.id.licensecbtn);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Activity transition Code
                Intent intent = new Intent(getApplicationContext(), LicenseActivity.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button)findViewById(R.id.websitebtn);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Activity transition Code
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bit.ly/2khR4di"));
                startActivity(intent);
            }
        });
    }




    @Override
    protected void onPhotoTaken() {
        Intent intent = new Intent(MainActivity.this, PhotoEditorActivity.class);
        intent.putExtra("selectedImagePath", selectedImagePath);
        startActivity(intent);
    }
}