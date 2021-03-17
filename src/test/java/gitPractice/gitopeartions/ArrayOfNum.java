package gitPractice.gitopeartions;

import java.util.Arrays;
import java.util.List;

public class ArrayOfNum {

public static void main(String[] args) {
		
		Integer a[]= new Integer[]{4,7,0,8,1,3,6};
		
		int sum=10;
		
		List<Integer> list=Arrays.asList(a);
		
		for(int i=0;i<list.size();i++)
		{
			int j=i;
			int diff=sum-list.get(i);
			if(list.contains(diff))
			{
				System.out.println(a[i]+" "+diff);
			}
		
		}
		
	
}

}
