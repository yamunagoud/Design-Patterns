package yamuna.iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	CollectionNames obj = new CollectionNames();  
        
        for(Iterator iter = obj.getIterator(); iter.hasNext();)
        {  
            String name = (String)iter.next();  
            System.out.println("Name : " + name);  
         }    
    }
}
