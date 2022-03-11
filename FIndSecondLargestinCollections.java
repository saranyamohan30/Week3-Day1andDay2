		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */

package week3.day2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class FIndSecondLargestinCollections {

	public static void main(String[] args) {
		ArrayList<String> listObject=new ArrayList<String>();
		listObject.add("58");
		listObject.add("41");
		listObject.add("51");
		/*
		 * listObject.add("26"); listObject.add("48");
		 */
		System.out.println("The elem in List are : "+listObject);
		Collections.sort(listObject);
		System.out.println("The elem in List are : "+listObject);
		Collections.reverse(listObject);
		
		System.out.println("The Largest Number inthe list is : "+listObject.get(1));	
		
	}
}
