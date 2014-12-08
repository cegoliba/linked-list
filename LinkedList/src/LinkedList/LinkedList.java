package LinkedList;

public class LinkedList {

	public LinkedList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		// new List object
		List list = new List(); 

		// build the list with nodes
		list.AppendToList(0);
		list.InsertToList(3);
		list.AppendToList(1);
		list.AppendToList(2);
		list.InsertToList(4);
		
		// sort the list
		list.SortList(); 

		// display the list
		list.DisplayList();

	}
}
