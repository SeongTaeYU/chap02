package sec07;

import java.util.Scanner;

public class Array20LottoRandom {

	public static void main(String[] args) {
		//배열 선언
		int[] numArr = new int[6];	// 6개 공간 담는 배열 선언(공간확보 초기)
		
		//세트입력(Scanner)
		Scanner scan = new Scanner(System.in);	// System.in 1byte
		System.out.print("몇 세트의 난수를 발생시키겠습니까?");
		int set = scan.nextInt();	//정수 읽기
		
		//while
		while(set>0) {
			// 난수 발생 for문
			for (int i = 0; i < numArr.length; i++) {	// 배열 갯수 만큼 돌림  배열 자리 지정
				// 난수 1~45
				numArr[i]= (int)(Math.random()*45)+1;
				for (int j = 0; j < i; j++) {	// 변경해주는 역할		j<i;
					if(numArr[j]==numArr[i]) {	//숫자 중복 방지	자리수 값을 비교
						i = i -1;
						break;
					}
				}
			}
			
			
			//한세트 출력 (향상된 for문)
			for(int i : numArr) {
				System.out.print(i+"\t");
			}
			System.out.println("");
			set = set -1; // -1씩 차감(set--)	차감하지 않을 시 while문이 계속 돌게된다. 
			
			
		}// end for문
		
		
		scan.close();
		
	}// m e

}// c e
