package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int cash=0;
		boolean flag01 = true;
		
		while(flag01) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택>");
			int num = sc.nextInt();
			switch(num) {
				case 1:
					System.out.print("예금액>");
					num = sc.nextInt();
					cash += num;
					System.out.println("");
					break;
				case 2:
					System.out.print("출금액>");
					num = sc.nextInt();
					cash -= num;
					System.out.println("");
					break;
				case 3:
					System.out.println("잔고액>"+cash);
					System.out.println("");
					break;
				case 4:
					System.out.println("프로그램 종료");
					flag01 = false;
					break;
				default:
					System.out.println("다시 입력해주세요");
					System.out.println("");
					break;
			}
			
		}
		
		sc.close();

	}

}
