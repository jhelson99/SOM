package com.example.recyclerview.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerview.App.Buy;
import com.example.recyclerview.App.Lyrics;
import com.example.recyclerview.App.Playlist_1;
import com.example.recyclerview.BuildConfig;
import com.example.recyclerview.R;

import java.util.ArrayList;

import static androidx.core.content.ContextCompat.startActivity;

public class RVAdapter extends RecyclerView.Adapter<ViewHolder>
{
    private static final String TAG = "RVAdapter";
    private Context context;
    private  ArrayList<String> imageNames= new ArrayList<>();
    private  ArrayList<String> imagesURI= new ArrayList<>();

    private  ArrayList<String> imagesURI1= new ArrayList<>();
    private  ArrayList<String> imagesURI2= new ArrayList<>();
    private  ArrayList<String> imagesURI3= new ArrayList<>();

    private  ArrayList<String> btNames= new ArrayList<>();

    public RVAdapter(Context context, ArrayList<String> imageNames, ArrayList<String> imagesURI, ArrayList<String> imagesURI1 ,
                     ArrayList<String> imagesURI2,ArrayList<String> imagesURI3,ArrayList<String> btNames)
    {
        this.context=context;
        this.imageNames=imageNames;
        this.imagesURI=imagesURI;
        this.imagesURI1=imagesURI1;
        this.imagesURI2=imagesURI2;
        this.imagesURI3=imagesURI3;
        this.btNames=btNames;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_list_item,viewGroup,false);
        ViewHolder vHolder = new ViewHolder(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position)
    {
        String URI = "https://i.imgur.com/";
        Glide.with(context)
                .asBitmap()
                .load(URI + imagesURI.get(position)+ ".png")
                .into(holder.getCircleImage());
        holder.getTvImage().setText(imageNames.get(position));
        holder.getTvImage().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context,"My " +imageNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        holder.getEscu().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                switch (btNames.get(position))
                {
                    case "Lyrics":
                        Intent in0 = new Intent(context, Lyrics.class);
                        context.startActivity(in0);
                        break;
                    case "Buy":
                        Intent in1 = new Intent(context, Buy.class);
                        context.startActivity(in1);
                        break;
                }
            }
        });


        Glide.with(context)
                .asBitmap()
                .load(URI + imagesURI1.get(position)+ ".png")
                .into(holder.getCircleImage1());

        Glide.with(context)
                .asBitmap()
                .load(URI + imagesURI2.get(position)+ ".png")
                .into(holder.getCircleImage2());
        Glide.with(context)
                .asBitmap()
                .load(URI + imagesURI3.get(position)+ ".png")
                .into(holder.getCircleImage3());
        holder.getTvImage().setText(imageNames.get(position));
        holder.getCircleImage1().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context,"Play Music " , Toast.LENGTH_SHORT).show();
            }
        });
        holder.getCircleImage2().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context,"Pause Music " , Toast.LENGTH_SHORT).show();
            }
        });
        holder.getCircleImage3().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Stop Music " , Toast.LENGTH_SHORT).show();
            }
        });

        holder.getEscu().setText(btNames.get(position));

    }

    @Override
    public int getItemCount()
    {
        return imageNames.size();
    }
}
