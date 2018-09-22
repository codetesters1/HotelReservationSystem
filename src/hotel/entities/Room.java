package hotel.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import hotel.credit.CreditCard;
import hotel.utils.IOUtils;

public class Room {
	
	private enum State {READY, OCCUPIED}
	
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
		 
		return null;		
	}


	public void checkin() {
		// TODO Auto-generated method stub
		if (!isReady()){											//if condition to check if the state is not ready
			throw new RuntimeException("Room state is not ready");  			//throws new run time exception 
		}
		this.state = State.OCCUPIED;											//Change room state to OCCUPIED
		bookings.isCheckedIn();												//Change booking state to CHECKED_IN
	}


	public void checkout(Booking booking) {
		// TODO Auto-generated method stub
		if (isReady() != State.OCCUPIED){											//if condition to check if the state is not occupied
			throw new RuntimeException("Room state is not occupied");  			//throws new run time exception 
		}
		
	}


}
