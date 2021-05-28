package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int j, i;
		boolean a = true;

		while(a) {
			for(i=1; i<=num; i++) {
				for(j=num; j>=i; j--) {
					System.out.print("*");
				}
				System.out.println("");
				if(i==num) {
					for(i=2; i<=num; i++) {
						for(j=1; j<=i; j++) {
							System.out.print("*");
						}
						System.out.println("");
					}
					a = false;
				}
			}
		}
		
		
		
		
		sc.close();

	}

}
