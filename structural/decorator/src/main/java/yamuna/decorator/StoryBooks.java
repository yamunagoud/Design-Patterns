package yamuna.decorator;

public class StoryBooks extends Books {
	public StoryBooks(Library obj) {  
        super(obj);  
    }  
    public String getBookname(){  
        return super.getBookname() +" and story book  ";   
    }  
    public double getBookPrice()   {  
        return super.getBookPrice()+150.0;  
    }  
}
