package statsinterface;

import java.util.HashSet;

/**
 * the league is a collection of teams, the league has permissions to change statistics within a team(record of each team)
 * league also has permissions to change 
 */
public class League {

	@SuppressWarnings("unused")
	private HashSet<Team> leagueTeams;
	
	public League(){
		
		leagueTeams = new HashSet<Team>();
	}
	
	
	
}
