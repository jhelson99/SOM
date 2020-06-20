package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.example.recyclerview.Adapter.RVAdapter;
import com.example.recyclerview.App.Playlist_1;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private RVAdapter rvAdapter;
    private ArrayList<String> imagesName = new ArrayList<>();
    private ArrayList<String> imagesURL = new ArrayList<>();

    private ArrayList<String> imagesURL1 = new ArrayList<>();
    private ArrayList<String> imagesURL2 = new ArrayList<>();
    private ArrayList<String> imagesURL3 = new ArrayList<>();

    private ArrayList<String> btNames = new ArrayList<>();

    private final String imUR="VlGGqmG,DWX6eGn,EpmxiT3,V9Pcw5j,HkEJ5K4,DaXpXsG,0IRvKpq,XUZw40U,mjR9oaO";
    private final String imName="Whastapp,Twitter,Youtube,Snapchat,Instagram,Google+,Pinterest,LinkedIN,Facebook";

    private final String imUR1="59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq";
    private final String imUR2="2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ";
    private final String imUR3="LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe";

    private final String btName="Lyrics,Buy,Lyrics,Buy,Lyrics,Buy,Lyrics,Buy,Lyrics";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initImageBitMaps();
        initRecyclerView();
    }

    public void initImageBitMaps()
    {

        imagesURL.addAll(Arrays.asList(imUR.split(",")));
        imagesName.addAll(Arrays.asList(imName.split(",")));
        imagesURL1.addAll(Arrays.asList(imUR1.split(",")));
        imagesURL2.addAll(Arrays.asList(imUR2.split(",")));
        imagesURL3.addAll(Arrays.asList(imUR3.split(",")));
        btNames.addAll(Arrays.asList(btName.split(",")));


    }

    public void initRecyclerView()
    {
        recyclerView = findViewById(R.id.rvContainer);
        rvAdapter = new RVAdapter(this, imagesName, imagesURL, imagesURL1, imagesURL2, imagesURL3, btNames);
        recyclerView.setAdapter(rvAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}