package hotel.checkin;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCheckinCTL {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void run() {
    }

    @Test
    public void confirmationNumberEntered() {
    }

    @Test
    public void checkInConfirmed() {
        CheckinCTL ctl = new CheckinCTL(hotel);
        // checking true
        ctl.checkInConfirmed(true);

        assert ctl.getState() == CheckinCTL.State.COMPLETED;


        ctl.checkInConfirmed(false); //checking false

        assert ctl.getState() == CheckinCTL.State.CANCELLED;
    }

    @Test
    public void cancel() {
    }

    @Test
    public void completed() {
    }

    @Test
    public void getState() {
    }
}