package com.jhelsoncarrillo.reciclerview.Apps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jhelsoncarrillo.reciclerview.Adapter.RVAdapter;
import com.jhelsoncarrillo.reciclerview.Adapter.RVAdapterPlay;
import com.jhelsoncarrillo.reciclerview.R;

import java.util.ArrayList;
import java.util.Arrays;

public class Playlist extends AppCompatActivity
{
    private RecyclerView recyclerView;
    private RVAdapterPlay rvAdapterPlay;
    private ArrayList<String> imagesName = new ArrayList<>();
    private ArrayList<String> imagesURL1 = new ArrayList<>();
    private ArrayList<String> imagesURL2 = new ArrayList<>();
    private ArrayList<String> imagesURL3 = new ArrayList<>();

    private final String imgURL1 = "59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq,59AoTWq";
    private final String imgURL2 = "2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,2Nat0RQ,";
    private final String imgURL3 = "LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,LJjdlQe,";

    private final String imgNam = "Cancion 1,Cancion 2,Cancion 3,Cancion 4,Cancion 5,Cancion 6,Cancion 7,Cancion 8,Cancion 9,Cancion 10,Cancion 11";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        initImageBitMaps();
        initRecyclerView();
    }

    public void initImageBitMaps()
    {
        imagesName.addAll(Arrays.asList(imgNam.split(",")));
        imagesURL1.addAll(Arrays.asList(imgURL1.split(",")));
        imagesURL3.addAll(Arrays.asList(imgURL2.split(",")));
        imagesURL3.addAll(Arrays.asList(imgURL3.split(",")));

    }

    public void initRecyclerView()
    {
        recyclerView = findViewById(R.id.rvPlay);
        rvAdapterPlay = new RVAdapterPlay(this, imagesName, imagesURL1, imagesURL2, imagesURL3);
        recyclerView.setAdapter(rvAdapterPlay);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
