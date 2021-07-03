package com.example.proyektpmsportapi.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.proyektpmsportapi.R;
import com.example.proyektpmsportapi.adapter.LeagueAdapter;
import com.example.proyektpmsportapi.model.league.LeagueItem;
import com.example.proyektpmsportapi.view.viewmodel.LeagueViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LeagueAdapter leagueAdapter;
    private LeagueViewModel leagueViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leagueAdapter = new LeagueAdapter();
        leagueAdapter.notifyDataSetChanged();

        recyclerView = findViewById(R.id.rv_main);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        leagueViewModel= new ViewModelProvider(this).get(LeagueViewModel.class);
        leagueViewModel.setLeagueDiscover();
        leagueViewModel.getLeagueDiscover().observe(this, getLeagueDiscover);

        recyclerView.setAdapter(leagueAdapter);
    }
    private Observer<ArrayList<LeagueItem>> getLeagueDiscover = new Observer<ArrayList<LeagueItem>>() {
        @Override
        public void onChanged(ArrayList<LeagueItem> leaguesItems) {
            if (leaguesItems != null) {
                leagueAdapter.setData(leaguesItems);
            }
        }
    };
}