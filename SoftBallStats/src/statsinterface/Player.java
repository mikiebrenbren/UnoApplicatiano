package statsinterface;

public class Player extends Person {

	//there needs to be a pitcher class within the player class
	//make this the parent to pitcher and hitter classes


	/**
	 * offense for each player, these are overall stats, live stats must be added somehow, ie during a game
	 * there are going to have to be different stats, these different stats will be added to the overall stats 
	 * at the end of each game.  
	 * 
	 * restrictions will come with the gui on who changes stats, question is should the setters only be 
	 * in the league 
	 * 
	 */

	private int hits, error, rbi, run, out, atBats, walk, strikeouts, homeruns;
	private double obp;
	@SuppressWarnings("unused")
	private String firstName, lastName, description;
	private boolean isAdmin;


	public Player(){

	}
	public int getAtBats(){
		return atBats;
	}
	public void setAtBats(int n){
		if(isAdmin)
			atBats = n;
		else 
			return;
	}

	public int getHomeruns(){
		return homeruns;
	}

	public void setHomeruns(int n){
		if(isAdmin)
			homeruns = n;
		else 
			return;
	}
	public int getStrikeouts(){
		return strikeouts;
	}

	public void setStrikeouts(int n){
		if(isAdmin)
			strikeouts= n;
		else
			return;
	}

	/**
	 * gets on base percentage 
	 * @return
	 */
	public double getOBP(){
		setOBP();
		return obp;
	}
	/**
	 * sets on base percentage ****this might be unessary maybe useful to admin
	 */
	private void setOBP(){
		if(isAdmin)
			obp = (double)(walk+hits+homeruns)/(out+strikeouts+atBats);
		else 
			return;
	}

	/**
	 * gets batting average of each player
	 * @return
	 */
	public double getAverage(){

		return (double)(hits+homeruns)/ (double)(atBats+strikeouts+out);
	}
	/**
	 * gets number of hits that this player has hit
	 * @return
	 */
	public int getHits() {
		return hits;
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
	public void setHits(int hit) {
		if(isAdmin)
			this.hits = hit;
		else 
			return;
	}

	public void incrHits(){
		this.hits++;
	}

	/**
	 * sets the number of errors this player has
	 * @param error
	 */
	public void setError(int error) {
		if(isAdmin)
			this.error = error;
		else 
			return;
	}

	/**
	 * sets the
	 * @param rbi
	 */
	public void setRbi(int rbi) {
		if(isAdmin)
			this.rbi = rbi;
		else 
			return;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public void setOut(int out) {
		if(isAdmin)
			this.out = out;
		else 
			return;
	}

	public void setWalk(int walk){
		if(isAdmin)
			this.walk = walk;
		else 
			return;
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
