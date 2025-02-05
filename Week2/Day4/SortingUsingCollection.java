package Week2.Day4.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args)
	{
		List<String> Companies=new ArrayList<String>();
		Companies.add("HCL");
		Companies.add("Wipro");
		Companies.add("Aspire Systems");
		Companies.add("CTS");
		Collections.sort(Companies);
	     List<String> reverse = new ArrayList<>();
		for(int i=Companies.size()-1;i>=0;i--)
		{
		String reverseElement=	Companies.get(i);
		reverse.add(reverseElement);
		
				
		}
		System.out.println(reverse);
		

	}

}
