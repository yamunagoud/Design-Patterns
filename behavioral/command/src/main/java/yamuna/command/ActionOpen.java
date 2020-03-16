package yamuna.command;

public class ActionOpen implements ActionListener{
	  private Document doc;  
	    public ActionOpen(Document doc) 
	    {  
	        this.doc = doc;  
	    }  
	    public void execute()
	    {  
	        doc.open();  
	    }  
}
