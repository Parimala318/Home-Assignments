package Week2.Day4.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args)
	{
		List<Integer> Array1=new ArrayList<Integer>();
		Array1.add(1);
		Array1.add(2);
		Array1.add(3);
		Array1.add(4);
		Array1.add(10);
		Array1.add(6);
		Array1.add(8);
		System.out.println("List is"+Array1);
		Collections.sort(Array1);
		for(int i=1;i<Array1.size();i++)
		{
			if (Array1.get(i) - Array1.get(i-1) == 1)
			{

	        }
			else 
	        {
	            System.out.println("Missing number is " + (Array1.get(i-1) + 1));
	            Array1.add((Array1.get(i-1)+1));
	            Collections.sort(Array1);
		}
	

	}

	}}
