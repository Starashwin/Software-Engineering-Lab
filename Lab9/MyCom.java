
public class MyCom implements Command{

	private String name;
	public void set_name(String s)
	{
		name = s;
	}
	@Override
	public void execute(int n) 
	{
		System.out.println( name + " " + n);
	}

}
