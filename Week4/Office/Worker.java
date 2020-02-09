package Office;

import People.*;
import java.io.PrintStream;

public class Worker extends Person {
		
	private Boss boss;
	public Worker(String name, Date dob, Boss boss)
	{
		super(name,dob);
		this.boss = boss;
		boss.add_worker(this);
	}
	
	public void new_boss(Boss newBoss)
	{
		boss.sub_worker(this);
		this.boss = newBoss;
		boss.add_worker(this);
		
	}
	
	public Boss get_Boss()
	{
		return boss;
	}
	
	public void print(PrintStream ps)
	{
		ps.print("\nBoss of worker " + this.name + " is " + this.boss.getName());
	}
	public String toString() {
		return "Name=" + name + ", Birth date = " + bdate + ", Boss name:" + boss.getName() ;
	}
}
