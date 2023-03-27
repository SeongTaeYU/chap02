package sec07;
/*
 * 다음은 서울의 월별 평균기온이다.
 * 연평균 기온을 구하세요.
 */
public class Array17SeoulTemp {

	public static void main(String[] args) {
		float[]	monTemp = new float[] { -2.5f, -0.2f, 5.2f, 12.1f, 17.4f, 21.9f, 24.9f, 29.4f, 27.8f, 14.4f, 6.9f,
            0.2f };
		
		float sum = 0.0f;
		double avg = 0.0;
		
		for (int i = 0; i < monTemp.length; i++) {
			sum += monTemp[i];
			
			
		}System.out.println("기온 총합 : "+sum);
		avg = sum / monTemp.length;
		System.out.printf("기온 평균 : %.2ff \n",avg);
		
		float hot =  0.0f;
//가장 더운 달 찾기

		for(float Te:monTemp) {
			if (Te > hot) {
				hot = Te;
			}
		}System.out.println("가장 더운 달의 온도는 : "+hot+"f");
		
		hot = 0.0f;
		for (int i = 0; i < monTemp.length; i++) {
			if(monTemp[i]>hot)
				hot = monTemp[i];
		}
		System.out.println("가장 더운 온도 : "+hot+"f");
		
		
		
	}

}
