package statsinterface;

public abstract class Person {

	public abstract void setFirstName(String n);
	
	public abstract void setLastName(String n);
	
	public abstract void description(String s);
	
	public abstract String getLastName();
	
	public abstract String getFirstName();
	
	public abstract boolean isAdmin();
	
	public abstract void setAdmin(boolean b);
	
	
}
