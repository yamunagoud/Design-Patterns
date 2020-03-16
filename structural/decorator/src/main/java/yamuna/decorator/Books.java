package yamuna.decorator;

public class Books implements Library {
	private Library obj;  
    public Books(Library obj) 
    {  
        this.obj=obj;  
    }   
    public String getBookname()
    {  
        return obj.getBookname();   
    }  
    public double getBookPrice(){  
        return obj.getBookPrice();  
    }  
}
