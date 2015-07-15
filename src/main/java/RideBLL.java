package main.java;

public class RideBLL {
	public static String Valid(Ride ride){
		if(ride.phone.equals(""))
		{
			return("You have failed this city");
		}
		
		return("welcome");
		
	}

}
