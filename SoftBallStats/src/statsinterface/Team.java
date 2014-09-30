package statsinterface;

import java.util.HashMap;

/**
 * team is a hashmap of players team is editable by the league 
 */


public class Team{

	@SuppressWarnings("unused")
	private HashMap<Integer, Player> teamPlayers;
	private int[] teamRecord;
	private String teamName;
	

	Team(){

		teamPlayers = new HashMap<Integer,Player>();
		teamRecord = new int[2];
	}
	
	public String getName(){
		return teamName;
	}
	public void setName(String s){
		teamName = s;
	}

	public String getRecord(){
		
		return null;
	}

	public void winLose(boolean b){

		changeRecord(b);
	}

	private void changeRecord(boolean b){

		if(b)
			teamRecord[0]++;
		else 
			teamRecord[1]++;
	}

}


