package String과제;

public class replace {

	public static void main(String[] args) {
		String oldWord = "자바 문자열 리플레이스 테스트입니다. 리플레이스 문자열 테스트 입니다.";
		String newWord = oldWord.replace("리플레이스","replace");
		
		System.out.println(oldWord);
		System.out.println(newWord);
	}

}
