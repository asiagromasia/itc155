import java.util.Arrays;

public class ArrayIntList {
	private int[] elementData; // list of integers
    private int size;          // current number of elements in the list

    public static final int DEFAULT_CAPACITY = 100;

    
    public ArrayIntList() {
		this(DEFAULT_CAPACITY);
	}
    public ArrayIntList(int capacity) {
		if(capacity < 0 ) {
			throw new IllegalArgumentException("Capacity: " + capacity);
			
		}
		elementData = new int[capacity];
		size = 0;
	}


	public void add(int value) {
	        ensureCapacity(size + 1);
	        elementData[size] = value;
	        size++;
	    }
	public void ensureCapacity(int capacity) {
	        if (capacity > elementData.length) {
	            int newCapacity = elementData.length * 2 + 1;
	            if (capacity > newCapacity) {
	                newCapacity = capacity;
	            }
	            elementData = Arrays.copyOf(elementData, newCapacity);
	        }
	    }
	 
	//create a string representation of the list
	public String toString() {
			if(size == 0) {
				return "[]";
			} else {
					String result = "[" + elementData[0];
			for(int i = 1; i < size; i++) {
				result += ", " + elementData[i];
					}
					result += "]";
					return result;
					}
				}

	public void replaceAll(int value, int newValue) {
		//moves numbers from one list to second and if unwanted value met assignes new one
		    	int[] list1 = {11, -7, 3, 42, 3, 0, 14, 3};
		    		
				ArrayIntList list2 = new ArrayIntList();
		
				for (int n : list1) {
					 if (n == value) {
						 n = newValue;
					 }
					 list2.add(n);
				
				 }
				 
				 System.out.println("old list" + (Arrays.toString(list1)));
				 System.out.println("new list" + list2);
		}
			       			
			
}


