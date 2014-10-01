package statsinterface;

public class Game {
	
private Team t1,t2;
private int t1score, t2score;

public Game()
{
	
}
public Team getTeam1()
{
	
return t1;

}

public Team getTeam2()
{

return t2;

}

public void setScore1(int i)
{

t1score = i;

}

public void setScore2(int i){

t2score = i;

}

public String getScore(){

return t1score + " " + t2score; 

}

}

