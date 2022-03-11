package week3.day2;

public class CountDataType {

	public static void main(String[] args) {
		
		/*
		 * // Build the logic to find the count of each Datatype Convert the String to
		 * character array Traverse through each character (using loop)
		 * Character.isLetter Character.isDigit Character.isSpaceChar
		 */
		String text = "$$ Welcome to 2nd Class of Automation $$ ";
		int characCOunt=0, digitCount=0,specialCount=0;
		char[] ca = text.toCharArray();//convert to character Array
		for(int i=0;i<ca.length;i++)
		{
			if(Character.isLetter(ca[i]))
			{
				characCOunt++;
				
			}
			else if(Character.isDigit(ca[i]))
			{
				digitCount++;
				
			} else
				specialCount++;
				/*
				 * if(Character.isSpace(ca[i])) { spaceCount++;
				 * System.out.println("The COunt of Space is : "+spaceCount); } else
				 */
		}	System.out.println(text);
			System.out.println("The COunt of special Characters is : "+specialCount);
			System.out.println("The COunt of Characters is : "+characCOunt);
			System.out.println("The COunt of digits is : "+digitCount);
		
		
	}

}
