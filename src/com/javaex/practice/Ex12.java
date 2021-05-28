package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		sc.close();
		
		int a;
		int sum = 1;
		
		if(num%2==0) {
			a = 1;
		}else {
			a = 0;
		}
		
		for(a+=1; a<=num; a++) {
			sum *= a;
		}
		System.out.println("결과값: "+sum);
			
		

	}

}
