package sec06;

public class GuguDan {//이중 for문

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) { // 2단 ~9단
			System.out.println("[" + i + "]단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));

			}
		}
	}

}
