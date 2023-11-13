// DOUBLY LINKED LIST: HEADS AND TAILS
// SINGLY LINKED LIST: HEADS ONLY

public class UserLinkedList {
	Node Head;
	Node Tail;
	Node Current;
	
	public UserLinkedList() {
		this.Head = null;
		this.Tail = null;
		this.Current = null;
	}
	
	public void nextElement() {
		if (Current.nextRoute == null) {
			return;
		}
		Current = Current.nextRoute;
	}
	
	public void prevElement() {
		if (Current.prevRoute == null) {
			return;
		}
		Current = Current.prevRoute;
	}
	
	public void addElement(int routeNumber, String stop1, String stop2, String stop3, String stop4, String stop5, String stop6, String stop7, String img) {
		Node newNode = new Node(routeNumber, stop1, stop2, stop3, stop4, stop5, stop6, stop7, img);
		if (Head == null) {
            Head = newNode;
            Tail = newNode;
            Current = Head;
            return;
        }
		
		Node Current = Head;
		while(Current.nextRoute != null) {
			Current = Current.nextRoute;
		}
		Current.nextRoute = newNode;
		newNode.prevRoute = Current;
		Tail = newNode;
	}
}
