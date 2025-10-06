package com.example.btapchuyenactivity;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText edtText_Email, edtText_Password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtText_Email = findViewById(R.id.edtText_Email);
        edtText_Password = findViewById(R.id.edtText_Password);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(v -> {
            String email = edtText_Email.getText().toString().trim();
            String pass = edtText_Password.getText().toString().trim();

            if (email.equals("ngocdangiu") && pass.equals("ngocdangiu")) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                intent.putExtra("account_name", email);
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, "Sai tài khoản hoặc mật khẩu!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}