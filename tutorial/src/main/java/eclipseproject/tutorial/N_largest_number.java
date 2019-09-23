package eclipseproject.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class N_largest_number {

	public static void main(String[] args) {
		int[] intArray ={9, 2, 12, 5, 4, 7, 3, 19, 5};
		List list = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		List alist = new ArrayList( new TreeSet(list));
		System.out.println(alist);
		System.out.println("Third largest number:"+alist.get(alist.size()-3));
		
	}

}
