package com.example.contract;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DteilsActivity extends AppCompatActivity {
    ImageView imageView;
    TextView name,email,phone,message;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dteils);
        imageView=findViewById(R.id.image_view);
        name=findViewById(R.id.name);
        email=findViewById(R.id.email);
        phone=findViewById(R.id.phone);
        message=findViewById(R.id.massage);
        intent=getIntent();
        String img =intent.getStringExtra("img");
        String nam =intent.getStringExtra("nam");
        String eml =intent.getStringExtra("eml");
        String phn =intent.getStringExtra("phn");
        Glide.with(DteilsActivity.this).load(img).into(imageView);
        name.setText(nam);
        email.setText(eml);
        phone.setText(phn);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:"+eml)); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_SUBJECT,"subject");
                intent.putExtra(Intent.EXTRA_TEXT,"body");
                startActivity(intent);
            }
        });
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+phn)); // only email apps should handle this
                startActivity(intent);
            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("smsto:"+phn)); // only email apps should handle this
                startActivity(intent);
            }
        });
    }
}