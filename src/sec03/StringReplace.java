package sec03;
/*
 * replace() 메소드 : 문자열에서 특정 문자열을 다른 문자열로 대체할 때 사용
 					기존문자열은 그대로 두고, 대체한 새로운 문자열을 리턴
 */
public class StringReplace {	// 문자열 대체

	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바","JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
