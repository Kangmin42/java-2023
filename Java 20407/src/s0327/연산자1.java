package s0327;

import java.util.Scanner;

public class 연산자1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("숫자입력:");
		i=sc.nextInt();
		if(i%2==0)
			System.out.println(i+"는 짝수입니다.");
		else
			System.out.println(i+"는 홀수입니다.");

	}

}
