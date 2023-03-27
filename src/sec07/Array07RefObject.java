package sec07;

public class Array07RefObject {

	public static void main(String[] args) {
		String[] strArray = new String[3];
		
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);	//true 동일한곳을 바라보고있음
		System.out.println(strArray[0] == strArray[2]); //false
		System.out.println(strArray[0].equals (strArray[2])); // true
		/*
		 *  ==      : 두 곳의 주소 비교
		 *  .equals : 값을 비교
		 */
	}

}
