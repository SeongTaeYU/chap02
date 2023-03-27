package sec03;
/*
 * substring() 메소드 : 문자열에서 특정 위치의 문자열을 잘라내어 가져오고 싶을 때 사용
 * 
 */
public class SubStringExam {

	public static void main(String[] args) {
		String ssn = "880815-1234567";
		//  8 8 0 8 1 5 - 1 2 3 4  5  6  7
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13
		
		String firstNum = ssn.substring(0,6);	// 6까지 -미포함
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);	// 7부터 나머지 숫자 출력
		System.out.println(secondNum);

	}

}
