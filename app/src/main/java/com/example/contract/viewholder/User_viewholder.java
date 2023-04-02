package com.example.contract.viewholder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contract.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class User_viewholder extends RecyclerView.ViewHolder {
    public TextView name,email,phone;
    public CircleImageView imageView;
    public AppCompatButton button;
    public User_viewholder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
        email=itemView.findViewById(R.id.email);
        phone=itemView.findViewById(R.id.phone);
        imageView=itemView.findViewById(R.id.profile_image);
        button=itemView.findViewById(R.id.button);
    }
}
