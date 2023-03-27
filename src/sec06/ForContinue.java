package sec06;

public class ForContinue {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				continue; // 다시 for문으로 돌아감
				// System.out.println(i + " ");
			}
			System.out.println(i + " ");
		}

	}

}
