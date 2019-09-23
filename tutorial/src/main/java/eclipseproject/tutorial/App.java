package eclipseproject.tutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] array = {5,3,8,1,9,4,6};
           //ArrayList list = new ArrayList(Arrays.asList(array));
        
        List list = Arrays.stream(array).boxed().collect(Collectors.toList());
        
        System.out.println(list);
        
        System.out.println(list.get(1));
        
        TreeSet<Integer> treeSet = new TreeSet<Integer>(list);
        
        System.out.println(treeSet);
        
        System.out.println(treeSet.first());
        
        System.out.println(treeSet.last());
    }
}
