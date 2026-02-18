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
	public Reservation(int id, Room room, String studentName, TimeSlot timeSlot, boolean canceled, boolean checkedIn) {
		// ID must be positive		
		if (id<=0)
		{
			throw new IllegalArgumentException();
		}
		//studentName must not be null or blank
		if (studentName == null || studentName == " ")
		{
			throw new IllegalArgumentException();
		}
		
		//cannot be null
		if (timeSlot == null || room == null)
		{
			throw new IllegalArgumentException();
		}
		
		//cannot be canceled and checked in
		if (checkedIn == true && canceled == true)
		{
			throw new IllegalArgumentException();
		}
		
		//initializing after enforcing invariants 
		this.id = id;
		this.room = room;
		this.studentName = studentName;
		this.timeSlot = timeSlot;
		this.canceled = canceled;
		this.checkedIn = checkedIn;
		
	}
	
	//methods
	
	//marks the reservation canceled if allowed
	public void cancel()
	{
		if (this.canceled == true)
		{
			System.out.println("Reservation has already been cancelled.");
		}
		else if(this.checkedIn == false)
		{
			System.out.println("Reservation was not checkedIn, so cannot cancel Reservation.");
		}
		
		//if was checked in and was not previously cancelled
		this.canceled = true;
		this.checkedIn = false;
		System.out.println("Reservation has been cancelled.");
	}
	
	//marks the reservation checked in if allowed
	public void checkIn()
	{
		
	}
	
	//Methods that answer questions such as isActive() or canCheckIn() are encouraged
	
	//toString() prints a useful line including id, student, room, time slot, and status
}
