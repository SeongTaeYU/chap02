package sec06;



public class Pyramid2 {
	public static void main(String[] args) {

//	int i;
//	int j;
//	int k;
	int num =10;
		
	for (int i = 0; i < num; i++) {
		for (int j = 0; j < num-i; j++) {
			System.out.print(" ");
		}
		for (int k = 0; k < i*2+1; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}//m e
}// c e
