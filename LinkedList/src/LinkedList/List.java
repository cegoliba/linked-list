package LinkedList;

public class List {
	
	// Head (the address) of the list
	private Node list; 

	// Empty list constructor
	public List() {
		// TODO Auto-generated constructor stub
		list = null;
	}

	// Add node to ahead of the list
	public void InsertToList(int value) {
		Node node = new Node(value, list);
		list = node;
	}

	// Sort the list after it's been made
	public void SortList() {
		Node current = list;
		Node previous = current;
		current = current._next;
		while (current._next != null) {
			if (previous._value > current._value) {
				int temp;
				temp = previous._value;
				previous._value = current._value;
				current._value = temp;
				previous = previous._next;
				current = current._next;
			}
		}

	}

	// Return the last node in the list
	public Node NodeAtEnd() {
		Node temp;
		if (list == null)
			return null;
		temp = list;
		while (temp._next != null)
			temp = temp._next;
		return temp;
	}

	// Add the new node into end of the list
	public void AppendToList(int value) {
		Node temp = new Node(value, null);
		if (list == null)
			list = temp;
		else
			NodeAtEnd()._next = temp;
	}

	// Remove the node with the specific value
	public void RemoveNode(int value) {
		Node temp = list;
		if (temp == null)
			return;
		if (temp._value == value)
			list = temp._next;
		else {
			Node previous = temp;
			temp = temp._next;
			while (temp != null && temp._value == value) {
				previous = previous._next;
				temp = temp._next;
			}
			if (temp == null)
				return;
			previous._next = temp._next;
		}

	}

	// Return the number of the nodes in the list
	public int LengthOfList() {
		Node temp = list;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp._next;
		}
		return count;
	}

	// Display the nodes of the list
	public void DisplayList() {
		Node temp = list;
		while (temp != null) {
			System.out.print(temp._value + " ");
			temp = temp._next;
		}
	}

	// Add the new node to its own order, place in the list
	public void AddToList(int value) {
		Node node = new Node(value, null);
		Node temp;
		temp = list;

		while (temp._next != null) {
			temp = temp._next;
		}
		temp._next = node;
		list = temp;
	}

}
