import java.util.Scanner;

public class AscendingDescending {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter String\n");
		String first=in.nextLine();
		
		 Boolean flag=true;
		
		
		char temp = 0;
		char temp1 = 0;

		char[] chars = first.toCharArray();
	
		for (int i = 0; i < chars.length/2; i++) {

			for (int j = 0; j < chars.length/2; j++) {

				if (chars[j] < chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}

			}

		}
		
		for (int i = chars.length/2; i < chars.length; i++) {

			for (int j = chars.length/2; j <chars.length ; j++) {

				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}

			}

		}
		
		
		for (int k = 0; k < chars.length; k++) {
			 System.out.println(chars[k]);
		}
	}

}
