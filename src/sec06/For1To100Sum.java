package sec06;

public class For1To100Sum {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		//for (int i = 1; i <=100; i++) {
			for (i = 1; i <=100; i++) {	// i++ 증가되어 101이된다.
			//sum = sum+i;
			sum += i;
			//System.out.println("1~100 합 : "+sum);
		}
		System.out.println("1~" + (i-1) + "합 : "+sum);	// i-1을 해야된다.
	}

}
