import java.util.ArrayList;
//Write a Method called removeEvenLength that takes an ArrayList of strings as a parameter
//and removes all of the strings of even length from the list

public class removeEvenLength {

	public static void main(String[] args) {

	
		ArrayList<String> list = new ArrayList<String>();
		  list.add("abc");
		  list.add("abcs");
		  list.add("abcsss");
		  list.add("abc");
		  list.add("abcs");
		  
		System.out.println("All list: " + list);
		
		 for (int i = 0; i < list.size(); i++) {
		       String str = list.get(i);
		       if (str.length() % 2 == 0) {
		    	   list.remove(str);
		    	   i--;
		    	   
		       }
	             
		 }
		 System.out.println("New list: " + list);
	}
}   

		 //following where tries to remove even size strings from the array using Boolean
		    	   
		//      int  P = str.length();
		               
		//	if ((P = str.length()) && (list.contains(P))){
		     //  if (list.contains(P)) {
		    //  if (list.contains(str.length())) {
		    	         
		    //   } else { System.out.println("loop list: " + list);
	
		





