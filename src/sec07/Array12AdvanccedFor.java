package sec07;

public class Array12AdvanccedFor {

	public static void main(String[] args) {
		//배열변수 선언과 배열 생성
		int[] scores = {95,71,84,93,87};
		
		//배열 항목 전체 합 구하기
		int sum = 0;
		for (int score : scores) {	//향상된 for문  AdvancedFor문, 배열에서 값을 하나씩 갖고오겠다. int타입으로 선언
			//sum = sum+score;
			sum += score;
		}
		System.out.println("점수 총합 = "+sum);
		
		
		// 배열 항목 전체 평균 구하기
		double avg = (double)sum/scores.length;
		System.out.println("점수 평균 = "+avg);
	}

}
