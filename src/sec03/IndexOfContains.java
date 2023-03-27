package sec03;
/*
 * index()메소드 : 문자열에서 특정 문자열의 위치를 찾고자 할 때 사용
 				 주어진 문자열이 시작되는 인덱스를 리턴
   contains() 메소드 : 주어진 문자열이 단순히 포함되어 있는지만 조사
   					원하는 문자열이 포함되어 있으면 contains()메소드는  true를 리턴, 그렇지않으면  false를 리턴
   					Type Boolean 받아야한다.
   				
 */
public class IndexOfContains {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");	// index = 3
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("자바");	// index = 0
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요");
		}else {
			System.out.println("자바와 관련 없는 책이군요");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
	}

}
