import java.sql.Array;

//Write a method called replaceAll that accepts two integer values as parameter and replaces
//all occurences of the first value in the list with the second value
public class ReplaceAlll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {11, -7, 3, 42, 3, 0, 14, 3};
		ArrayIntList list = new ArrayIntList();
		list.replaceAll(3, 999); 
		System.out.println(list);
	}
	
	public void replaceAll(int value, int newValue) {
		int[] data = {11, -7, 3, 42, 3, 0, 14, 3};
		ArrayIntList list = new ArrayIntList();
		 for (int n : data) {
			 n=newValue;
	        
			 System.out.println(list);
	        }
		 System.out.println(list);
	}
}
