package com.example.proyektpmsportapi.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proyektpmsportapi.R;
import com.example.proyektpmsportapi.adapter.StandingteamAdapter;
import com.example.proyektpmsportapi.model.standingteam.StandingTeamItem;
import com.example.proyektpmsportapi.view.viewmodel.LeagueViewModel;

import java.util.ArrayList;

public class StandingteamActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StandingteamAdapter standingteamAdapter;
    private LeagueViewModel leagueViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standingteam);

        String leagueId = getIntent().getStringExtra("leagueId");
        String year = getIntent().getStringExtra("year");

        standingteamAdapter = new StandingteamAdapter();

        recyclerView = findViewById(R.id.rv_standingteam);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        leagueViewModel= new ViewModelProvider(this).get(LeagueViewModel.class);
        leagueViewModel.setStandingDiscover(leagueId,year);
        leagueViewModel.getStandingDiscover().observe(this, getStandingDiscover);

        recyclerView.setAdapter(standingteamAdapter);
    }
    private Observer<ArrayList<StandingTeamItem>> getStandingDiscover = new Observer<ArrayList<StandingTeamItem>>() {
        @Override
        public void onChanged(ArrayList<StandingTeamItem> standingItems) {
            if (standingItems != null) {
                standingteamAdapter.setData(standingItems);
            }
        }
    };
}