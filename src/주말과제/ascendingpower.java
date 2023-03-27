package 주말과제;

public class ascendingpower {

	public static void main(String[] args) {

		int[] age = null;
		int small = 0;			// 값을 보관
		age = new int[] {1,3,2,5,4};
		
		for (int i = 0; i < age.length-1; i++) {	// i 자리 지정  다섯개 중에 4개가 정렬되면 1개는 자동으로 들어간다.
			
			for (int j = i+1; j < age.length; j++) {	//j 자리 지정하여 비교
				
			if (age[i] > age[j]) {
				small  = age[i];	// 값을 보관
				age[i] = age[j];
				age[j] = small;		
					
				}
				
			}
			
		}// for end
		
		for (int i : age) {
			System.out.print(i+ "\t");
			
		}
	}

}
