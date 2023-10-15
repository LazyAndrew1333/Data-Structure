public class Node {
	String Item;
	int itemNumber;
	Node prev;
	Node next;

	public Node(String Item, int itemNumber) {
		this.Item = Item;
		this.itemNumber = itemNumber;
		this.prev = null;
		this.next = null;
	}
}
