package gitPractice.gitopeartions;

public class testing {
	
	public static void main(String[] args) {
		
		
String Name="Kate Winslet";
		 String temp="";
	        
	            String arr[]=Name.split(" ");
	            for(int i=arr.length-1;i>=0;i--)
	            {
	                
	                for(int j=arr[i].length()-1;j>=0;j--)
	                {
	                  
	                   temp=temp+arr[i].charAt(j); 
	                }
	                
	                temp=temp+" ";
	            }
	        
	            System.out.print(temp);
//

		





	}

}
