package com.example.myapplication;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogActivity extends AppCompatActivity {
    Button btnSimple,btnList,btnRadio;

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        btnSimple=findViewById(R.id.btnSimpleDialog);
        btnSimple.setOnClickListener(V-> showSimpleDialog());

//        btnList=findViewById(R.id.btnList);
//        btnList.setOnClickListener(V ->showListDialog());

        btnRadio=findViewById(R.id.btnRadio);
        btnRadio.setOnClickListener(V ->showRadioDialog());


    }
    private void showSimpleDialog(){
        new AlertDialog.Builder( LogActivity.this).setTitle("Exit App")
                .setMessage("Do you want to exit")
                .setPositiveButton("yes",(dialog,which)->finish())
                .setNegativeButton("No",null)
                .show();
    }
//    private void showListDialog(){
//        String[] items={"Java","kotlin"};
//        new AlertDialog.Builder(LogActivity.this).setTitle("Choose a language")
//                .setItems(items,(dialog,which)-> Toast.makeText(LogActivity.this,"you selected "+items[which],
//                        Toast.LENGTH_SHORT).show()).show();
//    }

    private void  showRadioDialog(){
        String[] alphabets={"J","k","l","m"};
        final int[] selectedIndex={0};
        new AlertDialog.Builder(LogActivity.this).setTitle("Choose an alphabet")
                .setSingleChoiceItems(alphabets, 0,  (dialog, which) ->
                        selectedIndex[0] = which).setPositiveButton("Ok", (dialog, which) ->
                        Toast.makeText(LogActivity.this, "You chose: " +
                                alphabets[selectedIndex[0]], Toast.LENGTH_SHORT).show())
                .setNegativeButton("Cancel", null
                ).show();


    }


}
