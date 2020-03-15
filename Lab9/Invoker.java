import javax.swing.JOptionPane;

public class Invoker {
	
	MyCom commandObject;
	public void register(MyCom c)
	{
		commandObject = c;
	}
	
	public void run()
	{
		
		while(true)
		{
			String userInput = JOptionPane.showInputDialog("Please enter something");
			char first = userInput.charAt(0);
			if((int)first == '1')
			{
				System.out.println(userInput.substring(1));
				commandObject.execute(1);
			}
			else if(first == '2')
			{
				System.out.println(userInput.substring(1));
				commandObject.execute(2);
			}
			else if(first == 'q')
			{
				break;
			}
		}
	}
}
