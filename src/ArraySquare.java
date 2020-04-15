
import java.util.Scanner;

class ArraySquare {
	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Size of Array\n");
		int  size=in.nextInt();
		System.out.println("Enter the Elements\n");
		 int [] numbers=new int[size];
		 int [] squares=new int[size];
		 for(int i=0;i<size;i++)
		 {
			 numbers[i]=in.nextInt();
		 }
		 System.out.println("The squares are --");
		 int sum=0;
		 for(int j=0;j<size;j++)
		 {
			 
					 sum=sum+(numbers[j]*numbers[j]);
		 }
		 for(int k=0;k<size;k++)
		 {
			squares[k]=sum-(numbers[k]*numbers[k]); 
		 }
		 for( int n=0;n<size;n++)
		 {
			 System.out.println(squares[n]);
		 }
		 
		 
	}
	

}
