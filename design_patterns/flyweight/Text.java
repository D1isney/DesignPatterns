package flyweight;

public class Text {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		System.out.println();
		//intern -> 内部指向常量池
		//它会优先去常量池里找
		System.out.println(s3.intern() == s1);
		System.out.println(s3.intern() == s4.intern());
	}

}
