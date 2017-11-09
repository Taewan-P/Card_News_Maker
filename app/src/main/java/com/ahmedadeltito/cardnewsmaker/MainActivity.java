package com.ahmedadeltito.cardnewsmaker;

import android.content.Intent;
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

        // 액티비티 전환
        Button button1 = (Button)findViewById(R.id.licensecbtn);

        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "라이선스 명시", Toast.LENGTH_LONG).show();

                // 액티비티 전환 코드
                Intent intent = new Intent(getApplicationContext(), LicenseActivity.class);
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
