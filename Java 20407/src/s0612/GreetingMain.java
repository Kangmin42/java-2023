package s0612;

public class GreetingMain extends Greeting{
	public String name="Lee Myung Park";
	public void sayHello() {
		System.out.println(name+"hello");
	}
	public void sayGreeting() {
		super.sayHello();
	}

	public static void main(String[] args) {
		GreetingMain eng=new GreetingMain();
		eng.sayHello();
		eng.sayGreeting();
	}
}

