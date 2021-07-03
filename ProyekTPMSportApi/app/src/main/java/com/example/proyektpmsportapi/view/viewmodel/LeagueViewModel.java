package com.example.proyektpmsportapi.view.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.proyektpmsportapi.model.league.LeagueItem;
import com.example.proyektpmsportapi.model.league.LeagueResponse;
import com.example.proyektpmsportapi.model.standingteam.StandingTeamItem;
import com.example.proyektpmsportapi.model.standingteam.StandingTeamResponse;
import com.example.proyektpmsportapi.service.ApiMain;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LeagueViewModel extends ViewModel {
    private ApiMain apiMain;

    private MutableLiveData<ArrayList<LeagueItem>> listLeague = new MutableLiveData<>();

    public void setLeagueDiscover() {
        if (this.apiMain == null) {
            apiMain = new ApiMain();
        }

        apiMain.getApiLeague().getLeagueDiscover().enqueue(new Callback<LeagueResponse>() {
            @Override
            public void onResponse(Call<LeagueResponse> call, Response<LeagueResponse> response) {
                LeagueResponse discoverResponse = response.body();
                if (discoverResponse != null && discoverResponse.getLeagues() != null) {
                    ArrayList<LeagueItem> leaguesItems = discoverResponse.getLeagues();
                    listLeague.postValue(leaguesItems);
                }
            }

            @Override
            public void onFailure(Call<LeagueResponse> call, Throwable t) {

            }
        });
    }

    public LiveData<ArrayList<LeagueItem>> getLeagueDiscover() {
        return listLeague;
    }

    private MutableLiveData<ArrayList<StandingTeamItem>> listStanding = new MutableLiveData<>();

    public void setStandingDiscover(String leagueId, String year) {
        if (this.apiMain == null) {
            apiMain = new ApiMain();
        }

        apiMain.getApiLeague().getStandingDiscover(leagueId,year).enqueue(new Callback<StandingTeamResponse>() {
            @Override
            public void onResponse(Call<StandingTeamResponse> call, Response<StandingTeamResponse> response) {
                StandingTeamResponse discoverResponse = response.body();
                if (discoverResponse != null && discoverResponse.getTable() != null) {
                    ArrayList<StandingTeamItem> standingItems = discoverResponse.getTable();
                    listStanding.postValue(standingItems);
                }
            }

            @Override
            public void onFailure(Call<StandingTeamResponse> call, Throwable t) {

            }
        });
    }

    public LiveData<ArrayList<StandingTeamItem>> getStandingDiscover() {
        return listStanding;
    }
}
