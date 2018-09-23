public class TestCheckinCTL{
	
	private Hotel hotel;
	
	public void TestcheckInConfirmed() {
	 CheckinCTL ctl = new CheckinCTL(hotel);
     ctl.checkInConfirmed(true); // checking true
	 
	 assert ctl.getState() == CheckinCTL.State.COMPLETED;
	 
	 
     ctl.checkInConfirmed(false); //checking false
	 
	 assert ctl.getState() == CheckinCTL.State.CANCELLED;
	}
	
	public static void main(String[] args){
		TestCheckinCTL testCheckinCTL = new TestCheckinCTL();
        testCheckinCTL.TestcheckInConfirmed();
    
	}
}