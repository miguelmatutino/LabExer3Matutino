package com.matutino.louis;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2, e3, e4, e5, e6, e7, e8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uSave(View V) {
        e1 = findViewById(R.id.editText);
        e2 = findViewById(R.id.editText2);
        e3 = findViewById(R.id.editText3);
        e4 = findViewById(R.id.editText4);
        e5 = findViewById(R.id.editText5);
        e6 = findViewById(R.id.editText6);
        e7 = findViewById(R.id.editText7);
        e8 = findViewById(R.id.editText8);


        String c1 = e1.getText().toString();
        String c2 = e2.getText().toString();
        String c3 = e3.getText().toString();
        String c4 = e4.getText().toString();
        String c5 = e5.getText().toString();
        String c6 = e6.getText().toString();
        String c7 = e7.getText().toString();
        String c8 = e8.getText().toString();
        String cArray[] = {c1, c2, c3, c4, c5, c6, c7, c8};
        String FILENAME = "subjects";
        for (int i = 0; i <= 7; i++) {

            String entry = cArray[i] + "\n";
            try {
                FileOutputStream out = openFileOutput(FILENAME, Context.MODE_APPEND);
                out.write(entry.getBytes());
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Toast.makeText(this, "Course Saved", Toast.LENGTH_LONG).show();
    }

    public void nextScreen(View V) {
        Intent intent1 = new Intent(this, Main2Activity.class);



        startActivity(intent1);


    }
}

