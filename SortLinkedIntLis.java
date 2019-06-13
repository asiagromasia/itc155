import java.awt.List;

// Write a method called isSorted that returns true if the list is in sorted order and 
//returns false otherwise.An empty list is considered to be sorted. Use LinkedIntList.

public class SortLinkedIntLis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedIntList list = new LinkedIntList();
		 
	        list.add(18);
	        list.add(20);
	       list.add(80);
	        list.add(44);
	        list.add(51);
	        
	        System.out.println(list);
	       // list.isSorted(); instead of addint print out statements in method do following
	       // LinkedIntList.isSorted(list);
	        System.out.println(list.isSorted());
	       
		
	}

}
