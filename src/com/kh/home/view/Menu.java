package com.kh.home.view;
import java.util.Scanner;

import com.kh.home.controller.*;
public class Menu {
static Scanner sc = new Scanner(System.in);
	public static void displayMenu() {
		label:
		do {
			System.out.println("1. 간단 계산기");
			System.out.println("2. 작은수에서 큰수까지 합계구하기");
			System.out.println("3. 신상정보 확인하기");
			System.out.println("4. 학생정보 확인하기");
			System.out.println("5. 별과 숫자 출력하기");
			System.out.println("6. 난수까지의 합계 구하기");
			System.out.println("7. 구구단");			
			System.out.println("8. 주사위 숫자 알아맞추기 게임");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 입력 : ");
			int num = sc.nextInt();
			switch(num){
				
			case 1 : new Function().calculator();break;
			case 2 : new Function().totalCalculator();break;
			case 3 : new Function().profile();break;
			case 4 : new Function().sungjuk();break;
			case 5 : new Function().printStarNumber();break;
			case 6 : new Function().sumRandomNumber();break;
			case 7 : new Function().continueGugudan();break;
			case 8 : new Function().shutNumber();break;
			case 9 :  break label;
			}
			
			
		}while(true);
	}
}
