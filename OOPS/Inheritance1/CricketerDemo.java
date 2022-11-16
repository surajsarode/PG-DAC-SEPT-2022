class Cricketer
{
	String name;
	String country;
	int totMatches;
	
	void setDetails(String name, String country, int totMatches)
	{
		this.name = name;
		this.country = country;
		this.totMatches = totMatches;
	}
	void printDetails()
	{
		System.out.println(name);
		System.out.println(country);
		System.out.println(totMatches);
	}
	
}
class Batsman extends Cricketer
{
	int totRuns;
	
	void setTotRuns(int totRuns)
	{
		this.totRuns = totRuns;
	}
	void PrintTotRuns()
	{
		System.out.println(totRuns);
	}
}

class Bowler extends Cricketer
{
	int totWickets;
	
	void setTotWickets(int totWickets)
	{
		this.totWickets = totWickets;
	}
	void printToWickets()
	{
		System.out.println(totWickets);
	}
}

class CricketerDemo
{
	public static void main(String args[])
	{
		Cricketer c1 = new Cricketer();
		c1.setDetails("Sachin", "India", 400);
		c1.printDetails();
		
		Batsman bat1  = new Batsman();
		bat1.setDetails("Virat", "India", 143);   //will call parents class (Cricketer) setDetails() 
		bat1.setTotRuns(3000);        //will call child class(Batsman) setTotRuns()
		//bat1.printDetails();      // will call child class printDetails()
		//bat1.printTotalRuns();   // will call child class printTotalRuns()
		bat1.pri
		
		Bowler bowl1 = new Bowler();
		bowl1.setDetails("Bumrah", "India", 7);  //parent class setDetails called
		bowl1.setTotWickets(344);     //child class (Bowler) setTotWickets() called
		bowl1.printDetails();     //parent class printDetails() called
		bowl1.printToWickets();   //child class printToWickets() called
	}
}