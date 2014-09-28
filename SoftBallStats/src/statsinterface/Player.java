package statsinterface;

public class Player extends Person {
	
	//there needs to be a pitcher class within the player class
	//make this the parent to pitcher and hitter classes


	/**
	 * offense for each player, these are overall stats, live stats must be added somehow, ie during a game
	 * there are going to have to be different stats, these different stats will be added to the overall stats 
	 * at the end of each game.  
	 * 
	 */
	
	private int hit, error, rbi, run, out, atBat, walk, strikeouts, homeruns;
	private double obp;
	@SuppressWarnings("unused")
	private String firstName, lastName, description;
	private boolean isAdmin;

	
	public Player(){
		
	}
	
	public int getHomeruns(){
		return homeruns;
	}
	
	public void setHomeruns(int n){
		homeruns = n;
	}
	public int getStrikeouts(){
		return strikeouts;
	}
	
	public void setStrikeouts(int n){
		strikeouts= n;
	}
	
	/**
	 * gets on base percentage 
	 * @return
	 */
	public double getOBP(){
		return obp;
	}
	/**
	 * sets on base percentage 
	 */
	public void setOBP(){
		obp = (double)(walk+hit)/(out);
	}
	
	/**
	 * gets batting average of each player
	 * @return
	 */
	public double getAverage(){
		
		return (double)hit/ (double)atBat;
	}
	/**
	 * gets number of hits that this player has hit
	 * @return
	 */
	public int getHit() {
		return hit;
	}

	/**
	 * gets number of errors that has occured by this player
	 * @return
	 */
	public int getError() {
		return error;
	}

	/**
	 * gets the number of RBIs that this player has hit
	 * @return
	 */
	public int getRbi() {
		return rbi;
	}

	/**
	 * gets the number of runs that player has
	 * @return
	 */
	public int getRun() {
		return run;
	}

	/**
	 * gets the number of outs this player
	 * @return
	 */
	public int getOut() {
		return out;
	}

	/**
	 * sets the number of hits this player has
	 * @param hit
	 */
	public void setHit(int hit) {
		this.hit = hit;
	}

	/**
	 * sets the number of errors this player has
	 * @param error
	 */
	public void setError(int error) {
		this.error = error;
	}

	/**
	 * sets the
	 * @param rbi
	 */
	public void setRbi(int rbi) {
		this.rbi = rbi;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public void setOut(int out) {
		this.out = out;
	}
	
	public void setWalk(int walk){
		this.walk = walk;
	}
	
	public int getWalk(){
		return walk;
	}

	@Override
	public void setFirstName(String n) {
		firstName = n;
		
	}

	@Override
	public void setLastName(String n) {
		
		lastName = n;
	}

	@Override
	public String getLastName() {
		
		return lastName;
	}

	@Override
	public String getFirstName() {
		return firstName;
	}	
	
	@Override
	public boolean isAdmin(){
		return isAdmin;
	}
	@Override
	public void setAdmin(boolean b){
		isAdmin = b;
	}
	
	/**
	 * description, eventually could allow this to sync with twitter and facebook
	 */
	@Override
	public void description(String s){
		description = s;
	}
	
}
