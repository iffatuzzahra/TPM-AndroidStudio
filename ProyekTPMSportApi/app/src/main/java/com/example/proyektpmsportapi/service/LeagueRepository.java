package com.example.proyektpmsportapi.service;

import com.example.proyektpmsportapi.model.league.LeagueResponse;
import com.example.proyektpmsportapi.model.standingteam.StandingTeamResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LeagueRepository {

    @GET("search_all_leagues.php?s=Soccer")
    Call<LeagueResponse> getLeagueDiscover();

    @GET("lookuptable.php?")
    Call<StandingTeamResponse> getStandingDiscover(@Query("l") String leagueId, @Query("s") String year);

}
