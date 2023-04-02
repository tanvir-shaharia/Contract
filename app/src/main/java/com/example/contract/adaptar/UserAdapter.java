package com.example.contract.adaptar;

import android.content.Context;
import android.content.Intent;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.contract.DteilsActivity;
import com.example.contract.R;
import com.example.contract.data.Userinfo;
import com.example.contract.viewholder.User_viewholder;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<User_viewholder> {
    Context context;
    List<Userinfo> userinfoList;

    public UserAdapter(Context context, List<Userinfo> userinfoList) {
        this.context = context;
        this.userinfoList = userinfoList;
    }

    @NonNull
    @Override
    public User_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.user_item,parent,false);
        return new User_viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull User_viewholder holder, int position) {
    Userinfo userinfo=userinfoList.get(position);
    holder.name.setText(userinfo.getName());
    holder.email.setText(userinfo.getEmail());
    holder.phone.setText(userinfo.getPhone());
    Glide.with(context).load(userinfo.getProfile()).into(holder.imageView);
    holder.button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent=new Intent(context, DteilsActivity.class);
            intent.putExtra("img",userinfo.getProfile());
            intent.putExtra("nam",userinfo.getName());
            intent.putExtra("eml",userinfo.getEmail());
            intent.putExtra("phn",userinfo.getPhone());
            context.startActivity(intent);
        }
    });
    }

    @Override
    public int getItemCount() {
        return userinfoList.size();
    }
}
