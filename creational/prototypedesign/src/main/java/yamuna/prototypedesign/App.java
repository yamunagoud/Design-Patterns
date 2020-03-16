package yamuna.prototypedesign;

/**
 * Hello world!
 *
 */
import java.util.Scanner;  
interface Prototype {  
	  
    public Prototype getClone();  
     
}
class StudentRegister implements Prototype{  
    
	   private int id;  
	   private String name;    
	   private String branch;  
	      
	   public StudentRegister()
	   {  
	            System.out.println("  Student Registers ");  
	            System.out.println("---------------------------------------------");  
	            System.out.println("ID"+"\t"+"Name"+"\t"+"Branch");  
	      
	}  
	  
	 public  StudentRegister(int id, String name, String branch)
	 {           
	        this();  
	        this.id = id;  
	        this.name = name; 
	        this.branch = branch;  
	    }  
	      public void showRecord()
	      {  
	          
	        System.out.println(id+"\t"+name+"\t"+branch);  
	   }  
	  
	    public Prototype getClone() {  
	          
	        return new StudentRegister(id,name,branch);  
	    }  
	}
public class App 
{
    public static void main( String[] args )
    {
    	 Scanner sc=new Scanner(System.in);  
         System.out.println("Enter Student Id: ");  
         int sid=sc.nextInt();
         System.out.println("Enter Student Name: ");  
         String sname1=sc.nextLine();  
         String sname=sc.nextLine(); 
         System.out.println("Enter Student Branch: ");  
         String sbranch= sc.nextLine();  
         StudentRegister s1=new StudentRegister(sid,sname,sbranch);  
         s1.showRecord();   
         StudentRegister s2=(StudentRegister) s1.getClone();  
         s2.showRecord();  
    }
}
