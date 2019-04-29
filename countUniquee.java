//write a method countUnique that accepts a list of integers as a parameter and return the number of unique integer values in the list.
//use a set as storage, the empty list returns 0
import java.util.HashSet;
import java.util.Set;

public class countUniquee {

	public static void main(String[] args) {
	

			int[] list = {3,7,3,-1,2,3,7,3,5,5,2,15,15};
		
		System.out.print("The number of integers in the list is:" + list.length);
		System.out.println();
		
		countUnique(list);
		
		
	}

	public static int countUnique(int[] list) {
	
		Set<Integer> newList = new HashSet<Integer>(); 
	
		for (int val : list){
			newList.add(val);
		}
		if (newList.size() < 1) {
			
			System.out.print("The number of unique integers in this list is:" + newList.size());
			return 0;
		}
		System.out.print("The number of unique integers in this list is:" + newList.size());
		return newList.size();	
	}
	
}
		

