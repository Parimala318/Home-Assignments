package Week2.Day4.Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args)
		{
			
	
		
			List<Integer> ListofNumbers=Arrays.asList(3,2,11,4,6,7);
			ListofNumbers.stream();
			ListofNumbers.sort(Comparator.reverseOrder());
			System.out.println(ListofNumbers.get(1));
			
					
					
		}
}