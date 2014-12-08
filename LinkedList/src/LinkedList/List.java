package LinkedList;

public class List {
	private Item list; // First node address

	public List() {
		// TODO Auto-generated constructor stub
		list = null;
	}

	// Add node to ahead of the list
	public void InsertToList(int value) {
		Item node = new Item(value, list);
		list = node;
	}

	// Sort the list after it's been made
	public void SortList() {
		Item current = list;
		Item previous = current;
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

	public Item NodeAtEnd() {
		Item temp;
		if (list == null)
			return null;
		temp = list;
		while (temp._next != null)
			temp = temp._next;
		return temp;
	}

	public void AppendToList(int value) {
		Item temp = new Item(value, null);
		if (list == null)
			list = temp;
		else
			NodeAtEnd()._next = temp;
	}

	public void RemoveNode(int value) {
		Item temp = list;
		if (temp == null)
			return;
		if (temp._value == value)
			list = temp._next;
		else {
			Item previous = temp;
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

	public int LengthOfList() {
		Item temp = list;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp._next;
		}
		return count;
	}

	public void DisplayList() {
		Item temp = list;
		while (temp != null) {
			System.out.print(temp._value + " ");
			temp = temp._next;
		}
	}

	public void AddToList(int value) {
		Item node = new Item(value, null);
		Item temp;
		temp = list;

		while (temp._next != null) {
			temp = temp._next;
		}
		temp._next = node;
		list = temp;
	}

}
