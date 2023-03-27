package sec03;
/*
 * 문자열 비교할때  equals()메소드 사용
 */
public class EmptyStringExampe {

	public static void main(String[] args) {
		String hobby ="";
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
		}

	}

}
