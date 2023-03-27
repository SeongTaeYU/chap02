package sec06;



public class Pyramid1 {
	public static void main(String[] args) {

for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 9-i; j++) {
		System.out.print(" ");	//공백출력
	}
	for (int j = 0; j <=i; j++) {
		System.out.print("*");	//*출력
	}
	System.out.println();
}
	}//m e
}// c e
