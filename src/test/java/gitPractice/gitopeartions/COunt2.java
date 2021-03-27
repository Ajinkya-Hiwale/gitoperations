package gitPractice.gitopeartions;



/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class COunt2 {
    public static int processArray(Integer[] nos) {
        int avg=0;
		
		for(int i=0;i<nos.length;i++)
		{
			avg=avg+nos[i];
		}
		
		return avg/(nos.length-1);
}

    public static void main (String[] args) {
        System.out.println(COunt2.processArray(new Integer[] {2,5,3,7,-1}));
        
    }
}

