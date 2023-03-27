package sec06;



public class Pyramid3 {
	public static void main(String[] args) {

	
for (int i = 10; i > 0; i--) {			// 
	for (int j = i*2-1; j > 0; j--) {	//별(*)시작은 공백없이 입력값 5 기준으로 ,별은 9개 ->7개 -> 5개... 즉 2개씩 감소
		System.out.print("*");			// 1번째 for문에서 i=10으로 지정했기 때문에 i값 감소할때마다 ,j=9 -> j=7 -> j=5
	}
	System.out.println();
}
	}//m e
}// c e


//출처 : https://kyhyuk.tistory.com/41