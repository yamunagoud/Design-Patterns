package yamuna.adapter;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
class Student extends StudentDetails implements AdmitCard
{
	Scanner sc=new Scanner(System.in);
	public void giveStudentDetails()
	{
		try
		{
			 System.out.println("Enter the Student name :");  
			   String studentname=sc.nextLine();   
			   System.out.println("Enter student ID:"); 
			   int sID=sc.nextInt();
			   System.out.print("Enter student branch :");  
			   String branch1=sc.nextLine();
			   String branch=sc.nextLine();
			   System.out.println("Enter student year:"); 
			   int year=sc.nextInt();
			   setStudentName(studentname);  
			   setStudentID(sID);  
			   setStudentBranch(branch); 
			   setStudentYear(year);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public String getAdmitCard() { 
		String sname=getStudentName(); 
		   int sid=getstudentID();  
		    String sbranch=getStudentBranch();
		    int syear=getstudentYear();
		          
		   return ("Name of the student is : "+ sname + "\n id number is : "+sid+"\n Branch is : "+sbranch +"\n Student is studying in :"+syear+" year");  
		  }  
}
public class App 
{
    public static void main( String[] args )
    {
    	AdmitCard admitcard=new Student();  
    	admitcard.giveStudentDetails();  
    	System.out.print(admitcard.getAdmitCard());  
    }
}
