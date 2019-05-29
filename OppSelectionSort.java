import java.util.Arrays;

//write modified version of selection sort algmthat selects the largest element and moves it to the end
//rather then selecting the smallest and moving it to beginning 
public class OppSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] a = {12, 33, 21, 42, 84, 99, 29, 92, 23};
     	oppositeSelSort(a);
		System.out.print(Arrays.toString(a));
			
	}
	
	public static void oppositeSelSort(int a[]) {
		for (int i = 0; i < a.length -1; i++ ) {
		for (int j = 0; j < a.length - i -1; j++ )
			if(a[j] > a[j+1]) {
				//swap a[j+1] and a[j]
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				System.out.println(Arrays.toString(a));
			}
		}
	}
	}

/*	another way:
    public static void oppositeSelSort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for(int j = i+1; j< a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i]= a[j];
					a[j]= temp;
				} 
				}
				
			}
		}
*/	
		

//same speed what original version
//complexity class is O(N)^2