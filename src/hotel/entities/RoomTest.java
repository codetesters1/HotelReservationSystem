
public class RoomTest {
	
	private Room room;

	/*Book method*/
	public void testBook() {
	room = new Room(1, RoomType.SINGLE);
	Guest guest = new Guest("Tom", "Billabong", 0415207775);
	Date date = new Date();
	CreditCard creditCard = CreditCard(CreditCardType.MASTERCARD, 123456789, 123);
	room.book(guest, date, 5, 4, creditCard);
	List<Booking> bookings = room.getBooking();
	
	//Check bookings size
	assert bookings.size() == 1;
	
	//Check booking status
	Booking booking = bookings.get(0);
	assert booking.isPending();
	
	//isAvailable
	assert room.isAvailable(date, 5) == false;
	}
	
	
	/* Chechkin method */
	public void testCheckin(){
	room.checkin();
	
	//Check room state
	assert room.getState() == Room.State.OCCUPIED;
	
	//Chechk booking state
	Booking booking = room.getBookings().get(room.getBookings().size()-1);
    assert booking.isCheckedIn() == true;
	}
	
	/*Checkout method*/
	public void testCheckOut(){
	Booking booking = room.getBookings().get(room.getBookings().size()-1);
    room.checkout(booking);
	
	//Check room state
	assert room.isReady() == true;
	
	//Chechk booking state
	assert booking.isCheckedOut() == true;
	}
	
	public static void main(String[] args){
		RoomTest roomTest = new RoomTest();
        roomTest.testBook();
        roomTest.testCheckin();
        roomTest.testCheckout();
	}
	
}


