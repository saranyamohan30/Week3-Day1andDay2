package week3.day2;

public class PalindromeString {
	
	public void palindromeCheck(String input)
	{		
			String output="";
			/*char temp;
			//char[] cs = input.toCharArray();
*/			
			for(int i=input.length()-1;i>=0;i--)
			{
			output=output+input.charAt(i);
			}
			System.out.println(output);
			if(output.equals(input))
			{
				System.out.println("It is a palindrome");
			}else
				System.out.println("It is not a palindrome");
	}
	
	public static void main(String[] args) {
		
		PalindromeString testObj=new PalindromeString();
		testObj.palindromeCheck("busstop");//madam -Palindrome

	}

}
