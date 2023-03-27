package sec07;

public class Array21SelectionSort {

	public static void main(String[] args) {
		/*
		 * [선택정렬] 내림차순 정렬
		 */
			int[] age = null;
			int small = 0;			// 값을 보관
			age = new int[] {1,3,2,5,4};
			
			for (int i = 0; i < age.length-1; i++) {	// i 자리 지정  다섯개 중에 4개가 정렬되면 1개는 자동으로 들어간다.
				
				for (int j = i+1; j < age.length; j++) {	//j 자리 지정하여 비교
					
				if (age[i] < age[j]) {
					small  = age[i];	// 값을 보관
					age[i] = age[j];
					age[j] = small;		
						
					}
					
				}
				
			}// for end
			
			for (int i : age) {
				System.out.print(i+ "\t");
				
			}
	}// m e

}// c e

/*
 *원래수		1 3 2 5 4
 *정렬된수		5 1 2 3 4
 *정렬된수		5 4 1 2 3
 *정렬된수		5 4 3 2 
 *정렬된수		5 4 3 2 1
 */ 	
