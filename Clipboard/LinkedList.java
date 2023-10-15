public class LinkedList {
	Node Head;
	Node Tail;
	Node clipboardItem;
	int itemNumber = 1;
	
	public LinkedList() {
		this.Head = null;
		this.Tail = null;
	}
	
	public void copy(String Data) {
		if (itemNumber <= 15) {
			Node newNode = new Node(Data, itemNumber);
			itemNumber += 1;
			
			if (Head == null) {
				Head = newNode;
				Tail = newNode;
			} else {
				Node Current = Head;
				while (Current.next != null) {
					Current = Current.next;
				}
				Current.next = newNode;
				newNode.prev = Current;
				Tail = newNode;
			}
		} else {
			Head = Head.next;
			Head.prev = null;
			
			Node Current = Head;
			for (int i = 1; Current != null; i++) {
				Current.itemNumber = i;
				Current = Current.next;
			}
			
			Node newNode = new Node(Data, 15);
			Tail.next = newNode;
			newNode.prev = Tail;
			Tail = newNode;
		}
		clipboardItem = Tail;
	}
	
	public String paste() {
		return clipboardItem.Item;
	}
	
	public void extendedClipboard(int itemNumber) {
		Node Current = Tail;
		while (Current.itemNumber != itemNumber) {
			Current = Current.prev;
		}
		clipboardItem = Current;
	}
}
