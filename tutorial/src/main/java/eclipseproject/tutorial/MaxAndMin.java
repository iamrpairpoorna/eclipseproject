package eclipseproject.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MaxAndMin {

	public static void main(String[] args) {
		int[] intArray ={1, 2, 5, 5, 6, 6, 7, 2};
		List list = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		List alist = new ArrayList( new TreeSet(list));
		System.out.println(alist);
		System.out.println("Maximum Number:"+ alist.get(alist.size()-1)+"and Minimum Number:"+alist.get(0));
		//System.out.println("Largest Difference is:"+ ((Integer) alist.get(alist.size()-1)-(Integer) alist.get(0)));
	}

}
