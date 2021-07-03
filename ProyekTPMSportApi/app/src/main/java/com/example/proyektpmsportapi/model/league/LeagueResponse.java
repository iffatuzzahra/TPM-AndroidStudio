package com.example.proyektpmsportapi.model.league;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class LeagueResponse{

	@SerializedName("countrys")
	private ArrayList<LeagueItem> countrys;

	public void setCountrys(ArrayList<LeagueItem> countrys){
		this.countrys = countrys;
	}

	public ArrayList<LeagueItem> getLeagues(){
		return countrys;
	}

	@Override
 	public String toString(){
		return 
			"LeagueResponse{" + 
			"countrys = '" + countrys + '\'' + 
			"}";
		}
}