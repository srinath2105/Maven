package com.overriding;

public class Netflix_Update extends Source_Code{
	
@Override
public void home_Page() {
	System.out.println("Home Page\n" +"==================");
	super.home_Page();
	System.out.println("Top rated series\n" +"Series you may like\n" +"Latest Releases\n" +"Continue Watching\n");
	
}

@Override
	public void my_List() {
		//super.my_List();
	System.out.println("Library\n" +"=================\n"+"Watch History\n"+"Favories\n"+"Upcoming Sries/Movies\n");
	}

@Override
	public void squid_Game() {
	System.out.println("Squid Game\n" +"==================");
		super.squid_Game();
		System.out.println("Season 1                      " +"Watch Trailer\n"+"Episodes\n" +"===========================================\n"+
		"Episode 1\n"+"Episode 2\n"+"Episode 3\n"+"Episode 4 - (Continue Watching)\n" +"Episode 5\n" +"Episode 6\n"+"Episode 7\n"+"Episode 8\n"+"Episode 9");
	}

public static void main(String[] args) {
	
 Netflix_Update	changes= new Netflix_Update();
 changes.home_Page();
 changes.my_List();
 changes.squid_Game();
}

}
