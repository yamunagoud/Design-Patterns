package yamuna.command;

public class MenuOptions implements ActionListener {
	private ActionListener openCommand;
	private ActionListener saveCommand;
	public MenuOptions(ActionListener openCommand,ActionListener saveCommand)
	{
		this.openCommand=openCommand;
		this.saveCommand=saveCommand;
	}
	public void clickOpen()
	{
		openCommand.execute();
	}
	public void clickSave()
	{
		saveCommand.execute();
	}
	
	}

