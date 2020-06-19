package com.jhelsoncarrillo.reciclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jhelsoncarrillo.reciclerview.R;

import java.util.ArrayList;

public class RVAdapterPlay extends RecyclerView.Adapter<ViewHolderPlay>
{
    private static final String TAG = "RVAdapterPlay";

    private Context context;
    private ArrayList<String> imageNames = new ArrayList<>();
    private  ArrayList<String> imagesURI1 = new ArrayList<>();
    private  ArrayList<String> imagesURI2 = new ArrayList<>();
    private  ArrayList<String> imagesURI3 = new ArrayList<>();

    public RVAdapterPlay(Context context, ArrayList<String> imageNames, ArrayList<String> imagesURI1, ArrayList<String> imagesURI2, ArrayList<String> imagesURI3)
    {
        this.context = context;
        this.imageNames = imageNames;
        this.imagesURI1 = imagesURI1;
        this.imagesURI2 = imagesURI2;
        this.imagesURI3 = imagesURI3;
    }

    @Override
    public ViewHolderPlay onCreateViewHolder(ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rl_playlist_item, viewGroup,false);
        ViewHolderPlay vHolder = new ViewHolderPlay(view);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolderPlay holder, final int position)
    {
        String URI = "https://i.imgur.com/";
        Glide.with(context)
                .asBitmap()
                .load(URI + imagesURI1.get(position) + ".png")
                .into(holder.getCircleImage1());
        holder.getTvMusic().setText(imageNames.get(position));

        Glide.with(context)
                .asBitmap()
                .load(URI + imagesURI2.get(position) + ".png")
                .into(holder.getCircleImage2());

        Glide.with(context)
                .asBitmap()
                .load(URI + imagesURI3.get(position) + ".png")
                .into(holder.getCircleImage3());

        holder.getCircleImage1().setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context,"Play music",Toast.LENGTH_SHORT).show();
            }
        });
        holder.getCircleImage2().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context,"Pause music",Toast.LENGTH_SHORT).show();
            }
        });
        holder.getCircleImage3().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(context,"Stop music",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return imageNames.size();
    }
}
