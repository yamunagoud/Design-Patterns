package yamuna.decorator;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 int  choice; 
    	 int op=0;
       do{        
        System.out.println("Library");  
        System.out.println("1.Magazine");   
        System.out.println("2.Story Books");  
        System.out.println("3.Aptitude Books");  
        System.out.println("Enter your choice: ");  
        Scanner sc=new Scanner(System.in);   
        choice=sc.nextInt();
        switch (choice) {  
        case 1: Magazines lib1=new  Magazines();  
        System.out.println(lib1.getBookname());  
        System.out.println( lib1.getBookPrice());  
        break; 
                 
        case 2: 
                Library lib2=new StoryBooks((Library) new Magazines()); 
                System.out.println(lib2.getBookname());  
                System.out.println( lib2.getBookPrice());  
                break;    
     case 3 :
            	Library lib3=new AptitudeBooks((Library) new Magazines());  
                     System.out.println(lib3.getBookname());  
                    System.out.println( lib3.getBookPrice());   
            break;    
              
         default:   
            System.out.println("These books are not available");        
     } 
          System.out.println("Enter 1 to continue and 0 to exit");
          op=sc.nextInt();
}while(op==1);  
    }
}
