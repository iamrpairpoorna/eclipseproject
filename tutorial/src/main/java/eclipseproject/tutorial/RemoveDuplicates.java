



//Program to remove duplicate elements in integer array

package eclipseproject.tutorial;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
			
		int[] intArray = {1, 2, 5, 5, 6, 6, 7, 2};
		
		List list = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		
		HashSet<Integer> intSet= new HashSet<Integer>(list);
		
		System.out.println(intSet);
	}

}
