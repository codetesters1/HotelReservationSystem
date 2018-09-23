/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.entities;

import hotel.credit.CreditCard;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
public class BookingTest {
    
    private Guest guest;
    private Room room;
    private CreditCard credit;
    private ServiceType serviceType;
    
    public BookingTest() {
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
     * Test of doTimesConflict method, of class Booking.
     */
    @Test
    public void testDoTimesConflict() throws ParseException {
        System.out.println("doTimesConflict");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date requestedArrival =format.parse("12-02-2018"); 
        int stayLength = 2;
        Booking instance = new Booking(guest,room,requestedArrival,1,1,credit);
        boolean expResult = true;
        boolean result = instance.doTimesConflict(requestedArrival, stayLength);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConfirmationNumber method, of class Booking.
     */
    @Test
    public void testGetConfirmationNumber() throws ParseException {
        System.out.println("getConfirmationNumber");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        long expResult = 4356;
        long result = instance.getConfirmationNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomId method, of class Booking.
     */
    @Test
    public void testGetRoomId() throws ParseException {
        System.out.println("getRoomId");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        int expResult = 20;
        int result = instance.getRoomId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoom method, of class Booking.
     */
    @Test
    public void testGetRoom() throws ParseException {
        System.out.println("getRoom");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        Room expResult = room;
        Room result = instance.getRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArrivalDate method, of class Booking.
     */
    @Test
    public void testGetArrivalDate() throws ParseException {
        System.out.println("getArrivalDate");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        Date expResult = date;
        Date result = instance.getArrivalDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStayLength method, of class Booking.
     */
    @Test
    public void testGetStayLength() throws ParseException {
        System.out.println("getStayLength");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        int expResult = 2;
        int result = instance.getStayLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGuest method, of class Booking.
     */
    @Test
    public void testGetGuest() throws ParseException {
        System.out.println("getGuest");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        Guest expResult = guest;
        Guest result = instance.getGuest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCreditCard method, of class Booking.
     */
    @Test
    public void testGetCreditCard() throws ParseException {
        System.out.println("getCreditCard");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        CreditCard expResult = credit;
        CreditCard result = instance.getCreditCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPending method, of class Booking.
     */
    @Test
    public void testIsPending() throws ParseException {
        System.out.println("isPending");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        boolean expResult = true;
        boolean result = instance.isPending();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCheckedIn method, of class Booking.
     */
    @Test
    public void testIsCheckedIn() throws ParseException {
        System.out.println("isCheckedIn");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        boolean expResult = true;
        boolean result = instance.isCheckedIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCheckedOut method, of class Booking.
     */
    @Test
    public void testIsCheckedOut() throws ParseException {
        System.out.println("isCheckedOut");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        boolean expResult = true;
        boolean result = instance.isCheckedOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCharges method, of class Booking.
     */
    @Test
    public void testGetCharges() throws ParseException {
        System.out.println("getCharges");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        List<ServiceCharge> expResult = instance.getCharges();
        List<ServiceCharge> result = instance.getCharges();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkIn method, of class Booking.
     */
    @Test
    public void testCheckIn() throws ParseException {
        System.out.println("checkIn");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        instance.checkIn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addServiceCharge method, of class Booking.
     */
    @Test
    public void testAddServiceCharge() throws ParseException {
        System.out.println("addServiceCharge");
        double cost = 0.0;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        instance.addServiceCharge(serviceType, cost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkOut method, of class Booking.
     */
    @Test
    public void testCheckOut() throws ParseException {
        System.out.println("checkOut");
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date =format.parse("12-02-2018"); 
        Booking instance = new Booking(guest,room,date,1,1,credit);
        instance.checkOut();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
