package defalt;

public class Ex2_07 {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);				// 결과값 = Java
		System.out.println(str);				// 결과값 = Java8.0
		System.out.println(7 + " ");			// 결과값 = 7
		System.out.println(" " + 7);			// 결과값 =  7
		System.out.println(7 + "");				// 결과값 = 7
		System.out.println("" + 7);				// 결과값 = 7
		System.out.println("" + "");			// 결과값 = 
		System.out.println(7 + 7 + "");			// 결과값 = 14
		System.out.println("" + 7 + 7);			// 결과값 = 77
	}
}
