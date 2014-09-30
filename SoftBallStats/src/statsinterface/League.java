package statsinterface;

import java.util.HashMap;

/**
 * the league is a collection of teams(HashMap), the league has permissions to change statistics within a team(record of each team)
 * league also has permissions to change 
 */
public class League {

	private HashMap<String,Team> leagueTeams;
	
	public League(){
		
		leagueTeams = new HashMap<String, Team>();
	}
	
	public void addTeam(Team t){
		
		leagueTeams.put(t.getName(), t);
	}
	
	public void removeTeam(Team t){
		
		leagueTeams.remove(t.getName());
	}
	
	public void loss(Team t){
		leagueTeams.get(t).winLose(false);
	}
	public void win(Team t){
		leagueTeams.get(t).winLose(true);
	}

	
}
