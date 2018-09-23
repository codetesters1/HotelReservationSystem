package hotel.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hotel.credit.CreditCard;
import hotel.utils.IOUtils;

public class Room {
	
	public static enum State {READY, OCCUPIED}   // changed it to public for testing
	
	int id;
	RoomType roomType;
	List<Booking> bookings;
	State state;

	
	public Room(int id, RoomType roomType) {
		this.id = id;
		this.roomType = roomType;
		bookings = new ArrayList<>();
		state = State.READY;
	}
	

	public String toString() {
		return String.format("Room : %d, %s", id, roomType);
	}


	public int getId() {
		return id;
	}
	
	public String getDescription() {
		return roomType.getDescription();
	}
	
	
	public RoomType getType() {
		return roomType;
	}
	
	public boolean isAvailable(Date arrivalDate, int stayLength) {
		IOUtils.trace("Room: isAvailable");
		for (Booking b : bookings) {
			if (b.doTimesConflict(arrivalDate, stayLength)) {
				return false;
			}
		}
		return true;
	}
	
	
	public boolean isReady() {
		return state == State.READY;
	}


	public Booking book(Guest guest, Date arrivalDate, int stayLength, int numberOfOccupants, CreditCard creditCard) { //This mehtod is part of my unit testing
		// TODO Auto-generated method stub
		Booking booking = new Booking(guest, this, arrivalDate, stayLength, numberOfOccupants,creditCard);   //Creating a new booking
		bookings.add(booking);   //Adding into bookings list
		return booking;         //Returning a new booking
	} 


	public void checkin() {
		// TODO Auto-generated method stub
		if (!isReady()){											//if condition to check if the state is not ready
			throw new RuntimeException("Room state is not ready");  			//throws new run time exception 
		}
		this.state = State.OCCUPIED;											//Change room state to OCCUPIED
		Booking recentBooking = bookings.get(bookings,size()-1);
		recentBooking.checkIn();										//Change booking state to CHECKED_IN
	}


	public void checkout(Booking booking) {
		// TODO Auto-generated method stub
		if (state != State.OCCUPIED){											//if condition to check if the state is not occupied
			throw new RuntimeException("Room state is not occupied");  			//throws new run time exception 
		}
		this.state = State.READY;            // Set room state to READY
		booking.checkOut();                      //Change booking state to CHECKED_OUT
		
		
	}
	
	//Getter methods
	public List<Booking> getBookings(){
		return this.bookings;
	}
	
	public State getState(){
		return this.state;	
	}
	


}
