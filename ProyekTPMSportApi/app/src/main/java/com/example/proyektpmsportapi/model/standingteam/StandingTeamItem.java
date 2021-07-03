package com.example.proyektpmsportapi.model.standingteam;

import com.google.gson.annotations.SerializedName;

public class StandingTeamItem {

	@SerializedName("strTeam")
	private String strTeam;

	@SerializedName("intGoalsAgainst")
	private String intGoalsAgainst;

	@SerializedName("intPoints")
	private String intPoints;

	@SerializedName("intGoalDifference")
	private String intGoalDifference;

	@SerializedName("intGoalsFor")
	private String intGoalsFor;

	@SerializedName("intPlayed")
	private String intPlayed;

	@SerializedName("idTeam")
	private String idTeam;

	@SerializedName("strTeamBadge")
	private String strTeamBadge;

	@SerializedName("dateUpdated")
	private String dateUpdated;

	@SerializedName("strDescription")
	private String strDescription;

	@SerializedName("strForm")
	private String strForm;

	@SerializedName("idStanding")
	private String idStanding;

	@SerializedName("intDraw")
	private String intDraw;

	@SerializedName("intRank")
	private String intRank;

	@SerializedName("intLoss")
	private String intLoss;

	@SerializedName("strLeague")
	private String strLeague;

	@SerializedName("intWin")
	private String intWin;

	@SerializedName("idLeague")
	private String idLeague;

	@SerializedName("strSeason")
	private String strSeason;

	public void setStrTeam(String strTeam){
		this.strTeam = strTeam;
	}

	public String getStrTeam(){
		return strTeam;
	}

	public void setIntGoalsAgainst(String intGoalsAgainst){
		this.intGoalsAgainst = intGoalsAgainst;
	}

	public String getIntGoalsAgainst(){
		return intGoalsAgainst;
	}

	public void setIntPoints(String intPoints){
		this.intPoints = intPoints;
	}

	public String getIntPoints(){
		return intPoints;
	}

	public void setIntGoalDifference(String intGoalDifference){
		this.intGoalDifference = intGoalDifference;
	}

	public String getIntGoalDifference(){
		return intGoalDifference;
	}

	public void setIntGoalsFor(String intGoalsFor){
		this.intGoalsFor = intGoalsFor;
	}

	public String getIntGoalsFor(){
		return intGoalsFor;
	}

	public void setIntPlayed(String intPlayed){
		this.intPlayed = intPlayed;
	}

	public String getIntPlayed(){
		return intPlayed;
	}

	public void setIdTeam(String idTeam){
		this.idTeam = idTeam;
	}

	public String getIdTeam(){
		return idTeam;
	}

	public void setStrTeamBadge(String strTeamBadge){
		this.strTeamBadge = strTeamBadge;
	}

	public String getStrTeamBadge(){
		return strTeamBadge;
	}

	public void setDateUpdated(String dateUpdated){
		this.dateUpdated = dateUpdated;
	}

	public String getDateUpdated(){
		return dateUpdated;
	}

	public void setStrDescription(String strDescription){
		this.strDescription = strDescription;
	}

	public String getStrDescription(){
		return strDescription;
	}

	public void setStrForm(String strForm){
		this.strForm = strForm;
	}

	public String getStrForm(){
		return strForm;
	}

	public void setIdStanding(String idStanding){
		this.idStanding = idStanding;
	}

	public String getIdStanding(){
		return idStanding;
	}

	public void setIntDraw(String intDraw){
		this.intDraw = intDraw;
	}

	public String getIntDraw(){
		return intDraw;
	}

	public void setIntRank(String intRank){
		this.intRank = intRank;
	}

	public String getIntRank(){
		return intRank;
	}

	public void setIntLoss(String intLoss){
		this.intLoss = intLoss;
	}

	public String getIntLoss(){
		return intLoss;
	}

	public void setStrLeague(String strLeague){
		this.strLeague = strLeague;
	}

	public String getStrLeague(){
		return strLeague;
	}

	public void setIntWin(String intWin){
		this.intWin = intWin;
	}

	public String getIntWin(){
		return intWin;
	}

	public void setIdLeague(String idLeague){
		this.idLeague = idLeague;
	}

	public String getIdLeague(){
		return idLeague;
	}

	public void setStrSeason(String strSeason){
		this.strSeason = strSeason;
	}

	public String getStrSeason(){
		return strSeason;
	}

	@Override
 	public String toString(){
		return 
			"TableItem{" + 
			"strTeam = '" + strTeam + '\'' + 
			",intGoalsAgainst = '" + intGoalsAgainst + '\'' + 
			",intPoints = '" + intPoints + '\'' + 
			",intGoalDifference = '" + intGoalDifference + '\'' + 
			",intGoalsFor = '" + intGoalsFor + '\'' + 
			",intPlayed = '" + intPlayed + '\'' + 
			",idTeam = '" + idTeam + '\'' + 
			",strTeamBadge = '" + strTeamBadge + '\'' + 
			",dateUpdated = '" + dateUpdated + '\'' + 
			",strDescription = '" + strDescription + '\'' + 
			",strForm = '" + strForm + '\'' + 
			",idStanding = '" + idStanding + '\'' + 
			",intDraw = '" + intDraw + '\'' + 
			",intRank = '" + intRank + '\'' + 
			",intLoss = '" + intLoss + '\'' + 
			",strLeague = '" + strLeague + '\'' + 
			",intWin = '" + intWin + '\'' + 
			",idLeague = '" + idLeague + '\'' + 
			",strSeason = '" + strSeason + '\'' + 
			"}";
		}
}