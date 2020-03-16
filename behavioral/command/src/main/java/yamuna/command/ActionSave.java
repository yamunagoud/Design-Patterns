package yamuna.command;

public class ActionSave implements ActionListener {
	 private Document doc;  
	   public ActionSave(Document doc) 
	   {  
	        this.doc = doc;  
	    }  
	    public void execute() 
	    {  
	        doc.save();  
	    }  
}
