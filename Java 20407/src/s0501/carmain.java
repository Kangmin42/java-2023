package s0501;

public class carmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car mycar=new car();
		car yourcar=new car("jj","blue",100);
		mycar.owner="ff";
		mycar.km=0;
		mycar.speed=0;
		mycar.color="pink";
		mycar.printcarinfo();
		mycar.run();
		mycar.run();
		mycar.run();
		mycar.speedup();
		mycar.speedup();
		mycar.speedup();
		mycar.stop();
		
		yourcar.color="black";
		yourcar.owner="jj";
		yourcar.km=0;
		yourcar.speed=0;
		yourcar.printcarinfo();

	}

}
