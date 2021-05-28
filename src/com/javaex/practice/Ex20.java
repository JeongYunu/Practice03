package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			
		boolean game = true;
		boolean game1 = true;
		int an = 50;
		while(game) {
			System.out.println("=========================");
			System.out.println("[숫자맞추기게임 시작");
			System.out.println("=========================");
			game1 = true;
			while(game1) {
				System.out.print(">>");
				int num = sc.nextInt();
				sc.nextLine();
				
				if(num>an) {
					System.out.println("더 낮게");
				}else if(num<an) {
					System.out.println("더 높게");
				}else if(num==an) {
					System.out.println("맞았습니다.");
					System.out.print("게임을 종료하시겠습니까?(y/n) >>");
					String yes = sc.nextLine();
					switch(yes) {
						case "y": 
							System.out.println("=========================");
							System.out.println("[숫자맞추기게임 종료]");
							System.out.println("=========================");
							game = false;
							game1 = false;
							break;		
						default:
							game1 = false;
							break;							
					}
					
				}
				
			}
		}
			
		sc.close();
		
	

	}

}
