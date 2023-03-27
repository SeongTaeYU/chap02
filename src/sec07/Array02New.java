package sec07;

public class Array02New {

	public static void main(String[] args) {
		//합계변수
		int sum = 0;
		// 배열 변수를 선언과 동시에 초기화함
		int intArr[] = {80, 75, 90};
		// 이런 형태로 초기화 할수도 있음
		intArr[0] = 80;
		intArr[1] = 75;
		intArr[2] = 90;
		for (int i = 0; i < intArr.length; i++) { // intArr.length 배열 길이, <= 하게되면 3과 같다라고 하기 때문에 오류 발생
			sum = sum + intArr[i];
			System.out.println(intArr[i]);
			
		}


		double avg = (double)sum / intArr.length;
		System.out.printf("avg : %.2f",avg);
	}

}
