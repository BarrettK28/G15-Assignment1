package rooms;

//Jimmy Vanrer

//This class represents a single room immutable becasue a room does
//not change easily

public final class Room {
	
	//Variables
	private String roomName;
	private int capacity;
	
	//Constructor
	public Room (String name, int capacity)
	{
		//Checking invariants
		if (name == null)
		{
			throw new IllegalArgumentException();
		}
		if (capacity < 1)
		{
			throw new IllegalArgumentException();
		}
		
		//Initializing
		roomName = name;
		this.capacity = capacity;
	}
	
	//roomName getter
	public String getRoomName ()
	{
		return roomName;
	}
	
	//capacity getter
	public int getCapacity ()
	{
		return capacity;
	}

	//the toString
	@Override
	public String toString() {
		return "Room [roomName=" + roomName + ", capacity=" + capacity + "]";
	}
	
}
