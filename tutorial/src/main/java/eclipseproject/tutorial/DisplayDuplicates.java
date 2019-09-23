package eclipseproject.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class DisplayDuplicates {

	public static void main(String[] args) {
				HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
				List<Integer> duplicate = new ArrayList<Integer>();
				int[] intArray = {1, 2, 5, 5, 6, 6, 7, 2};
					   for(int i=0;i<intArray.length;i++){
						   if(!hm.containsKey(intArray[i]))
						   hm.put(intArray[i], 1);
						   else{
							duplicate.add(intArray[i]);
							hm.put(intArray[i], hm.get(intArray[i])+1);
						   }
				} 
			
				System.out.println(duplicate);
		
	}

}
