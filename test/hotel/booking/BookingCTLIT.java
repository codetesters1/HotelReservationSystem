/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.booking;

import hotel.credit.CreditCardType;
import hotel.entities.RoomType;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dushan
 */
public class BookingCTLIT {
    
    public BookingCTLIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class BookingCTL.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        BookingCTL instance = null;
        instance.run();
   
    }

    /**
     * Test of phoneNumberEntered method, of class BookingCTL.
     */
    @Test
    public void testPhoneNumberEntered() {
        System.out.println("phoneNumberEntered");
        int phoneNumber = 0;
        BookingCTL instance = null;
        instance.phoneNumberEntered(phoneNumber);
       
    }

    /**
     * Test of guestDetailsEntered method, of class BookingCTL.
     */
    @Test
    public void testGuestDetailsEntered() {
        System.out.println("guestDetailsEntered");
        String name = "";
        String address = "";
        BookingCTL instance = null;
        instance.guestDetailsEntered(name, address);
       
    }

    /**
     * Test of roomTypeAndOccupantsEntered method, of class BookingCTL.
     */
    @Test
    public void testRoomTypeAndOccupantsEntered() {
        System.out.println("roomTypeAndOccupantsEntered");
        RoomType selectedRoomType = null;
        int occupantNumber = 0;
        BookingCTL instance = null;
        instance.roomTypeAndOccupantsEntered(selectedRoomType, occupantNumber);
       
    }

    /**
     * Test of bookingTimesEntered method, of class BookingCTL.
     */
    @Test
    public void testBookingTimesEntered() {
        System.out.println("bookingTimesEntered");
        Date arrivalDate = null;
        int stayLength = 0;
        BookingCTL instance = null;
        instance.bookingTimesEntered(arrivalDate, stayLength);
     
    }

    /**
     * Test of creditDetailsEntered method, of class BookingCTL.
     */
    @Test
    public void testCreditDetailsEntered() {
        System.out.println("creditDetailsEntered");
        CreditCardType type = null;
        int number = 0;
        int ccv = 0;
        BookingCTL instance = null;
        instance.creditDetailsEntered(type, number, ccv);
    
    }

    /**
     * Test of cancel method, of class BookingCTL.
     */
    @Test
    public void testCancel() {
        System.out.println("cancel");
        BookingCTL instance = null;
        instance.cancel();
      
    }

    /**
     * Test of completed method, of class BookingCTL.
     */
    @Test
    public void testCompleted() {
        System.out.println("completed");
        BookingCTL instance = null;
        instance.completed();
      
    }
    
}
