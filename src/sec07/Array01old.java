package sec07;
/*
 * 세과목 평균 소수 두째자리 까지 구해라
 */

public class Array01old {

	public static void main(String[] args) {
		int a = 80;
		int b = 75;
		int c = 90;
		
		int sum = 0;
		/*
		sum = a + b + c;
		System.out.println("세 과목 총점 : "+sum);
		int avg;
		avg = sum/3;
		System.out.println("세과목 평균 : "+sum);
		*/
		int[] score = {80,75,90};
		for (int i = 0; i <3; i++) {
			sum += score[i];
	
		}
		System.out.println("총점 : "+sum);
		double avg = sum /3.0;   // 자동으로 int -> double 형변환 된다.
		//double avg = (double)sum/3;
		System.out.println("평균 : "+avg);
		System.out.printf("평균 : %.2f",avg);	//%s는 다 받아들일수 있다.
		System.out.printf("평균 : "+Math.round(avg*100)/100.0);
		//round()함수 리턴되는 datatype에 따라 입력값에 가장 가까운  long이나 int값을 반환
		// 8166 -> 8167
		System.out.println();
		System.out.println(String.format("평균 : %.2f", avg));
	}

}
