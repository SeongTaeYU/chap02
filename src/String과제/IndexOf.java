package String과제;

public class IndexOf {

	public static void main(String[] args) {
		String hi = "Java Hi Programming";
		String alpha = "ABCDEFG";
		
		System.out.println(hi.indexOf("r"));
		System.out.println(hi.indexOf("P"));
		System.out.println(hi.indexOf("w"));
		System.out.println(hi.indexOf("a",2));
		
		System.out.println(hi.indexOf(" "));
		
		System.out.println(alpha.indexOf(67));
		System.out.println(alpha.indexOf(99,3));
		

	}

}
