package sec03;
/*
 * 특정 위치의 문자를 얻고 싶다면 charAt()메소드 사용
 * 인덱스(메모리주소) : 0에서부터'문자열의 길이 -1'까지의 번호
 * 
 */
public class CharAt {

	public static void main(String[] args) {
		String ssnString = "9506241230123";
		char sex = ssnString.charAt(6);
		switch(sex) {
			case '1' :
			case '3' :
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
			
		}

	}

}
