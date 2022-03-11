//Find Data types in the String

package week3.day2;

import java.util.Arrays;

public class ReverseWordsinString {

	public static void main(String[] args) {
	
		String sentence="Hi, Welcome To the Selen!um CLass @ Leaf 2022 !";
		int digitCount, letterCount,spaceCount=0;
		String[] strings = sentence.split(" ");
		String RevString="";
		System.out.println(Arrays.toString(strings));
		int stringLength=strings.length;
		System.out.println("The Length of Array is : "+stringLength);
		for(int i=0;i<stringLength;i++)
		{
			if((i+1)%2==0)
				System.out.println("The Even position Words are :"+strings[i]);
				
		
		
//		for(int k=0;k<stringLength;k++) {
			if((i+1)%2==0) {
			for(int j=stringLength-1; j>=0;j--) {
				RevString=RevString+" "+strings[j];
			}
			}
		}	
		System.out.println("The reverse ofthe words:");
			System.out.println(RevString);
	}

}
