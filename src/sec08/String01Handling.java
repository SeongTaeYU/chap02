package sec08;

public class String01Handling {

	public static void main(String[] args) {
		
		String jumin = "901030-2383763";
		
		//[1] chatAt()함수
		// 문자열을 반복문을 통해서 한자씩 추출
		for (int i = 0; i < jumin.length(); i++) {	// length()함수 : String 문자열을 배열처럼 사용
			System.out.print(jumin.charAt(i));
		}
		System.out.println();
		
		// [2]substring()함수로 주민번호 앞뒤를 각각 출력
		
		
		//System.out.println(jumin.substring(0,6));	// 주민번호 앞자리 (포함,미포함)
		String pie1 = jumin.substring(0,6);
		System.out.println(pie1);
	
		
		//System.out.println(jumin.substring(7));	// 7번 인덱스 부터 뒤로 추출
		String pie2 = jumin.substring(7);
		System.out.println(pie2);
		
		// [3] 주민번호로 남성입니다. 여성입니다. 구분해서 출력
		/*
		if(pie2.equals("1")) {
			System.out.println("남성입니다.");
		}else {
			System.out.println("여성입니다.");
		}
		*/
		
		String gender = jumin.substring(7,8);
		if(gender.equals("1")) {
			System.out.println("남성입니다.");
		}else{
			System.out.println("여성입니다.");
		}
		
		// [4] split() 함수
		// [4-1] 주민번호 '-' 기준으로 split 여성입니다. 구분해서 출력
		
		String[] split = jumin.split("-");
		System.out.println(split[0]+ " "+split[1]);
		gender = split[1].substring(0,1);
		if(gender.equals("1")) {
			System.out.println("남성입니다.");
		}else {
			System.out.println("여성입니다.");
		}
		
		// [4-2] 문자열 ';' 기준으로 split -> 탭ㅋ키로 분리 출력
		String str1 = "홍길동;천안;28;도술;010-2345-6789";
		
		String[] sp = str1.split(";");
		System.out.println("이름 : "+sp[0]);
		System.out.println("지역 : "+sp[1]);
		System.out.println("나이 : "+sp[2]);
		System.out.println("특기 : "+sp[3]);
		System.out.println("전화번호 : "+sp[4]);
		
		System.out.println("이름 : "+sp[0]+"\t"+"지역 : "+sp[1]+"\t"+"나이 : "+sp[2]+"\t"+"특기 : "+sp[3]+"\t"+"전화 번호 : "+sp[4]+"\t");
		
		for (String st : sp) {
			System.out.println(st+"\t");
		}
		
		//[4-3] 전화번호 문자열 자르기 split()
		String str = "010-1234-5678";
		String[] sp1 = str.split("-");
		System.out.println();
		System.out.println(sp[1]+sp[2]+sp[3]);
		
		for (String spp :sp1) {
			System.out.print(spp+" ");
		}System.out.println();
		
		//[4-4] 전화번호 문자열 바꾸기 replace();
		System.out.println();
		System.out.println("replace : "+str.replace("-", " "));
		
		String newstr = str.replace("-", " ");
		System.out.println(newstr);
		
		//[5] indexOf("구분자") 구분자의 위치 반환, 주민등록번호 뒷자리
		//String jumin = "901030-2383763";
//		int index = jumin.indexOf("-");
//		System.out.println("위치 : "+index);
		System.out.println(jumin.indexOf("-"));	 	//6
		System.out.println(jumin.substring(jumin.indexOf("-")+1));	// 
		
	}// m e

}// c e
