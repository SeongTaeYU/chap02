package sec01;

/*
 * 변수의 사용 범위 (scope)
 */

public class VariableScopeExample {
	public int v8;	// 전역변수

	public static void main(String[] args) {
		int v1 = 15;	// 지역변수
		int v2 = 0;
		
		if(v1>10) {
			//int v2 = v1 -10;	//v2는 if 범위에서 사용되는 변수 변수를 사용할 수 없기 때문에 컴파일 에러 발생
			v2 = v1 - 10;
		}
		int v3 = v1+ v2 + 5; //변수를 사용할 수 없기 때문에 컴파일 에러 발생

	}
	
	public void main2(String args[]) {
		System.out.println(v8);
	}

}
