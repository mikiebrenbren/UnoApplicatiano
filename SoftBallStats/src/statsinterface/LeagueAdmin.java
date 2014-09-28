package statsinterface;

public class LeagueAdmin extends Person{
	
	@SuppressWarnings("unused")
	private String firstName, lastName, description;
	private boolean isAdmin;
	
	public LeagueAdmin(){
		isAdmin = true;
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
