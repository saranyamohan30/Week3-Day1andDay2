package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumberinList {

	public static void main(String[] args) {
//		In Set duplicate entries are not allowed
		Set<Integer> setObject=new TreeSet<Integer>(Arrays.asList(14,15,16,18,19));
		/*setObject.add(2);
		setObject.add(3);
		setObject.add(7);
		setObject.add(6);
		setObject.add(4);*/
		List<Integer> listObject=new ArrayList<Integer>();
		//System.out.println(listObject);//empty list
		listObject.addAll(setObject);
		System.out.println(listObject);//set is added to List
		Collections.sort(listObject);
		
		  for(int i=0; i<listObject.size()-1; i++) {
		  
//		  if((i+1)!=listObject.get(i))
			if(listObject.get(i)+1!=listObject.get(i+1))
			{
				System.out.println(listObject.get(i)+1);
			}
			 }
	}
}
