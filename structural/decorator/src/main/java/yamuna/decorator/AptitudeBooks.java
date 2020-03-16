package yamuna.decorator;

public class AptitudeBooks extends Books{
	public AptitudeBooks(Library obj) {  
        super(obj);  
    }  
    public String getBookname(){  
        return super.getBookname() +" and aptitude book  ";   
    }  
    public double getBookPrice()   {  
        return super.getBookPrice()+265.0;  
    }
}
