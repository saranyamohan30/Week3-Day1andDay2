/*1. List - {Adam,Ben, Zara, Adam, Charlie, James, Ben}
Print only the duplicate - Adam, Ben
2. List - {Adam,Ben, Zara, Adam, Charlie, James, Ben, Adam, George, Adam}
Print the number of times Adam Occured - Adam - 4*/

package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.lang.*;

public class PrintDuplcateinList {
	
	public static void main(String[] args) 
	{
		List<String> printDuplicate=new ArrayList<String>();
		printDuplicate.add("Renu");
		printDuplicate.add("Mano");
		printDuplicate.add("Renu");
		printDuplicate.add("Saru");
//		List <Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		System.out.println(printDuplicate);
	for(int i=0; i<printDuplicate.size();i++) {
		for(int j=i+1;j<printDuplicate.size()-1;j++) {
			if(printDuplicate.get(i).equalsIgnoreCase(printDuplicate.get(j)))
			{
				System.out.println("This is the duplicate entry : "+printDuplicate.get(j));
				break;
			}
				
		}
	}
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	