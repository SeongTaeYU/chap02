package sec07;

public class Array04Int {

	public static void main(String[] args) {
		// 각 type(자료형) 별로 배열 선언
		int[] intArr = new int[3];			//new하게 되면 자기 타입에 기본값이 들어간다.
		double[] doubleArr = new double[3];
		float[] floatArr = new float[3];
		boolean[] boolArr = new boolean[3];
		String[] strArr = new String[3];	//객체는 null 값이 들어간다.
		//자동으로 초기화 된 값 확인하기
		System.out.println("int[1] : "+intArr[1]);
		System.out.println("double[1] : "+doubleArr[1]);
		System.out.println("float[1] : "+floatArr[1]);
		System.out.println("boolean[1] : "+boolArr[1]);
		System.out.println("String[1] : "+strArr[1]);
	}

}
