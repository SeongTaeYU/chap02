package sec06;
import java.util.Scanner;

public class Ex5_2 {
	String eks; // X 저장할 문자열 변수
	private static final int EXIT = 0; // 종료
	private static final int TRIANGLE1 = 1; // 삼각형1
	private static final int TRIANGLE2 = 2; // 삼각형2
	private static final int PYRAMID = 3; // 피라미드
	private static final int DIAMOND = 4; // 다이아몬드

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println(" 1. 삼각형1");
		System.out.println(" 2. 삼각형2");
		System.out.println(" 3. 피라미드");
		System.out.println(" 4. 다이아몬드");
		System.out.println(" 0. 종료");
		System.out.print(">> ");
		int menu = s.nextInt(); // 메뉴 선택 변수

		System.out.println(" 출력할 최대값을 입력하십시오.");
		System.out.print(">> ");
		int max = s.nextInt(); // 최대치 변수

		switch (menu) {
		case TRIANGLE1:
			Ex5_2.eksTriangle1(max); // Ex5_2. 를 (클래스명) 을 생략할 수 있다. 
			break;
		case TRIANGLE2:
			Ex5_2.eksTriangle2(max);
			break;
		case PYRAMID:
			Ex5_2.pyramid(max);
			break;
		case DIAMOND:
			Ex5_2.diamond(max);
			break;
		case EXIT:
			System.exit(0); // 프로그램 종료
		}

	}

	public static void eksTriangle1(int max) {
		String eks = "";
		for (int i = 0; i < max; i++) {
			eks += "X";
			System.out.println(eks);
		}
	}

	public static void eksTriangle2(int max) {
		String eks = "";
		for (int i = 0; i < max; i++) {
			eks += "X";
			for (int j = 0; j < max - i; j++) {
				System.out.print(" ");
			}
			System.out.println(eks);
		}
	}

	public static void pyramid(int max) {
		String eks = "X";
		int count = 1;
		for (int i = 0; i < max; i++) {
			System.out.print((count++) + " : \t");
			for (int j = 0; j < max - i; j++) {
				System.out.print(" ");
			}
			System.out.println(eks);
			eks += "XX";
		}
	}

	public static void diamond(int max) {
		String eks = "X";
		int count = 1;

		if (max % 2 == 1) {
			for (int i = 0; i <= max; i++) {
				System.out.print((count++) + " : \t");
				for (int j = 0; j <= max - i; j++) {
					System.out.print(" ");
				}
				System.out.println(eks);
				eks += "XX";
			}
			for (int i = max; i > 0; i--) {
				System.out.print((count++) + " : \t");
				for (int j = max + 1 - i; j >= 0; j--) {
					System.out.print(" ");
				}
				for (int k = (i * 2) - 1; k > 0; k--) {
					System.out.print("X");
				}
				System.out.println();
			}
		} else {
			System.out.println("홀수만 입력하십시오.");
			System.exit(0);
		}
	}
}