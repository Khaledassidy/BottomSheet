package com.example.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;


//bottomsheet with recycle view
public class MainActivity2 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=findViewById(R.id.reccyel_bottomsheet);

        button.setOnClickListener(v->{
            BottomSheetDialog dialog=new BottomSheetDialog(this, com.google.android.material.R.style.Base_Theme_Material3_Light_BottomSheetDialog);
            View view= LayoutInflater.from(this).inflate(R.layout.costumebottomsheetforrecyle,null);
            dialog.setContentView(view);
            ArrayList<String> arrayList=new ArrayList<>();
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            arrayList.add("khaled");
            recyelview recyelview=new recyelview(arrayList);
            RecyclerView recyclerView=dialog.findViewById(R.id.recyel);
            RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(recyelview);
            dialog.show();
        });

    }
}