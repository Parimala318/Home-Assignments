package Week2.Day4.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args)
	{
		List<String> Array1=new ArrayList<String>();
		Array1.add("3");
		Array1.add("2");
		Array1.add("11");
		Array1.add("4");
		Array1.add("6");
		Array1.add("7");
		System.out.println("List is"+Array1);
		
		List<String> Array2=new ArrayList<String>();
		Array2.add("1");
		Array2.add("2");
		Array2.add("8");
		Array2.add("4");
		Array2.add("9");
		Array2.add("7");
		System.out.println("List is"+Array2);
		
		//Array1.retainAll(Array2);
		//System.out.println(Array1);
		
		for(int i=0;i<Array1.size();i++)
		{
			for(int j=0;j<Array2.size();j++)
			{
				if (Array1.get(i).equals(Array2.get(j)))
				{
					System.out.println(Array1.get(i));
				
				}
		}
		
	
		}
		
}

	

}
