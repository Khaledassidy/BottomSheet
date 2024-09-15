package com.example.bottomsheet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.ArrayList;

public class CostumeBottomsheetDialogFragment2 extends BottomSheetDialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.costumebottomsheetforrecyle,container,false);
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
        RecyclerView recyclerView=view.findViewById(R.id.recyel);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(view.getContext(),RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyelview);
        return view;
    }
}
