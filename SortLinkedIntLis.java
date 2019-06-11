import java.awt.List;

// Write a method called isSorted that returns true if the list is in sorted order and 
//returns false otherwise.An empty list is considered to be sorted. Use LinkedIntList.

public class SortLinkedIntLis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedIntList list = new LinkedIntList();
		 
	        list.add(18);
	        list.add(20);
	       list.add(23);
	        list.add(44);
	        list.add(51);
	        
	        System.out.println(list);
	        System.out.println("Size "+ list.size());
	      //  list.add(51);
	        System.out.println(list);
	        list.isSorted();
	     //   LinkedIntList.isSorted(list);
	       
		
	}

}
