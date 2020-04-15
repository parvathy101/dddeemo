import java.util.Scanner;

class SameLetters {
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter First String\n");
		String first=in.nextLine();
		System.out.println("Enter Second String\n");
		 String second=in.nextLine();
		 Boolean flag=true;
		 if(first.length()!=second.length())
		 {
			 
			 System.out.println("Please Enter Same Length Strings");
			 return;
			 
		 }
		
		char temp = 0;
		char temp1 = 0;

		char[] chars = first.toCharArray();
		char[] chars1 = second.toCharArray();
		for (int i = 0; i < chars.length; i++) {

			for (int j = 0; j < chars.length; j++) {

				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}

			}

		}
		
		for (int i = 0; i < chars1.length; i++) {

			for (int j = 0; j < chars1.length; j++) {

				if (chars1[j] > chars1[i]) {
					temp1 = chars1[i];
					chars1[i] = chars1[j];
					chars1[j] = temp1;
				}

			}

		}

		for (int k = 0; k < chars.length; k++) {
			 if(chars[k]!=chars1[k])
			 {
				flag=false; 
				
			 }
		}
		
		
		if(flag)
		 {
			 System.out.println("Same");
		 }
		 else
		 {
			 System.out.println("Different");
		 }
	}
	

}
