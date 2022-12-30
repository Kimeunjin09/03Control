package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample { //기능 정의용 클래스
	
	public void ex1() {
		// if문
		// - 조건식이 true일 때만 내부코드 수행
		/*
		 * [작성법]
		 * if(조건식) {
		 * 		조건식이 true 일 때 수행될 코드
		 * }
		 * 
		 * if - else문
		 * - 조건식 결과가 true면 if문, flase면 else구문이 수행됨.
		 * 
		 * [작성법]
		 * if(조건식) {
		 * 		조건식이 true일 때 수행될 코드
		 * } else{
		 * 		조건식이 flase일 떄 수행될 코드
		 * }
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : "); //정수입력하라고 띄워주고
		int input = sc.nextInt(); //위에 입력한거 인풋에 저장
		
		//입력된 정수가 양수인지 검사
		if(input > 0) {
			System.out.println("양수 입니다.");
		} else {
			System.out.println("양수가 아니다.");
	   } 
		
		if(input <= 0) {
			System.out.println("양수가 아니다.");
		} 
	}
	
		public void ex2() {
		//홀짝검사
		//입력받은 값이 홀인지 짝인지 출력
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		if(input %2 == 0) {
			System.out.println("짝 입니다.");
		} else {
			System.out.println("홀 입니다.");
		} 
	}
		
	public void ex3() {
		//달(month)를 입력받아 해당 달에 맞는 계절출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("달 입력: ");
		int month = sc.nextInt();
		
		//사용자에게 온도를 받음.
		System.out.print("온도 입력: ");
		int temperature = sc.nextInt();
		
		String season; //선언(공간할당)만
		
		// 봄: 3,4,5 여름: 6,7,8 가을: 9,10,11 겨울: 12,1,2
		if(month ==3 || month == 4|| month == 5) {
			season = "봄";
		} else if(month >= 6 && month <= 8) {
			season = "여름";
			if(temperature >= 35) {
				//season = season +""
				//season = "여름" + "폭염 경보"
				season += "폭염 경보";
			} else if(temperature >= 33) {
				season += "폭염 주의보";
			}
		
		} else if(month >= 9 && month <= 11) {
			season = "가을";
		} else if(month ==12 || month == 1 || month == 2) {
			season = "겨울";
		} else {
			season = "해당하는 계절 없음";
		}
	}
	
	public void ex4() {
		//나이를 입력받아
		//13세 이하면 "어린이 입니다."
		//13세 초과 19세 이하면 : "청소년 입니다."
		//19세 초과시 : "성인 입니다." 츨력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if(age <= 13) {
			System.out.println("어린이 입니다.");	
		} else if(age > 13 && age <= 19) {
			System.out.println("청소년 입니다.");
		} else if(age > 19) {
			System.out.println("성인 입니다.");
		}
		
		/*이거말고 이거 조건문은 확실한것부터 자르는게 좋음
		if(age <= 13) {
			System.out.println("어린이 입니다.");	
		} else if(age > 19) {
			System.out.println("성인 입니다.");
		} else {
			System.out.println("청소년 입니다.");
		} */
	}
	
	public void ex5() {
		//점수(100점 만점)을 입력받아
		//90점 이상 : A
		//80점 이상 90점 미만 : B
		//70점 이상 80점 미만 : C
		//60점 이상 70점 미만 : D
		//60점 미만 : F
		//0점 미만, 100 초과 :  "잘못 입력하셨습니다."
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if(score < 0 || score > 100) {
				System.out.println("잘못 입력하셨습니다."); // 이렇게 일일이 다 시스템 선언한거 안좋은거임
			 
			} else if(score >= 80 && score < 90) {
				System.out.println("B");
			}  else if(score >= 70 && score < 80) {
				System.out.println("C");
			} else if(score >= 60 && score < 70) {
				System.out.println("D");
			}  else if(score < 60 && score > 0) {
				System.out.println("F");
			} 
		} 
		
			/*Scanner sc = new Scanner(System.in);
			System.out.print("점수 : ");
			int score = sc.nextInt();
			
			String result; // 결과를 담을 String 변수 선언, 이게 밑의 값을 담고 if문 밖에서 실행되도록하기
			
			if(score < 0 || score > 100) {
				result = "잘못 입력";
				} else if(score >= 90) {
					result = "A";
				} else if(score >= 80) {
					result = "B";
				} else if(score >= 70) {
					result = "C";
				} else if(score >= 60) {
					result = "D";
				} else {
					result = "F";
				} 		
					
				System.out.println(result);	//결과값을 초기화해줘야함		
	}*/
		
		public void ex6() {
			// 놀이기구 탑승 제한 검사 프로그램
			// 조건 - 나이: 12세 이상, 키: 140.0cm 이상
			// 나이를 0~100 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
			// 키를 0~250.0cm 사이로 입력하지 않은 걍우 : "키를 잘못 입력 하셨습니다."
			// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
			
			// 나이O  , 키X : "나이는 적절하나, 키가 적절치 않음";
			// 나이X  , 키O : "키는 적절하나, 나이가 적절치 않음";
			// 나이X  , 키X : "나이와 키 모두 적절치 않음";
			// 나이O  , 키O : "탑승 가능";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			if(age < 0 || age > 100) {
				System.out.println("나이를 잘못 입력 하셨습니다."); 
			}else {
				System.out.print("키 : ");
				double height = sc.nextDouble();
		
				if(height > 0 || height <250.0) {
					System.out.println("키를 잘못 입력 하셨습니다.");
				}else {
					if(age >= 12 && height < 140.0) {
						System.out.println("나이는 적절하나, 키가 적절치 않음");
					}else if(age < 12 || height >= 140.0) {
						System.out.println("키는 적절하나, 나이가 적절치 않음");
					}else if(age < 12 || height < 140.0) {
						System.out.println("나이와 키 모두 적절치 않음");
					}else if(age >= 12 || height > 140.0) {
						System.out.println("탑승 가능");
					}
				}
			
				/*Scanner sc = new Scanner(System.in);
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				String result; //결과 담을 변수 선언, 초기화 안 한 상태
				
				 if( age < 0 || age > 100) {
					 result = "나이 잘못 입력했어요.";
				 } else {
					System.out.print("키 : ");
					double height = sc.nextDouble();
					
					if(height > 0 || height <250.0) {
						result = "키를 잘못 입력 하셨습니다.";
					} else {
						//키를 잘 입력한 경우만 들어옴
						if(age < 12 && height >= 140.0) {
							result = "키는 적절하나, 나이가 적절치 않음";
					} else if(age >= 12 && height < 140.0) {
						result = "나이는 적절하나, 키는 적절치 않음";
					}else if(age < 12 && height < 140.0) {
						result = "나이와 키 모두 적절치 않음";
				    }else {
				    	result = "탑승 가능";
				    }
				}	
			}
				System.out.println(result); */
			}
		}
	}		
