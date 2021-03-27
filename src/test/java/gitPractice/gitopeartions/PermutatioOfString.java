package gitPractice.gitopeartions;

import java.util.ArrayList;
import java.util.HashMap;

public class PermutatioOfString {

	public static void main(String[] args) {
		permutation("abc");
	}

	
	
	private static void permutation(String str) {

		
		for (int i = 0; i < str.length(); i++)

		{
			String temp = "";
			temp = "" + str.charAt(i);
			StringBuffer temp1 = new StringBuffer();

			for (int j = 0; j < str.length(); j++) {

				if (str.charAt(j) != str.charAt(i)) {
					temp1 = temp1.append(str.charAt(j));

				}
				

			}
			System.out.println(temp+temp1);
			//System.out.println(temp+temp1.reverse());

		}
	}
}
