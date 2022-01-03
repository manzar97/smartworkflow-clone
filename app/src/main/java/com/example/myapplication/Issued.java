package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class Issued extends Fragment implements AdapterView.OnItemSelectedListener {
    //Spinner spinner;
    RecyclerView recyclerview;
    LinearLayoutManager layoutManager;
    List<ModelClass> permits;
    Adapter adapter1;

    public Issued() {
        /* Required empty public constructor */
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_issued, container, false);

        String[] paths = {"item 1", "item 2", "item 3"};
        Spinner spinner = (Spinner) v.findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(), android.R.layout.simple_spinner_item, paths);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        initData();
        recyclerview=v.findViewById(R.id.permits);
//        adapter1 = new Adapter(getActivity(),permits);
//        RecyclerView.LayoutManager lm = new LinearLayoutManager(getContext());
        layoutManager=new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerview.setLayoutManager(layoutManager);
        adapter1=new Adapter(permits);
        recyclerview.setAdapter(adapter1);
        adapter1.notifyDataSetChanged();
        

        return v;
    }

    private void initData() {
        permits=new ArrayList<>();
        permits.add(new ModelClass(R.drawable.documents,"Han","12 Dec 2021","12:00 AM","_________________________________________________________________________________________________________________________"));
        permits.add(new ModelClass(R.drawable.documents,"Han","12 Dec 2021","12:00 AM","_________________________________________________________________________________________________________________________"));
        permits.add(new ModelClass(R.drawable.documents,"Han","12 Dec 2021","12:00 AM","_________________________________________________________________________________________________________________________"));
        permits.add(new ModelClass(R.drawable.documents,"Han","12 Dec 2021","12:00 AM","_________________________________________________________________________________________________________________________"));
        permits.add(new ModelClass(R.drawable.documents,"Han","12 Dec 2021","12:00 AM","_________________________________________________________________________________________________________________________"));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}