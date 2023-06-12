package s0612;

public class CafeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cafe c=new Cafe();
		c.makeTea(5);
		c.makeTea(2, 4);
		c.makeTea(4, 5, 10);
		c.printCount();
		
		Cafe c2=new Cafe();
		c2.makeTea(1);
		c2.makeTea(1, 2);
		c2.makeTea(2, 2, 7);
		c2.printCount();
	}

}
