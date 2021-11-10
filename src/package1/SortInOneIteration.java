package package1;

import java.util.ArrayList;
import java.util.List;

public class SortInOneIteration 
{
	public static void main(String[] args) 
	{
		int[] n = {2,1,2,1,0,2};
		List<Integer> list0 = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for(int i=0;i<n.length;i++)
		{
			switch(n[i])
			{
			case 0:
				list0.add(n[i]);
				break;
			case 1:
				list1.add(n[i]);
				break;
			case 2:
				list2.add(n[i]);
				break;
			}
			
		}
		list0.addAll(list1);
		list0.addAll(list2);
		System.out.println(list0);
		
	}
	

}
