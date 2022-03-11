package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClassWork1 {

	public static void main(String[] args) 
	{
		String str1 = "TestLeaf is located in Teynampet and above taccobell.";
			String str2 = str1.toUpperCase();
			String[] splitWords = str2.split(" ");
			
			for(int i=0;i<splitWords.length;i++)
			{	
				
				if(splitWords[i].startsWith("T"))
				System.out.println(splitWords[i]);
			}

				
	}
	}


