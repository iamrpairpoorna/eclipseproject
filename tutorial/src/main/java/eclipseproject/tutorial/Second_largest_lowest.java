package eclipseproject.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Second_largest_lowest {

	public static void main(String[] args) {
		int[] intArray ={1, 2, 5, 9, 6, 4, 7, 2};
		List list = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		List alist = new ArrayList( new TreeSet(list));
		System.out.println(alist);
		System.out.println("Second Smallest number:"+alist.get(1));
		System.out.println("Second largest number:"+alist.get(alist.size()-2));

	}

}
