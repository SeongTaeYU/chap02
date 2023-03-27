package String과제;

public class contains {

	public static void main(String[] args) {
		
		String test = "Sring Contains Test";
		
		System.out.println(test.contains("String"));
		System.out.println(test.contains("Contains"));
		System.out.println(test.contains(" Test"));
		System.out.println(test.contains("my"));
		System.out.println(test.contains("Test "));

		boolean result = test.contains("Contains Test");
		if(result) {
			System.out.println("String Contains Test [성공] 입니다.");
		}else {
			System.out.println("String Contains Test [성공] 입니다.");
		}
	}

}
