package eclipseproject.tutorial;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfUnique {

	public static void main(String[] args) {
		int[] intArray ={1, 6, 4, 3, 2, 2, 3, 8, 1};
		List list = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		HashSet hs = new HashSet(list);
		int sum=0;
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()){ sum = sum   +   itr.next();}
		System.out.println(hs);
		System.out.println("sum of unique no.s:"+sum);
		
	}

}
