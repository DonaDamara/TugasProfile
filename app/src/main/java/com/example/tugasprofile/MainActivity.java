package com.example.tugasprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button_toast;
    private TextView myTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_toast = findViewById(R.id.button_toast);
        myTextView2 = findViewById(R.id.myTextView2);

        button_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView2.setText("Hello, Dona Damara-C2157201014 Kamu Berhasil Membuat Tugas Ini");
            }
         });
    }
}

