public class LinkedList {
	Node head;
	Node tail;
	
	Node reservationHead;
	Node reservationTail;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	// Method to create a defined amount of seats.
	public void createSeat(int amount) {
		for (int i = 1; i <= amount; i++) {
			Node newNode = new Node(i);
			if (head == null) {
				head = newNode;
				tail = newNode;
				continue;
			}
			
			Node current = tail;
			current.next = newNode;
			newNode.prev = current;
			tail = newNode;
		}
	}
	
	// Method to reserve seats
	public void reserveSeat(int seatNumber) {
		// While loop used to iterate throughout the entire linked list to find and select a specific seat.
		// That specific seat is then defined as "current",
		// and given the reservation value of "true".
		Node current = head;
		while (current != null) {
			if (current.seat < seatNumber) {
				current = current.next;
			} else if (current.seat == seatNumber) {
				if (current.reservation) {
					System.out.println("Error: Cannot reserve an already reserved seat");
				} else {
					current.reservation = true;
				}
				break;
			}
		}
		
		// Used to create the linked list for the reservation.
		if (reservationHead == null) {
			reservationHead = current;
			reservationTail = current;
			return;
		}
		
		Node newReservation = new Node(current.seat);
		Node currentReservation = tail;
		currentReservation.next = newReservation;
		newReservation.prev = currentReservation;
		reservationTail = newReservation;
	}
	
	// Method to cancel reservations.
	public void cancelReservation(int seatNumber) {
		// While loop used to iterate throughout the entire linked list to find and select a specific seat.
		// That specific seat is then defined as "current",
		// and given the reservation value of "false".
		Node current = head;
		while (current != null) {
			if (current.seat < seatNumber) {
				current = current.next;
			} else if (current.seat == seatNumber) {
				if (current.reservation) {
					current.reservation = false;
				} else {
					System.out.println("Error: Cannot cancel reservation on available seat");
				}
				break;
			}
		}
		
		// While loop used to iterate throughout the entire reservation linked list to find and select a specific reserved seat.
		// That specific reserved seat is then defined as "currentReservation",
		Node currentReservation = reservationHead;
		while (currentReservation != null) {
			if (currentReservation.seat < seatNumber) {
				currentReservation = currentReservation.next;
			} else if (currentReservation.seat == seatNumber) {
				
				// The program proceeds here if the user is trying to cancel the tail of reservation list
				if (currentReservation.next == null) {
					currentReservation.prev.next = null;
					currentReservation = null;
					return;
				}
				
				// The program proceeds here if the user is trying to cancel the head of the reservation list
				if (currentReservation.prev == null) {
					currentReservation.next.prev = null;
					currentReservation = null;
					return;
				}
				
				// The program proceeds here if the user is trying to cancel neither the head or tail of the reservation list
				currentReservation.prev.next = currentReservation.next;
				currentReservation.next.prev = currentReservation.prev;
				currentReservation = null;
				return;
			}
		}
	}
	
	public boolean checkSeatAvailability(int seatNumber) {
		Node current = head;
		while (current != null) {
			if (current.seat < seatNumber) {
				current = current.next;
			} else if (current.seat == seatNumber) break;
		}
		return current.reservation;
	}
	
	public void reservedSeats() {
		Node currentReservation = reservationHead;
		while (currentReservation != null) {
			System.out.println("Seat Number: " + currentReservation);
			currentReservation = currentReservation.next;
		}
	}
	
	public void availableSeats() {
		Node current = head;
		while (current != null) {
			if (current.reservation = false) {
				System.out.println("Seat Number: " + current);
				current = current.next;
			}
		}
	}
}
