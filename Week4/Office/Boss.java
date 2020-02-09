package Office;

import People.*;
import java.io.PrintStream;
import java.util.ArrayList;

public class Boss extends Person {
	
	private ArrayList<Worker> workers;
	private static int index = 0;
	
	public Boss(String name, Date dob)
	{
		super(name,dob);
		workers = new ArrayList<Worker>();
	}
	
	public void add_worker(Worker worker)
	{
		workers.add(worker);
	}
	
	public void sub_worker(Worker worker)
	{
		workers.remove(worker);
	}
	
	public void print(PrintStream ps)
	{
		ps.print(this.name + " has " + this.workers.size() + " worker(s)");
		for(int i=0; i<this.workers.size(); i++)
		{
			ps.print("\n" + i + ")" + workers.get(i).getName());
		}
	}
	
	public Worker next()
	{
		if(this.workers.isEmpty() || index >= this.workers.size())
		{
			return null;
		}
		else
		{
			return this.workers.get(index++);
		}
	}
	public void reset()
	{
		index =0;
	}
	
	public String toString() {
		return "Name=" + name + ", Birth date = " + bdate + ", Number of Workers: " + workers.size();
	}
}
