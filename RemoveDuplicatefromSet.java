package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatefromSet {

	public void remDuplicate()
	{
		
	}
public static void main(String[] args) 
{
	String text="We learn java basics as part of java sessions in java week1";
	System.out.println(text);
	Set<String> removeDuplicate=new LinkedHashSet<String>();
	String[] textSplit = text.split(" ");
	  for(int i=0;i<textSplit.length;i++)
	  {//Add splited word to list
		  removeDuplicate.add(textSplit[i]);
	  }
	 System.out.println(removeDuplicate);
}
}
