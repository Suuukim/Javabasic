package ch03;

public class Ex3_04 {
	public static void main(String[] args) {
		int i = -10;
		i = +i;
		System.out.println(i);		// 결과값 -10
		
		i = -10;
		i = -i;
		System.out.println(i);		// 결과값 10
	}
}
