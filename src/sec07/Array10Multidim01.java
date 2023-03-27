package sec07;

public class Array10Multidim01 {

	public static void main(String[] args) {
		//가 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		
		int[][] mathScores = new int[2][3];
						
		//배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		//전체 학생의 수학 평균 구하기
		int totalStuduent = 0;
		int totalMathSum = 0;
		for (int  i= 0; i < mathScores.length; i++) {
			totalStuduent +=mathScores[i].length;
			for (int j = 0; j < mathScores[i].length; j++) {
				totalMathSum += mathScores[i][j];
			}
			
		}
		double totalMathAvg =(double)totalMathSum /totalStuduent;
		System.out.println("전체 학생의 수학 평균 점수 : "+totalMathAvg);
		System.out.println();
		
		int count = 0;
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.print(mathScores[i][j]+" ");
				if(mathScores[i][j]>=90) {
					count++;
					
				}
			}
			System.out.println();
		} 
		
		System.out.println(count);
		

	}// m e

}// c e
