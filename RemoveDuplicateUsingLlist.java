/******
	* Pseudo code :
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 * g) Displaying the String without duplicate words	
	 */


package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveDuplicateUsingLlist {

	public static void main(String[] args) {
		String output="";
		String text="We learn java basics as part of java sessions in java week1";
		System.out.println(text);
		List<String> listItem=new ArrayList<String>();
		int count=0; 
		  String[] textSplit = text.split(" ");
		  for(int i=0;i<textSplit.length;i++) {//Add splited word to list
			  listItem.add(textSplit[i]);
		  }
		  //to check both words are equal
		  for(int j=0;j<listItem.size();j++)
		  {
			  for(int k=j+1;k<listItem.size()-1;k++) 
			  {
				  if(listItem.get(k).equalsIgnoreCase(listItem.get(j)))
				  {
					  count++;
					  listItem.remove(k);
				  }
						  
			  }
		  }
		  System.out.println("The number of duplicate word are : "+count);
		  System.out.println(listItem);
		}
}
