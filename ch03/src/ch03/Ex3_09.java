package ch03;

public class Ex3_09 {
	public static void main(String[] args) {
		int a = 1_000_000;		// 1,000,000
		int b = 2_000_000;		// 2,000,000
		
		long c = a * b;		// a * b = 2,000,000,000,000 ?
		
		System.out.println(c);
	}
}
