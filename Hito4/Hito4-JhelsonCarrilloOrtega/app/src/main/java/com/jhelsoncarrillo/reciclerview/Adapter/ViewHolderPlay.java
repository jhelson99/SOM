package com.jhelsoncarrillo.reciclerview.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jhelsoncarrillo.reciclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolderPlay extends RecyclerView.ViewHolder
{
    public RelativeLayout getRlContainer()
    {
        return rlPlaylist;
    }

    private RelativeLayout rlPlaylist;
    private TextView tvMusic;
    private CircleImageView circleImage1,circleImage2, circleImage3;


    private void initComponents(View itemView)
    {
        rlPlaylist = itemView.findViewById(R.id.rlListPlay);
        tvMusic = itemView.findViewById(R.id.tvSong);
        circleImage1 = itemView.findViewById(R.id.imgView1);
        circleImage2 = itemView.findViewById(R.id.imgView2);
        circleImage3 = itemView.findViewById(R.id.imgView3);

    }

    public ViewHolderPlay(@NonNull View itemView)
    {
        super(itemView);
        initComponents(itemView);
    }

    public TextView getTvMusic() {
        return tvMusic;
    }

    public CircleImageView getCircleImage1() {
        return circleImage1;
    }

    public CircleImageView getCircleImage2() {
        return circleImage2;
    }

    public CircleImageView getCircleImage3() {
        return circleImage3;
    }
}
