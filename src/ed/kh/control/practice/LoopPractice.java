package ed.kh.control.practice;

import java.util.Scanner;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	private int row;
	
	public void practice9(){
		
		System.out.println("정수 입력: ");
		int input = sc.nextInt();
		           // 1) 1 <= 4
		
		for(int col = 1; col <= input; col++) {
			
			// 1) 1 <= 4 -2
			// 2) 2 <= 4 -2
			// 3) 3 <= 4 -2
			// 4) 4 <= 4 -2
			
			if(col <= input - row) {
				System.out.print(" ");
			} else {
				System.out.print("*");
			}
		}
		
		System.out.println();
	}
	
	public void practice11() {
		
		System.out.println("정수 입력: ");
		int input = sc.nextInt();
		
		for(int row = 1; row <= input; row++) {
			for(int col = 1; col <= input * 2 -1; col++) {
				// 마지막 줄의 별  갯수 : input에 2를 곱한값의 -1
					//    row  col ||       row   col 
					// 4 - 1 >= 1  ||  4 + 1 <= 1  true
					// 4 - 1 >= 2  ||  4 + 1 <= 2  true
					// 4 - 1 >= 3  ||  4 + 1 <= 3  true
				    // 4 - 1 >= 4  ||  4 + 1 <= 4  false
				if( input - row >= col || input + row <= col) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
		}
	}
	
	public void practice12(){
		
		System.out.println("정수 입력: ");
		int input = sc.nextInt();
		
		for(int row= 1; row <= input; row++) { //가로
			for(int col = 1; col <= input; col++) { //세로
				
				//첫번째/ 마지막줄,칸일때만 * 출력
				//입력한 인풋의 길이만큼 행열 길이 지정
				if(row == 1 || input == row || col == 1 || col == input) {
					// 별이 찍히는 경우
				} else {
					System.out.print("*");
				}
			}
		}
	}
	
	public void practice13() {
		// 조건1) 2의 배수 또는 3의 배수인 경우 출력
		// => 2나 3으로 나누었을 때 나머지값이 0인경우
		// 조건2) 2와 3의 공배수
		// => 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다.6, 12
		
		System.out.print("자연수 입력 : ");
		int input = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= input; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if(i %2 == 0 && i % 3 == 0) {
					count++;
				}
			}
		}
		
		System.out.println("\ncount: " + count);
	}
}
