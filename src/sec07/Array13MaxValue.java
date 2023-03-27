package sec07;

import sec04.CompareTwoNumber;

/*
 * 최대값 찾기
 *  - 출력결과 : 제일 큰수는 : 50
 */

public class Array13MaxValue {

	public static void main(String[] args) {
		//1.배열 사용전
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		int score = 0;
		/*
		if(a>score) {
			score = a;
			System.out.println(score+"는 a보다 작습니다.");
		}if(b >score) {
			score = b;
			System.out.println(score+"는 b보다 작습니다.");
		}if(c > score) {
			score = c;
			System.out.println(score+"는 c보다 작습니다.");
		}if(d > score) {
			score = d;
			System.out.println(score+"는 d보다 작습니다.");
		}if(e > score) {
			score = e;
			System.out.println(score+"는 e보다 작습니다.");
		}else {
			System.out.println(score+"크기가 더 큽니다.");
		}
*/
		if(a > score)
			score =a ;
		if(b > score)
			score =b ;
		if(c > score)
			score =c ;
		if(d > score)
			score =d ;
		if(e > score)
			score =e ;
		System.out.println("제일 큰 수는 : "+score);
		
		// 배열 사용
		 int max = 0;	// max 초기화
		 //int[] Array = {10,20,30,40,50};

		 int[] arr = new int[5];
		 arr[0] = 10;
		 arr[1] = 20;
		 arr[2] = 30;
		 arr[3] = 40;
		 arr[4] = 50;
		 
		 for (int ar: arr ) {
			if(ar>max) {
				max = ar;
			}
		}
		 System.out.println("향상된 for문 제일 큰수는 : " +max);
		 
		max = 0;
		 
		 for (int i = 0; i < arr.length; i++) {
			 if (arr[i]>max)
				 max = arr[i];

			}
		 System.out.println("제일 큰수는[배열사용] : "+max);
		
		 
	}// m e

}// c e
