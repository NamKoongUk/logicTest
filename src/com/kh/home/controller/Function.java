package com.kh.home.controller;

import java.util.Random;
import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);
	public void calculator() {
		System.out.print("첫번째 정수를 입력하시오 : ");
		int num = sc.nextInt();
		System.out.print("두번째 정수를 입력하시오 : ");
		int num2= sc.nextInt();
		System.out.print("연산문자를 입력하시오  : ");
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
		{System.out.println("0으로 나눌 수 없습니다.");}
		else {System.out.println(num + " / " + num2 + " = " + (max/min));}break;

		}

	}

	public void totalCalculator() {
		System.out.print("첫번째 정수를 입력하시오 : ");
		int num=sc.nextInt();
		System.out.print("두번째 정수를 입력하시오 : ");
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
		System.out.println(min + " ~ " + max + "까지 정수의 합 : " +sum);
	}

	public void profile() {
		String name = "남궁욱";
		int age = 26;
		String gender = "남자";
		String personality = "고집불통";

		System.out.printf(" 이름 : %s\n 나이 : %d 세\n 성별 : %s\n 성격 : %s\n",name,age,gender,personality);
	}

	public void sungjuk() {


		System.out.print("이름을 입력하시오 : ");
		String name = sc.nextLine();
		System.out.print("학년을 입력하시오 : ");
		int grade = sc.nextInt();
		System.out.print("반을 입력하시오 : ");
		int classroom = sc.nextInt();
		System.out.print("번호를 입력하시오 : ");
		int number = sc.nextInt();
		System.out.print("성별을 입력하시오 : ");
		String gender = sc.next();
		System.out.print("성적을 입력하시오 : ");
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
			System.out.printf("%d학년 %d반 %d번 여학생 %s의 점수는 %.1f이고 %c 학점입니다.\n", grade,classroom,number,name,score,total);
		}else {
			System.out.printf("%d학년 %d반 %d번 남학생 %s의 점수는 %.1f이고 %c 학점입니다.\n", grade,classroom,number,name,score,total);
		}


	}

	public void printStarNumber() {
		System.out.print("정수를 입력하세요 : ");
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
			System.out.println("양수가 아닙니다.");
		}
	}
	public void sumRandomNumber() {
		int random = (int)(Math.random()*100)+1;
		int sum=0;
		for(int i=1; i<=random; i++) {
			sum+=i;
		}
		System.out.printf("1부터 랜덤수 %d까지의 합계 : %d \n",random,sum);
	}

	public void continueGugudan() {

		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();

		if(num>0) {
			for(int i=1; i <= 9; i++) {
				if(i%num==0) {
					continue;
				}
				System.out.println(num + " * " + i + " = " + (num*i));
			}
		}else if(num<0) {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void shutNumber() {
		
		int random = new Random().nextInt(6)+1;
		int random2 = new Random().nextInt(6)+1;
		
		do {
			System.out.print("정수를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num != random+random2) {
				System.out.println("틀렸습니다");
			}else {
				System.out.println("맞췄습니다");
			}
			System.out.print("계속하시겠습니까?(y/n): ");
			char ch = sc.next().charAt(0);
			
			if(ch =='n' || ch=='N') {
				break;
			}
			
			
		}while(true);
		
	}

}