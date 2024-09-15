package com.example.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;
/*
Bottomsheet:3ebra 3an sha8le betetla3 mnta7t shshe mn l bottom heye 3ebra 3an dialog bekoun b2lba commponent feek tetfe3al ma3a
howe no3 mn anwa3 dialog btetla3 mn ta7t shshe w bt5ale l activity tseer shahfefe w ykoun l focus 3ala l dialog heda w feek tetfe3al ma3a la hay dialog heye bteshbah enta bas ta3mel share la vedio 3al isnatgram la she sha5s bytla3 3andak dialog w feha kel l asha5as l freidn le feek teb3tla heda l vedio
fa hala2 bade 2a3mel wa7de bas ekbous 3ala button tetl3le b2lba icons wa7de edet wa7de share wa7de delete..ect
ba3den bade 2a3mel shakl la hyde l bottom mn 5elel l drawble file 7otela color w redius..ect
ba3den bade 2a3mel costume layout la hay dialog















 */










public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.buttomsheet);

        button.setOnClickListener(v->{
            showdialog();
        });

    }

    private void showdialog() {
        BottomSheetDialog dialog=new BottomSheetDialog(this);
        View view= LayoutInflater.from(this).inflate(R.layout.bottomsheetlayout,null);
        dialog.setContentView(view);
        dialog.show();






    }
}