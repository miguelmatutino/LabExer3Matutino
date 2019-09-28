package com.matutino.louis;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String FILENAME = "subjects";
         final int READ_BLOCK_SIZE = 100;
        String itemList[]={};
        try {
            FileInputStream fileIn = openFileInput(FILENAME);
            //     InputStreamReader InputRead= new InputStreamReader(fileIn);
//
            //      char[] inputBuffer= new char[READ_BLOCK_SIZE];
            String s = "";
            //     int charRead;

            //     while ((charRead=InputRead.read(inputBuffer))>0) {
            // char to string conversion
            //         String readstring=String.copyValueOf(inputBuffer,0,charRead);
            //      s+=readstring;
            int c = fileIn.read();
         String temp = "";
                 temp = temp + Character.toString((char)c);

            itemList = temp.split("\n");
            CheckBox check1 = (CheckBox) findViewById(R.id.checkBox);
            check1.setText(itemList[0]);
            CheckBox check2 = (CheckBox) findViewById(R.id.checkBox);
            check2.setText(itemList[1]);
            CheckBox check3 = (CheckBox) findViewById(R.id.checkBox);
            check3.setText(itemList[2]);
            CheckBox check4 = (CheckBox) findViewById(R.id.checkBox);
            check4.setText(itemList[3]);
            CheckBox check5 = (CheckBox) findViewById(R.id.checkBox);
            check5.setText(itemList[4]);
            CheckBox check6 = (CheckBox) findViewById(R.id.checkBox);
            check6.setText(itemList[5]);
            CheckBox check7 = (CheckBox) findViewById(R.id.checkBox);
            check7.setText(itemList[6]);
            CheckBox check8 = (CheckBox) findViewById(R.id.checkBox);
            check8.setText(itemList[7]);
        //}
          //  InputRead.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void nextScreen(View V){
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }
    private Button btnDisplay;
    public void addListenerOnButton() {

        final  CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox);
        final   CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        final   CheckBox cb3 = (CheckBox) findViewById(R.id.checkBox3);
        final    CheckBox cb4 = (CheckBox) findViewById(R.id.checkBox4);
        final    CheckBox cb5 = (CheckBox) findViewById(R.id.checkBox5);
        final    CheckBox cb6 = (CheckBox) findViewById(R.id.checkBox6);
        final    CheckBox cb7 = (CheckBox) findViewById(R.id.checkBox7);
        final   CheckBox cb8 = (CheckBox) findViewById(R.id.checkBox8);
        btnDisplay = (Button) findViewById(R.id.button4);
        btnDisplay.setOnClickListener(new OnClickListener() {

            //Run when button is clicked
            @Override
            public void onClick(View v) {

                StringBuffer result = new StringBuffer();
                result.append("These subjects are taken");
                result.append(cb1.getText()).append(cb1.isChecked());
                result.append(cb2.getText()).append(cb2.isChecked());
                result.append(cb3.getText()).append(cb3.isChecked());
                result.append(cb4.getText()).append(cb4.isChecked());
                result.append(cb5.getText()).append(cb5.isChecked());
                result.append(cb6.getText()).append(cb6.isChecked());
                result.append(cb7.getText()).append(cb7.isChecked());
                result.append(cb8.getText()).append(cb8.isChecked());

                Toast.makeText(Main2Activity.this, result.toString(),
                        Toast.LENGTH_LONG).show();

            }
        });

    }
        public void onClick(View V){

        }
    }

