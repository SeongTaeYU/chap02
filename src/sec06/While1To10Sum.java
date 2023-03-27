package sec06;

public class While1To10Sum {// c s

	public static void main(String[] args) {// m s
		/*
		int sum = 0;
		
		int i = 1;
		while(i<=10) {
			i++; 
			if(i%2==0) {
				sum +=i;
				
			}//i++; 
		}
		System.out.println("1~" +(i-1)+"합 : "+sum);
		*/
		int sum =0;
		int i = 1;
		
		while(true) {
			
			if(i%2==0) {
				sum += i;
			}
			if(i>10) {
				break;
			}i++;
			//System.out.println(i);
									
		}System.out.println("1~"+(i-1)+"합 : "+sum);
	}//m e

}//c e
