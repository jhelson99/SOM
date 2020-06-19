package com.jhelsoncarrillo.reciclerview.Adapter;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jhelsoncarrillo.reciclerview.BuildConfig;
import com.jhelsoncarrillo.reciclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder
{
    public RelativeLayout getRlContainer()
    {
        return rlContainer;
    }

    private RelativeLayout rlContainer;
    private CircleImageView circleImage;
    private TextView tvImage;
    private Button btnesc;

    private void initComponents(View itemView)
    {
        rlContainer = itemView.findViewById(R.id.rlListItem);
        circleImage = itemView.findViewById(R.id.civItem);
        tvImage = itemView.findViewById(R.id.tvImage);
        btnesc = itemView.findViewById(R.id.btescuchar);

    }



    public ViewHolder(@NonNull View itemView)
    {
        super(itemView);
        initComponents(itemView);
    }

    public CircleImageView getCircleImage()
    {
        return circleImage;
    }

    public TextView getTvImage()
    {
        return tvImage;
    }

    public Button getBtnesc()
    {
        return btnesc;
    }
}
