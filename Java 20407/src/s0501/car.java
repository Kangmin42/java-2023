package s0501;

public class car {

	
		//속성
		String owner;
		String color;
		int speed;
		int km;
		static int count;
		//생성자
		car(){
			
		}
		car(String name){
			owner=name;
			count++;
			System.out.println("총차의 대수:"+count);
		}
		car(String name,String col,int speed){
			owner=name;
			color=col;
			this.speed=speed;
		}
		//메소드
		void run() {
			km=km+10;
		}
		void stop() {
			speed=0;
			System.out.println(owner+"의 차는"+km+"를 달렸습니다.");
		}
		void speedup() {
			speed+=5;
			System.out.println(owner+"의 차의 현재속도는"+speed+"입니다.");
			km+=2;
			System.out.println(owner+"의 차의 주행거리는"+km+"달렸습니다.");
		}
		void speeddown() {
			speed-=5;
			System.out.println(owner+"의 차의 현재속도는"+speed+"입니다.");
			km-=2;
			System.out.println(owner+"의 차의 주행거리는"+km+"달렸습니다.");
		}
		void printcarinfo() {
			System.out.println("소유자:"+owner);
			System.out.println("색상:"+color);
			System.out.println("속도:"+speed);
			System.out.println("거리:"+km);
		}
		

}
