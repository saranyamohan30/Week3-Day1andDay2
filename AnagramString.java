package week3.day2;

import java.util.Arrays;

public class AnagramString 
{

	public void AnagramCheck(String str1,String str2)
	{
		int l1 = str1.length();
		int l2 = str2.length();
		if(l1!=l2)
		{
		System.out.println("It is not a Anagram");	
		}
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			Arrays.sort(arr1);
//			System.out.println(arr1);
			Arrays.sort(arr2);
//			System.out.println(arr2);
			
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]==arr2[i])
				{
					System.out.println(str1+" "+str2+" "+"are Anagram");	
					break;
				}
					else
						System.out.println(str1+" "+str2+" "+"are not a Anagram");
						break;
				
			}
		}
	public static void main(String[] args) {
		AnagramString anagramObj=new AnagramString();
		anagramObj.AnagramCheck("SHOT","HOTE");//HEART,EARTH
		anagramObj.AnagramCheck("HEART","EARTH");
	}

}

