package s0313;

import java.util.Scanner;

public class 입출력3 {

	public static void main(String[] args) {
		
				int num1,num2,num3;
				int sum;
				double avg;
				Scanner s=new Scanner(System.in);
				System.out.println("첫번째 수:");
				num1=s.nextInt();
				System.out.println("두번째 수:");
				num2=s.nextInt();
				System.out.println("세번째 수:");
				num3=s.nextInt();
				sum= num1+num2+num3;
				avg=sum/3;
				System.out.println("합계:"+sum);
				System.out.println("평균:"+avg);
				
		
	}

}
