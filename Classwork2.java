package week3.day2;

public class Classwork2 {

	public static void main(String[] args) {

		String str="Education";
		String str1 = str.toLowerCase();
		char[] vowels={'a','e','i','o','u'};
		char[] charArr = str1.toCharArray();// e,d,u,c,a,t,i,o,n
		int vowelCOunt=0;
			for(int i=0;i<charArr.length;i++)
			{
				for(int j=0;j<vowels.length;j++)
				{
					if(charArr[i]==vowels[j])
					{
						vowelCOunt++;
			
					}
						
				}
				
			}
			System.out.println("The vowel count are : "+vowelCOunt);
	}

}
