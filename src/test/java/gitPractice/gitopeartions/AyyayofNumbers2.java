package gitPractice.gitopeartions;

public class AyyayofNumbers2 {

	
	public static void main(String[] args) {
		
		int a[]= {4,7,0,8,1,3,6};
		
		int sum=10;
		
		
		for(int i=0;i<a.length-1;i++ )
		{
			
			for(int j=i+1;j<=a.length-1;j++)
			{
				
				if(a[i]+a[j]==sum)
				{
					System.out.println("Pair of two number which will sum 10 is "+ a[i]+","+a[j]);
				}
				
			}
			
		}
		System.out.println("program finished");
		
		
	}
}
