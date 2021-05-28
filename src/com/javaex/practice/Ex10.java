package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int n01=sc.nextInt();
		System.out.print("숫자: ");
		int n02=sc.nextInt();
		System.out.print("숫자: ");
		int n03=sc.nextInt();
		System.out.print("숫자: ");
		int n04=sc.nextInt();
		System.out.print("숫자: ");
		int n05=sc.nextInt();
		
		int i = 0;
		
		while(true) {
			if(i>n01 && i>n02 && i>n03 && i>n04 && i>n05) {
				--i;
				System.out.println("최대값은 "+i+"입니다.");
				System.out.println("에....보자.. 수학 학원이 어디있더라?");
				break;
			}else {
				i++;
			}
		}
		
			
		sc.close();

	}

}
