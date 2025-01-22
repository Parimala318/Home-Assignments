package HomeAssignmentDay3;

import java.util.Arrays;

public class FindMissingElement
{
		public static void main(String[] args) 
		{
			
			int[] number= {1,4,3,2,8,6,7};
			Arrays.sort(number);
			for(int i=0;i<number.length;i++)
			{
				if(number[i]!=i+1)
				{
				System.out.println(i+1);
				break;
				}
			
			}

		}
}


