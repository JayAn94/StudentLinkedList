
public class studentsList<E> {
	private StringNode front; // first node in list

	// -----------------------------------------
	// Constructor. Initially list is empty.
	// -----------------------------------------
	public studentsList() {
		front = null;
	}

	// -----------------------------------------
	// Adds a student name to front of list.
	// -----------------------------------------
	public void addToFront(E anEntry) {
		if (front == null) {
			front = new StringNode(anEntry, front);
		} else {
			StringNode temp = new StringNode(anEntry, front);
			temp.next = front;
			front = temp;
		}
	}

	// -----------------------------------------
	// Adds given student name to end of list.
	// -----------------------------------------
	public void addToEnd(E anEntry) {
		StringNode node = new StringNode(anEntry, front);
		node.next = null;
		if (front == null) {
		} else {
			StringNode temp = front;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	// -----------------------------------------
	// Removes the first node from the list.
	// If the list is empty, does nothing.
	// -----------------------------------------
	public void removeFirst() {
		if (front != null) {
			front = front.next;
		}
	}

	// ------------------------------------------------
	// Prints the list elements from first to last.
	// ------------------------------------------------
	public void print() {
		System.out.println("---------------------");
		System.out.print("Students in Line: ");
		StringNode temp = front;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
		System.out.println("\n-----------------------\n");
	}

	// ------------------------------------------------
	// removeLast
	// -----------------------------------------------
	public void removeLast() {
		StringNode temp = front;
		if (temp == null) {
			System.out.println("Cannot remove because null");
			return;
		} else if (temp.next == null) {
			front = null;
			return;
		}

		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

	public void removeByName(E anEntry) {
		
		StringNode current = front;
		StringNode temp = null;
		
		if (current != null && current.val.equals(anEntry)) {
			front = current.next;
			return;
		}

		while (current != null && !current.val.equals(anEntry)) {
			temp = current;
			current = current.next;

			if (current == null) {
				break;
			}
		}
		temp.next = current.next;

	}

//*************************************************************
// An inner class that represents a node in the integer list.
// The public variables are accessed by the StringList class.
//*************************************************************
	private class StringNode {
		public E val; // value stored in node
		public StringNode next; // link to next node in list
		// ------------------------------------------------------------------
		// Constructor; sets up the node given a value and StringNode reference
		// ------------------------------------------------------------------

		private StringNode(E val, StringNode next) {
			this.val = val;
			this.next = next;
		}
	}

}
