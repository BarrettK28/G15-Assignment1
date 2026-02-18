//aj

//Represents a reservation for one student in one room at one time slot.

public class Reservation {

	//declaring variables
	private int id;
	private Room room;
	private String studentName;
	private TimeSlot timeSlot;
	private boolean canceled;
	private boolean checkedIn;
	
	//constructor
	public Reservation(int id, Room room, String studentName, TimeSlot timeSlot) {
		// ID must be positive		
		if (id<=0)
		{
			throw new IllegalArgumentException();
		}
		//studentName must not be null or blank
		if (studentName == null || studentName.length() == 0)
		{
			throw new IllegalArgumentException();
		}
		
		//cannot be null
		if (timeSlot == null || room == null)
		{
			throw new IllegalArgumentException();
		}
		
		//initializing after enforcing invariants 
		this.id = id;
		this.room = room;
		this.studentName = studentName;
		this.timeSlot = timeSlot;
		this.canceled = false;
		this.checkedIn = false;
		
	}
	
	//methods
	
	//helper method
	private boolean canCheckIn() {
		if (!checkedIn && !canceled)
		{
			return true;
		}
		return false;
	}
	
	//marks the reservation canceled if allowed
	public void cancel()
	{
		if (this.canceled == true)
		{
			System.out.println("Reservation has already been cancelled.");
			return;
		}
		
		if(this.checkedIn == true)
		{
			System.out.println("Reservation is already active, cannot cancel reservation.");
			return;
		}
		
		this.canceled = true; 
		System.out.println("Reservation has been cancelled!");
	}
	
	//marks the reservation checked in if allowed
	public void checkIn()
	{
		if(canCheckIn()){
			this.checkedIn = true;
			System.out.println("Reservation has been checked in!.");
			return;
		}
		
		System.out.println("You cannot check in.");
	}
	
	//recommended toString method
	public String toString()
	{
		return "id: " + id + ". Room: " + room + ". Student name: " + studentName + ". Time slot: " + timeSlot.toString() + ". Canceled: " + canceled + ". checked in: " + checkedIn;
	}
	
}
