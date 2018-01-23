package io.github.abhimanbhau.paidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btnProcess);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new RunnableWhile().run();
                Toast.makeText(getApplicationContext(), "Process Complete!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
