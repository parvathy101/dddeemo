import java.util.Scanner;

class RepeatingWords {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Sentence\n");
	    String sentence=in.nextLine();
	    
	   String[] words = sentence.split("[[ ]*|[//.]]");
	    String []repeat=new String[words.length];
	       for(int i=0;i<words.length;i++)
	       {
	    	   for(int j=i+1;j<words.length;j++)
		       {
	    		   
	    	
	    		    if(words[i].compareTo(words[j])==0)
	    		    	{
	    		          repeat[j]=words[j];
	    		    	}
	    		     
		       }
	    	   
	    	   
	       }
	       System.out.println("Repeating words are");
	       for(int i=0;i<repeat.length;i++)
	       {
	    	   if(repeat[i]!=null)
	    	   {
	    	   System.out.println(repeat[i]);
	    	   }
	       }
	}

}
