package sec07;
/*
 * 학생들의 성적을 저장하기 위해서 두개의 배열이 필요함
 *  - 이름은 String [] 배열
 *  - 성적은 int[] 배열
 */
public class Array19Module {

	public static void main(String[] args) {

	
		// array
		String[] names = {"최태원", "이경선", "배준섭", "홍원표", "김성현", "우상현", "심미안"};
		int[] scores = new int[] { 87, 95, 100, 65, 70, 84, 69 };
		
		int sum = 0;		//총점
		double avg = 0.0;	//평균
		
		// 총점구함
		sum = sum(scores);	// int타입 배열 보내는 애

		// 평균 구함

		avg =(sum*1.0)/scores.length;
		System.out.printf("평균 점수는 \"%4.1f점\"\n",avg);	// %4.1f -> 4자리까지 찍겠다.소수점 첫째자리까지 "081.4

		//avg = (double)sum / scores.length;
		//avg = avg(scores);
		
		
		// 최고 점수 
		maxScore(names,scores);	//주소가 넘어간다. 값이 넘어가는것이 아님
		
	} // m e
	
//	private static double avg(int[] scores) {
//		int avg=0;
//		avg =(sum*1.0)/scores.length;
//		System.out.printf("평균 점수는 \"%3.1f점\"\n",avg);
//		
//		return avg;
//	}

	public static void maxScore(String[] names, int[] scores) {	//배열타입 선언 동일한 타입으로 선언할것  String[] names, int[] scores
		int max = 0;			//큰수 임시 저장 변수
		String maxName = "";	// 최고 점수의 학생 저장 변수
		
		//최고 점수와 최고 점수 학생명 구함
		for(int i = 0; i < scores.length; i++) {
			if(scores[i]>max) {//임의의 수와 모든 요소를 비교해가면서 큰수 찾기
				max = scores[i];
				maxName = names[i];
			}
		}
		
		System.out.printf("최고점은 \"%2d점 \"입니다.\n",max);
		System.out.println("최고성적은 " +maxName+ "님 입니다.");
	}

	public static int sum(int[] scores) {	//반환 타입이 int형	받는 애 //main method에 보낸다.
		int sum = 0;
		for(int i =0; i <scores.length;i++) {
			sum += scores[i];
		}
		return sum;
	} // sum method e



	
	
} // c e
