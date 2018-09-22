package hotel.entities;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import hotel.credit.CreditCard;
import hotel.utils.IOUtils;

public class Hotel {
	
	private Map<Integer, Guest> guests;
	public Map<RoomType, Map<Integer,Room>> roomsByType;
	public Map<Long, Booking> bookingsByConfirmationNumber;
	public Map<Integer, Booking> activeBookingsByRoomId;
	
	
	public Hotel() {
		guests = new HashMap<>();
		roomsByType = new HashMap<>();
		for (RoomType rt : RoomType.values()) {
			Map<Integer, Room> rooms = new HashMap<>();
			roomsByType.put(rt, rooms);
		}
		bookingsByConfirmationNumber = new HashMap<>();
		activeBookingsByRoomId = new HashMap<>();
	}

	
	public void addRoom(RoomType roomType, int id) {
		IOUtils.trace("Hotel: addRoom");
		for (Map<Integer, Room> rooms : roomsByType.values()) {
			if (rooms.containsKey(id)) {
				throw new RuntimeException("Hotel: addRoom : room number already exists");
			}
		}
		Map<Integer, Room> rooms = roomsByType.get(roomType);
		Room room = new Room(id, roomType);
		rooms.put(id, room);
	}

	
	public boolean isRegistered(int phoneNumber) {
		return guests.containsKey(phoneNumber);
	}

	
	public Guest registerGuest(String name, String address, int phoneNumber) {
		if (guests.containsKey(phoneNumber)) {
			throw new RuntimeException("Phone number already registered");
		}
		Guest guest = new Guest(name, address, phoneNumber);
		guests.put(phoneNumber, guest);		
		return guest;
	}

	
	public Guest findGuestByPhoneNumber(int phoneNumber) {
		Guest guest = guests.get(phoneNumber);
		return guest;
	}

	
	public Booking findActiveBookingByRoomId(int roomId) {
		Booking booking = activeBookingsByRoomId.get(roomId);;
		return booking;
	}


	public Room findAvailableRoom(RoomType selectedRoomType, Date arrivalDate, int stayLength) {
		IOUtils.trace("Hotel: checkRoomAvailability");
		Map<Integer, Room> rooms = roomsByType.get(selectedRoomType);
		for (Room room : rooms.values()) {
			IOUtils.trace(String.format("Hotel: checking room: %d",room.getId()));
			if (room.isAvailable(arrivalDate, stayLength)) {
				return room;
			}			
		}
		return null;
	}

	
	public Booking findBookingByConfirmationNumber(long confirmationNumber) {
		return bookingsByConfirmationNumber.get(confirmationNumber);
	}

	
	public long book(Room room, Guest guest, 
			Date arrivalDate, int stayLength, int occupantNumber,
			CreditCard creditCard) {
		// TODO Auto-generated method stub
		return 0L;		
	}

	
	// coded by HIJAS(21/09/2018)
	public void checkin(long confirmationNumber) {
            
            Booking booking = findBookingByConfirmationNumber(confirmationNumber);
            if(booking != null){
                int roomId = booking.getRoomId();
                booking.checkIn();
                activeBookingsByRoomId.put(roomId, booking);
            }else{
                throw new RuntimeException("Booking by this confirmation is not available.");
            }
            
	}


	// implementation - HIJAS (21/09/2018)
	public void addServiceCharge(int roomId, ServiceType serviceType, double cost) {
		
            Booking booking = findActiveBookingByRoomId(roomId); 
            if(booking != null){
                booking.addServiceCharge(serviceType, cost);
            }else{
                throw new RuntimeException("No any bookings for this roomId");
                        
            }
            
	}

	
	// implementation - HIJAS (21/09/2018)
	public void checkout(int roomId) {
		
            Booking booking = findActiveBookingByRoomId(roomId);
            if(booking != null){
                booking.checkOut();
                activeBookingsByRoomId.remove(roomId);
            }else{
                throw new RuntimeException("No any bookings for this roomId");
                        
            }
	}


}
