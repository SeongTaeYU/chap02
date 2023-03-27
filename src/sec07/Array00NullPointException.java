package sec07;
/*
 * NullPointException
 * - 메모리에 공간이 안만들어진 상태에서 특정 요소의 값에 접근할 경우 발생
 * - 참조하는 메모리 공간이 없는 상태
 */
public class Array00NullPointException {

	public static void main(String[] args) {
		int[] intArray = null;
		intArray = new int[3];
		intArray[0] = 10;	// NullPointerException
		
		String str =null;	// String 객체 (함수)
		str = "안녕하세요";	//메모리에 값을 할당(집이 생겼음)
		//NullPointerException
		System.out.println("총 문자 수 : "+str.length());
		

	}

}
