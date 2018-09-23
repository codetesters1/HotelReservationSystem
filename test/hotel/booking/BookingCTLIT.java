/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.booking;

import hotel.credit.CreditCardType;
import hotel.entities.RoomType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

//Integration Testing
public class BookingCTLIT {
    
    private BookingCTL bookCTL;
    private RoomType room;
    private CreditCardType credit;
    
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
        BookingCTL instance = bookCTL;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of phoneNumberEntered method, of class BookingCTL.
     */
    @Test
    public void testPhoneNumberEntered() {
        System.out.println("phoneNumberEntered");
        int phoneNumber = 1234456789;
        BookingCTL instance = bookCTL;
        instance.phoneNumberEntered(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guestDetailsEntered method, of class BookingCTL.
     */
    @Test
    public void testGuestDetailsEntered() {
        System.out.println("guestDetailsEntered");
        String name = "Dushan";
        String address = "339,Springvale";
        BookingCTL instance = bookCTL;
        instance.guestDetailsEntered(name, address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of roomTypeAndOccupantsEntered method, of class BookingCTL.
     */
    @Test
    public void testRoomTypeAndOccupantsEntered() {
        System.out.println("roomTypeAndOccupantsEntered");
        RoomType selectedRoomType = room;
        int occupantNumber = 2;
        BookingCTL instance = bookCTL;
        instance.roomTypeAndOccupantsEntered(selectedRoomType, occupantNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of bookingTimesEntered method, of class BookingCTL.
     */
    @Test
    public void testBookingTimesEntered() throws ParseException {
        System.out.println("bookingTimesEntered");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date arrivalDate =format.parse("12-02-2018"); 
        int stayLength = 2;
        BookingCTL instance = bookCTL;
        instance.bookingTimesEntered(arrivalDate, stayLength);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of creditDetailsEntered method, of class BookingCTL.
     */
    @Test
    public void testCreditDetailsEntered() {
        System.out.println("creditDetailsEntered");
        CreditCardType type = credit;
        int number = 2;
        int ccv = 1;
        BookingCTL instance = bookCTL;
        instance.creditDetailsEntered(type, number, ccv);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancel method, of class BookingCTL.
     */
    @Test
    public void testCancel() {
        System.out.println("cancel");
        BookingCTL instance = bookCTL;
        instance.cancel();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completed method, of class BookingCTL.
     */
    @Test
    public void testCompleted() {
        System.out.println("completed");
        BookingCTL instance = bookCTL;
        instance.completed();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
