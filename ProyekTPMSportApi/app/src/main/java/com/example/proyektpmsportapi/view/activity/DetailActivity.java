package com.example.proyektpmsportapi.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.proyektpmsportapi.R;
import com.example.proyektpmsportapi.view.viewmodel.LeagueViewModel;

public class DetailActivity extends AppCompatActivity {
    private TextView tvTitleDesc, tvCountryDesc, tvFormedDesc, tvCurrsessDesc, tvLock, tvDesc;
    private ImageView imgDesc;

    private LeagueViewModel leagueViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitleDesc = findViewById(R.id.t_title_decs);
        tvCountryDesc = findViewById(R.id.tv_d_country_desc);
        tvFormedDesc = findViewById(R.id.tv_d_formedyear_desc);
        tvCurrsessDesc = findViewById(R.id.tv_d_currsess_desc);
        tvLock = findViewById(R.id.tv_d_locked_desc);
        tvDesc = findViewById(R.id.t_desc);
        imgDesc = findViewById(R.id.img_desc);

        String title = getIntent().getStringExtra("title");
        String country = getIntent().getStringExtra("country");
        String formed = getIntent().getStringExtra("formed");
        String currsess = getIntent().getStringExtra("currsess");
        String lock = getIntent().getStringExtra("lock");
        String desc = getIntent().getStringExtra("desc");
        String image = getIntent().getStringExtra("image");

        Glide.with(this).load(image).into(imgDesc);
        tvTitleDesc.setText(title);
        tvCountryDesc.setText(country);
        tvFormedDesc.setText(formed);
        tvCurrsessDesc.setText(currsess);
        tvLock.setText(lock);
        tvDesc.setText(desc);
    }
}