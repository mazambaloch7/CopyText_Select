package com.example.copytext_select;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ClipboardManager clipboardManager;
    TextView textView, textViewhlwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.textView);
        textViewhlwo = findViewById(R.id.textView2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                clipboardManager = (ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
                clipboardManager.setText(textView.getText().toString());
                Toast.makeText(MainActivity.this, "asdfsadfsadfasdf"+ textView.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });


        textViewhlwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                clipboardManager.setText(textViewhlwo.getText().toString());
            }
        });

    }
}
