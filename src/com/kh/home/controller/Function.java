package com.kh.home.controller;

import java.util.Random;
import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);
	public void calculator() {
		System.out.print("ù��° ������ �Է��Ͻÿ� : ");
		int num = sc.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ� : ");
		int num2= sc.nextInt();
		System.out.print("���깮�ڸ� �Է��Ͻÿ�  : ");
		char ch = sc.next().charAt(0);
		int max=0;
		int min=0;
		if(num>num2) {
			max=num;
			min=num2;
		}else if(num<num2){
			max=num2;
			min=num;
		}
		switch(ch) {						

		case '+' : System.out.println(num + " + " + num2 + " = " + (max+min));break;
		case '-' : System.out.println(num + " - " + num2 + " = " + (max-min));break;
		case 'x' : System.out.println(num + " * " + num2 + " = " + (max*min));break;
		case 'X' : System.out.println(num + " * " + num2 + " = " + (max*min));break;
		case '/' : if(min==0)
		{System.out.println("0���� ���� �� �����ϴ�.");}
		else {System.out.println(num + " / " + num2 + " = " + (max/min));}break;

		}

	}

	public void totalCalculator() {
		System.out.print("ù��° ������ �Է��Ͻÿ� : ");
		int num=sc.nextInt();
		System.out.print("�ι�° ������ �Է��Ͻÿ� : ");
		int num2=sc.nextInt();
		int max=0;
		int min=0;
		int sum=0;
		if(num>num2) {
			max=num;
			min=num2;
		}else if(num<num2){
			max=num2;
			min=num;
		}

		for(int i=min; i<=max; i++) {
			sum+=i;
			if(i!=max) {
				System.out.print(i + "+");
			}else if(i==max){
				System.out.println(i + "=" + sum);
			}			
		}
		System.out.println(min + " ~ " + max + "���� ������ �� : " +sum);
	}

	public void profile() {
		String name = "���ÿ�";
		int age = 26;
		String gender = "����";
		String personality = "��������";

		System.out.printf(" �̸� : %s\n ���� : %d ��\n ���� : %s\n ���� : %s\n",name,age,gender,personality);
	}

	public void sungjuk() {


		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String name = sc.nextLine();
		System.out.print("�г��� �Է��Ͻÿ� : ");
		int grade = sc.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		int classroom = sc.nextInt();
		System.out.print("��ȣ�� �Է��Ͻÿ� : ");
		int number = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ� : ");
		String gender = sc.next();
		System.out.print("������ �Է��Ͻÿ� : ");
		double score = sc.nextDouble();

		char gender2 = gender.charAt(0);
		char total =' ';

		if(score >= 90) {
			total = 'A';
		}else if(score >=80) {
			total = 'B';
		}else if(score >= 70) {
			total='C';
		}else if(score >= 60) {
			total='D';
		}else {
			total ='F';
		}

		if(gender2 == 'F' || gender2=='f') {
			System.out.printf("%d�г� %d�� %d�� ���л� %s�� ������ %.1f�̰� %c �����Դϴ�.\n", grade,classroom,number,name,score,total);
		}else {
			System.out.printf("%d�г� %d�� %d�� ���л� %s�� ������ %.1f�̰� %c �����Դϴ�.\n", grade,classroom,number,name,score,total);
		}


	}

	public void printStarNumber() {
		System.out.print("������ �Է��ϼ��� : ");
		int row = sc.nextInt();

		if(row>0) {
			for(int i=1; i<=row; i++) {
				for(int j=1; j<= i; j++) {
					if(i==j) {
						System.out.print(i);
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}else if(row <0){
			System.out.println("����� �ƴմϴ�.");
		}
	}
	public void sumRandomNumber() {
		int random = (int)(Math.random()*100)+1;
		int sum=0;
		for(int i=1; i<=random; i++) {
			sum+=i;
		}
		System.out.printf("1���� ������ %d������ �հ� : %d \n",random,sum);
	}

	public void continueGugudan() {

		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();

		if(num>0) {
			for(int i=1; i <= 9; i++) {
				if(i%num==0) {
					continue;
				}
				System.out.println(num + " * " + i + " = " + (num*i));
			}
		}else if(num<0) {
			System.out.println("����� �ƴմϴ�.");
		}
	}
	
	public void shutNumber() {
		
		int random = new Random().nextInt(6)+1;
		int random2 = new Random().nextInt(6)+1;
		
		do {
			System.out.print("������ �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if(num != random+random2) {
				System.out.println("Ʋ�Ƚ��ϴ�");
			}else {
				System.out.println("������ϴ�");
			}
			System.out.print("����Ͻðڽ��ϱ�?(y/n): ");
			char ch = sc.next().charAt(0);
			
			if(ch =='n' || ch=='N') {
				break;
			}
			
			
		}while(true);
		
	}

}