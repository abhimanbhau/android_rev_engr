package io.github.abhimanbhau.paidapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText username, password;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.userName);
        password = findViewById(R.id.password);

        register = findViewById(R.id.btnRegister);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerApp();
            }
        });
    }

    private void registerApp() {
        if (!SecureRegistration.isLegit(username.getText().toString(), password.getText().toString())) {
            Toast.makeText(this, "WRNG_APPL_KEY_PL_PRCHS_APP", Toast.LENGTH_SHORT).show();
        }
        if (SecureRegistration.isLegit(username.getText().toString(), password.getText().toString())) {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
    }
}
