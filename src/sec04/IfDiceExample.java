package sec04;

public class IfDiceExample {

	public static void main(String[] args) {
		//Math.random()메소드 : 0.0~1.0 사이의 double 타입 난수 리턴(발생) 
		int num = (int)(Math.random()*6)+1;	// int타입으로 강제 타입 변환, 1부터 시작 1~6사이 난수 발생
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
