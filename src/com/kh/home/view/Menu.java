package com.kh.home.view;
import java.util.Scanner;

import com.kh.home.controller.*;
public class Menu {
static Scanner sc = new Scanner(System.in);
	public static void displayMenu() {
		label:
		do {
			System.out.println("1. ���� ����");
			System.out.println("2. ���������� ū������ �հ豸�ϱ�");
			System.out.println("3. �Ż����� Ȯ���ϱ�");
			System.out.println("4. �л����� Ȯ���ϱ�");
			System.out.println("5. ���� ���� ����ϱ�");
			System.out.println("6. ���������� �հ� ���ϱ�");
			System.out.println("7. ������");			
			System.out.println("8. �ֻ��� ���� �˾Ƹ��߱� ����");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ �Է� : ");
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
