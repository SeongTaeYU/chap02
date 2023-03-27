/*
 * [문] 키보드에서 두 숫자를 받아서 값을 비교하시오
 */
package sec04;

import java.util.Scanner;

public class IfModule {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	//read : 1byte씩 영문자만 읽어올수있음 , in : 2byte씩 읽어올수있다.

		System.out.print("a 값 입력 : ");
		int a = scanner.nextInt();

		System.out.print("b 값 입력 : ");
		int b = scanner.nextInt();
		
		compareTwoNumber(a,b);// 변수명 (파라미터명)이 달라도 상관없음, 인자 값을 던져준다.
		
		
		if(a>b) {
			System.out.println("a는 b보다 크다.");
		}else if(a < b) {
			System.out.println("a는 b보다 작다.");
		}else {
			System.out.println("a와 b는 같다.");
		}
		
		System.out.println((a>b) ? "a가 b보다 크다." : "b가 a보다 크다."); 
		
		//자원 닫기
		scanner.close();
	} // m e
	/*
	 *  두수를 비교해주는 함수
	 *  @param a
	 *  @param b
	 */
	private static void compareTwoNumber(int a, int b) {// 파라미터명이 달라도 상관없음 , 변수 선언, 지역변수, 던져주는 값을 받음
		if(a>b) {
			System.out.println("첫 번째 숫자가 큽니다.");
		}else if(a <b ) {
			System.out.println("두 번째 숫자가 큽니다.");
		}else {
			System.out.println("두 수가 같습니다.");
		}
	}
} // c s
