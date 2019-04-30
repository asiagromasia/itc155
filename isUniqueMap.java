//write a method isUnique that accepts a map whose keys and val r strings as a parameters
//and returns true if no 2 key map to the same value and 
//false if 2 or more keys do map to the same value.
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;





public class isUniqueMap {

	public static void main(String[] args) {
		
		Map<String, String> nameMap = new HashMap<String,String>();
		nameMap.put("asja","hiuye6");
		System.out.println(isUnique(nameMap));
	}
	
	public static boolean isUnique(Map<String,String> map) {
		//create a set to hold the values they will all be unique
		Set<String> pary = new HashSet<String>();
		// alterate over the values in the map
		for (String value : map.values()) {
			//check if the set has the value we are currently examining
			if(pary.contains(value)) {
				return false; //the value is already there
			}else {
				//add the value from the map to the set
				pary.add(value);
			}
			//no repeating values were found in set
		
		}
		return true;
	}
}


/* my initial code:
 
 	public class isUniqueMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isUnique("abc","123");
		
		
	}
	public static boolean isUnique(String string, String string2) {
		// TODO Auto-generated method stub
		Map<String, String> pary = new HashMap<String, String>();
		 
		
	//	if((string string2 : pary) < 1){
	//	Collection<String> names = pary.values();
		if (containsValue.(string2 : pary)) {
			
			System.out.print("true");
			return true;
		} else 
			System.out.print("false");
			return false;
	}
	
} */
