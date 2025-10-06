package com.example.btapchuyenactivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
public class ProfileActivity extends AppCompatActivity {

    ImageView imgSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        imgSetting = findViewById(R.id.imgSetting);


        // Khi bấm hình bánh xe thì quay lại Login (MainActivity)
        imgSetting.setOnClickListener(v -> {
            Intent backIntent = new Intent(ProfileActivity.this, MainActivity.class);
            backIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(backIntent);
            finish();
        });
    }
}
