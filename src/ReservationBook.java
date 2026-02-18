//aj

// This class stores reservations and owns them. It should not coordinate the whole application, it
// should manage reservation storage and basic queries.

//Constraints: You must store reservations using a plain Java array

public class ReservationBook {
	private Reservation[] reservations;
	private int count; //how full is reservation array
	
	//Constructor creates an empty book with a fixed maximum capacity (positive)
	public ReservationBook(int capacity) {
		if (capacity <= 0)
		{
			throw new IllegalArgumentException();
		}
		
		this.reservations = new Reservation[capacity];
		this.count = 0;
		
	}
	
	//adds if space exists, otherwise throws an exception
	public void add(Reservation r)
	{
		//array is full
		if(count >= reservations.length)
		{
			throw new IllegalStateException();
		}
		
		//there is space
		reservations[count] = r;
		count++;
		System.out.println("Added Reservation to List.");
	}
	
	//returns the matching reservation or null if not found
	public Reservation findById(int id) {
		
		for (int i =  0; i < count; i++)
		{	
			if (reservations[i].getId() == id)
			{
				System.out.println("Your reservation was found!");
				return reservations[i];
			}
		}
		
		System.out.println("there was not a reservation with that id.");
		return null;
	}
	
	//prints all stored reservations (one per line)
	public void printAll(){
		for (int i = 0; i < count; i++)
		{
			System.out.println(reservations[i].toString());
		}
	}

	
	//prints reservations for that room
	
	//short comment explaining my reasoning: 
	
	//chose by reference: comparing rooms by name without using equals method seemed difficult, 
	//by reference checks the room object instead (which will work the same for our example)
	
	public void printForRoom(Room room){
		System.out.println("Reservations for room: \n");
		for (int i = 0; i < count; i++)
		{
			if (reservations[i].getRoom() == room)
			{
				System.out.println(reservations[i].toString());
			}
		}
	}
	
}
