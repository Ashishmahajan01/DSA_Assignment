package List;

public class LinkedList {
	private Node head;

	public LinkedList() {
		this.head = null;
	}

	public Node gethead() {
		return head;
	}

	public void sethead(Node head) {
		this.head = head;
	}

	public boolean insertAtBg(int v) {
		Node nn = new Node(v);
		if (head != null)
			nn.setNext(head);
		head = nn;
		return true;
	}

	public boolean insertAtLast(int v) {
		Node nn = new Node(v);
		Node temp = head;
		if (head == null)
			head = nn;
		while (temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(nn);
		return true;

	}

	public boolean deleteAtBeg() {
		head =head.getNext();
		return true;

	}

	public boolean deleteAtLast() {
		Node temp = head;
		
		while(temp.getNext().getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(null); 
		return true;

	}

	public void display() {
		Node temp = head;
		System.out.println("\nList Elements  -");
		while (temp != null) {
			System.out.print("\t" + temp.getData());
			temp = temp.getNext();
		}

	}

	public void search(int v) {
		// temp points to first node
		Node temp = head;
		int c = 0;
		while (temp != null) {
			// c is position every time it will increase if data not found
			c++;
			// if will run when ata found
			if (v == temp.getData()) {
				// print msg found with position
				System.out.println("\n" + v + " found at position " + c);
				break;
			}
			// temp go ahead till it becomes null
			temp = temp.getNext();
		}

	}

}
