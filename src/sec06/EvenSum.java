package sec06;

public class EvenSum {

	public static void main(String[] args) {
		int sum = 0;
		int sum2 = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
			if (i % 3 == 0) {
				sum2 += i;
			}
		}
		System.out.println("1~10까지 2의배수 합 : " + sum);
		System.out.println("1~10까지 3의배수 합 : " + sum2);

		/*
		 * int sum1 = 0; for (int i = 1; i <=10; i++) { if(i%3==0) { sum1 += i; }
		 * 
		 * } System.out.println("1~10까지 3의배수 합 : "+sum1);
		 */

	}

}
