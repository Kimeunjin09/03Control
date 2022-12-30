package edu.kh.control.condition;


import java.util.Scanner;

public class SwitchExample {
	
	/*
	 * switch문
	 * - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문.
	 * -> 식의 결과로 얻은 값과 같은 case구문이 실행된다.
	 * 
	 * [작성법]
	 * 
	 * switch(식) {
	 * 
	 * case 결과값1 : 수행코드1; break;
	 * case 결과값2 : 수행코드2; break;
	 * case 결과값3 : 수행코드3; break; 
	 * ... (몇개까지 있을지 모르니까)
	 * default : case를 모두 만족하지 않을 경우 수행하는 코드 (== else)
	 * 
	 * }
	 * 
	 * 
	 * */
	
	  public void ex1() {
		//키보드로 정수를 입력 받아
		//1이면 "빨간색"
		//1이면 "주황색"
		//1이면 "노란색"
		//1이면 "초록색"
	    //1~4의 숫자가 아니면 "흰색" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력: " );
		int input = sc.nextInt();
		
		String result;
		
		switch(input) {
		
		case 1 : result = "빨강"; break;
		case 2 : result = "주황"; break;
		case 3 : result = "노랑"; break;
		case 4 : result = "초록"; break;
		default: result = "흰색";
		
		}
		
		System.out.println(result);
		
	} 
		
	/*public void ex2() {
		//달 입력 시 계절 완성 (switch 버전)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력: ");
		int month = sc.nextInt();
		
		String result;
		
		switch(month) {
		case3: case4: case5: result = "봄"; break;
		case6: case7: case8: result = "여름"; break;
		case9: case10: case11: result = "가을"; break;
		case12: case1: case2: result = "겨울"; break;
		default : result = "잘못 입력";
		}
		
		System.out.println(result);
	} */
	
	
	
	/*public void ex3() {
		
		// 연산자 ( + - * / % ) -> String으로 받기
		// 정수 1: 5
		// 정수 2: 10
		// 연산자 : * 
		// 계산결과 : 5 * 10 = 50
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2: ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자: ");
		String op = sc.next();
		
		String result;
		
		switch(op) {
		case "+" : result = System.print.out( "%d" + %d + %d\n , num1, num2, num1 + num2();
		break;
		case "/" :
			if(num2 == 0) {
				 System.printf( %d / %d = %d\n)
				
			}
		} 
		
		
		
	} */
		
	}
