
//simple version of the linked list class
public class LinkedIntList{
	private static ListNode front; //first value in the list
	private int data;
	private int next;
	
	//construct an empty list
	public LinkedIntList() {
		front = null;
	}
	/*
	 public class ListNode{
	 
		public int data;
		public ListNode next;
	}
	*/
	//append a value to the end of the list
	public void add(int value) {
		if(front == null) {
			front = new ListNode(value);
		} else {
			ListNode current = front;
			while (current.next != null) {
			current = current.next;
		}
		current.next = new ListNode(value);
	}
	}
	
	public int size() {
		int count = 0;
		ListNode current = front;
		while(current != null) {
			current = current.next;
			count++;
		}
		return count;
	}
	
	public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }
	//return the value at a given index in the list
	public int get(int index) {
		return nodeAt(index).data;
	}
	//pre: 0< index< size
	//return a reference to the node at given index
	private ListNode nodeAt(int index) {	
		ListNode current = front;
		for(int i =0; i<index; i++) {
			current = current.next;
		}
		return current;
	}
	
	public void add(int index, int value) {
		if(index==0) {
			front= new ListNode(value, front);
		} else {
			ListNode current = nodeAt(index -1);
			current.next = new ListNode(value, current.next);
		}
	}
	
	//pre 0<index<size
	//post: remove value at the given index
	public void remove(int index) {
		if(index ==0) {
			front = front.next;
		} else {
			ListNode current = nodeAt(index - 1);
			current.next = current.next.next;
		}
		
	}

	
	
	public boolean isSorted() {
		if(front == null) {
			return true;
		} else {
		
		//following is same as int i=0;
		ListNode current = front;
		while (current.next != null ) {
		//	int value = 0;
		
			if (current.data > current.next.data ) {
			//	System.out.println("false");
				return false;
				} 
			current = current.next;
			}
		}
	//	System.out.println("true");
		return true;

	}
	
}
