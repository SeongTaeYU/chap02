package sec07;
/*
 * [모듈화]
 * - 평균 구하는 로직을 메소드로 분리함
 */

public class Arry03Parm {

	public static void main(String[] args) {
		
		int[] intArr = {80,75,90};
		
		//평균을 구해주는 메소드 호출
		double avg = getSum(intArr);	//인자로 배열을 전달 int타입 배열		retrun 받는쪽 값이 돌아오는 쪽
		 getSum1(intArr);
		//System.out.printf("avg : %.2f",avg);
		
		
	} // m e
	
	//평균을 구해주는 메소드(double : 반환 타입)
	public static double getSum(int[] arr) {// 매개변수가 배열 타입(int[] arr)변수선언
		int sum = 0;
		for(int i = 0; i< arr.length;i++) {
			 sum = sum + arr[i];
			
		}
		
		double avg = (double)sum/arr.length;
		
		System.out.printf("avg : %.2f\n",avg);

		return avg ;// 값을 반환
		
	}//getsum e
	
	public static void getSum1(int[] arr1) {
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum = 0;
			sum = sum +arr1[i];
		}
		double avg = (double)sum/arr1.length;
		System.out.printf("avg : %.2f\n",avg);
		
		
	}

}// c e
