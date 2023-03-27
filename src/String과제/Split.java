package String과제;

public class Split {

	public static void main(String[] args) {
		String str ="안녕하세요. 이메일 주소는 yetit@naver.com 입니다.";
		// String[] arraysresult = str.split(",|@|-|");
		
		String[] arraysresult = str.split(" ");
		
		for (int i = 0; i < arraysresult.length; i++) {
			System.out.println(arraysresult[i]);
		}

	}

}
