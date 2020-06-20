package com.example.recyclerview.Adapter;


import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;



import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;


public class ViewHolder extends RecyclerView.ViewHolder
{

    private RelativeLayout rlContainer;
    private CircleImageView circleImage;
    private TextView tvImage;
    private CircleImageView circleImage1;
    private CircleImageView circleImage2;
    private CircleImageView circleImage3;
    private Button escu;
    public ViewHolder( View itemView)
    {
        super(itemView);
        initComponents(itemView);
    }

    private void initComponents(View itemView)
    {
        rlContainer= itemView.findViewById(R.id.rlListItem);
        circleImage= itemView.findViewById(R.id.civItem);
        tvImage= itemView.findViewById(R.id.tvImage);
        escu=itemView.findViewById(R.id.skip1);
        circleImage1= itemView.findViewById(R.id.civItem1);
        circleImage2= itemView.findViewById(R.id.civItem2);
        circleImage3= itemView.findViewById(R.id.civItem3);
    }

    public RelativeLayout getRlContainer()
    {
        return rlContainer;
    }

    public CircleImageView getCircleImage()
    {
        return circleImage;
    }

    public TextView getTvImage()
    {
        return tvImage;
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

    public  Button getEscu()
    {
        return escu;
    }

}
