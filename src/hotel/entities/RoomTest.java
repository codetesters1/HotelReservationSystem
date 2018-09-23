package hotel.entities;

import hotel.credit.CreditCard;
import hotel.credit.CreditCardType;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RoomTest {

    private Room room;
    private Date date;

    private void bookRoom() {
        room = new Room(1, RoomType.SINGLE);
        Guest guest = new Guest("Tom", "Billabong", 0415207775);
        date = new Date();
        CreditCard creditCard = new CreditCard(CreditCardType.MASTERCARD, 123456789, 123);
        room.book(guest, date, 5, 4, creditCard);
    }

    @Before
    public void setup() {
        bookRoom();
    }

    /*Book method*/
    @Test
    public void testBook() {

        List<Booking> bookings = room.getBookings();

        //Check bookings size
        assertEquals(1, bookings.size());


        //Check booking status
        Booking booking = bookings.get(0);
        assertTrue(booking.isPending());


        //isAvailable
        assertFalse(room.isAvailable(date, 5));
    }


    /* Chechkin method */
    @Test
    public void testCheckin() {
        room.checkin();

        //Check room state
        assertEquals(Room.State.OCCUPIED, room.getState());

        //Chechk booking state
        Booking booking = room.getBookings().get(room.getBookings().size() - 1);
        assertTrue(booking.isCheckedIn());
    }

    /*Checkout method*/
    @Test
    public void testCheckOut() {
        Booking booking = room.getBookings().get(room.getBookings().size() - 1);
        room.checkin();
        room.checkout(booking);

        //Check room state
        assertTrue(room.isReady());


        //Chechk booking state
        assertTrue(booking.isCheckedOut());

    }



}


