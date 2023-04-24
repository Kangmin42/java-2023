package s0403;

import java.util.Scanner;

public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		int sum=0;
		System.out.println("N입력:");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		for(int i=1; i<=N; i++)
			if(i%2==0){
				sum=sum-i;
				System.out.print("-"+i);
			}else {
				sum=sum+i;
				System.out.print("+"+i);
			}
		System.out.println("="+sum);
	}

}
