package s0403;

import java.util.Scanner;

public class 조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		System.out.println("수입력:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		switch(a%3) {
		case 0:
			System.out.println(a+"는 3의 배수");
			break;
		default:
			System.out.println(a+"는 3의 배수가 아니다");
		}
		
	}

}
