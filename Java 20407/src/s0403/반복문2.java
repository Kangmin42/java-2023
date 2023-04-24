package s0403;

public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
				System.out.println(j+"\t");
			System.out.println();
		}
		System.out.println("예제 28ㅡㅡ");
		for(int i=1; i<5; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print(j+"\n");
			System.out.println();
			
		}
		System.out.println("예제 29ㅡㅡ");
		for(int i=0; i<3; i++)
		{
			for(int j=3; j<=i; j++)
				System.out.print(j+"\n");
			System.out.println();
			
		}
	}

}