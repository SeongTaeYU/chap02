package sec06;

public class While1To10Print {

	public static void main(String[] args) {

		int i = 0;
		/*
		while (i <= 10) {
			i++;
			System.out.println((i-1) + " ");
		}
*/
		while (true) {
			i++;
			
			//System.out.println(i);
			if (i > 10) {
				break;
			}System.out.println(i + " ");
		}

	}//m e

}//m s
