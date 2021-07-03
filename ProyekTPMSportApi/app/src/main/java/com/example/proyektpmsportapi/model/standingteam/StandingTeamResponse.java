package com.example.proyektpmsportapi.model.standingteam;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class StandingTeamResponse{

	@SerializedName("table")
	private ArrayList<StandingTeamItem> table;

	public void setTable(ArrayList<StandingTeamItem> table){
		this.table = table;
	}

	public ArrayList<StandingTeamItem> getTable(){
		return table;
	}

	@Override
 	public String toString(){
		return 
			"StandingTeamResponse{" + 
			"table = '" + table + '\'' + 
			"}";
		}
}