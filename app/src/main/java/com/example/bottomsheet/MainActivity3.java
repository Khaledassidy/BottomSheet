package com.example.bottomsheet;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

//activity btale3 login w sign up mn 5elel l buttom sheet bas la n2ol eno 3ana hala2 2 bottom sheet wa7de betle3 ta3et edit,delet..etc w a7de betla3e recycle view

public class MainActivity3 extends AppCompatActivity {

    Button buttonsheet1,Buttonsheet2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        buttonsheet1=findViewById(R.id.buttonsheet1);
        Buttonsheet2=findViewById(R.id.buttonsheet2);

        buttonsheet1.setOnClickListener(v->{
            new CostumeBottomsheetDialogFragment().show(getSupportFragmentManager(),"dialog1");

        });

        Buttonsheet2.setOnClickListener(v->{
            new CostumeBottomsheetDialogFragment2().show(getSupportFragmentManager(),"dialog2");

        });


    }
}