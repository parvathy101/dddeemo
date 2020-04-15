import java.util.Scanner;

class DateDisplay {
	
	public static void main(String args[])
	{
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 3 integer for the day of the month,month and year\n");
	    String day=in.next();
	    String month=in.next();
	    String year=in.next();
	    String newDate=null;
	    
        if(day.endsWith("1"))
        {
        	day=day+"st";
        }
        else if(day.endsWith("2"))
        {
        	day=day+"nd";
        	
        } else if(day.endsWith("3")) 
        {
        	day=day+"rd";
        	
        } else if(day.endsWith("4"))
        {
        	day=day+"th";
        }
	    switch(month)
	    {
	    case "1":month="January";
	           break;
	    case "2":month="February";
	           break;
	    case "3":month="March";
               break;
        case "4":month="April";
               break;
        case "5":month="May";
               break;
        case "6":month="June";
               break;
        case "7":month="July";
        	   break;
        case "8":month="August";
        	   break;
        case "9":month="September";
        	   break;
        case "10":month="October";
        	   break;
        case "11":month="November";
        	   break;
        case "12":month="December";
        	   break;
        default: month=null;
        	   break;
	    }
	    
	    newDate=day+"\t"+month+"\t"+year;
	    System.out.println(newDate);
	}
}
