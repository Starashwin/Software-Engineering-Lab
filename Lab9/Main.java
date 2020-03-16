import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		MyCom myCom = new MyCom();
		myCom.set_name(JOptionPane.showInputDialog("Please enter Name"));
		invoker.register(myCom);
		invoker.run();
		
		myCom.set_name(JOptionPane.showInputDialog("Please enter Name"));
		invoker.register(myCom);
		invoker.run();
	}

}
