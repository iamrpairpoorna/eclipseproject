package eclipseproject.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SmallestPair {

	public static void main(String[] args) {
		int[] intArray ={1, 2, 3, 7};
		List list = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		List alist = new ArrayList( new TreeSet(list));
		System.out.println(alist);
		System.out.println("Smallest pair sum:"+((Integer) alist.get(0) + (Integer) alist.get(1)));
	}

}
