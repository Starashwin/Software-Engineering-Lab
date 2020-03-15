
public class Main {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		MyCom myCom = new MyCom();
		myCom.set_name("My Com");
		invoker.register(myCom);
		invoker.run();
	}

}
