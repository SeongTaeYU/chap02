package String과제;

public class equals {

	public static void main(String[] args) {
		String name1 = "유성태";
		String name2 = "유성태";
		String name3 = new String("유성태");
		
		System.out.println("name1 hash Code : "+ System.identityHashCode(name1));
		System.out.println("name1 hash Code : "+ System.identityHashCode(name2));
		System.out.println("name1 hash Code : "+ System.identityHashCode(name3));

		if(name1 == name2) {
			System.out.println("name1과 name2의 주소는 같다.");
		}
		if(name1 == name3) {
			System.out.println("name1 == name3 True");
		}else {
			System.out.println("name1 == name3 False");
		}
		if(name1.equals(name3)) {
			System.out.println("name1과 name3이 갖고 있는 값은 같다.");
		}else {
			System.out.println("name1과 name3이 갖고 있는 값은 다르다.");
		}
	}

}
