package rooms;

//Jimmy Varner

//This represents one time slot with the starting hour being the
//given time ending in the next hour

public final class TimeSlot {
	
	//Variable
	private int hour;
	
	//Constructor
	public TimeSlot (int hour)
	{
		//Checking for invariants
		if (hour < 0 || hour > 23)
		{
			throw new IllegalArgumentException();
		}
		
		//Initializing
		this.hour = hour;
	}
	
	//Getter for the hour
	public int getHour ()
	{
		return hour;
	}

	//the toString
	@Override
	public String toString() {
		return "TimeSlot [hour=" + hour + ":00-" + hour+1 + ":00]";
	}
	
}
