package defalt;

public class Ex2_8 {
	public static void main(String[] args) {
		int x = 10, y = 5;			//int x = 10; int y = 5;를 한줄로 표현.
		System.out.println("x = " + x);			// 결과값 = 10
		System.out.println("y = " + y);			// 결과값 = 5
		
		int tmp = x;				// 1. x의 값을 tmp에 저장
		x = y;						// 2. y의 값을 x에 저장
		y = tmp;					// 3. tmp에 저장된 값을 y에 저장
		System.out.println("x = " + x);			// 결과값 = 5
		System.out.println("y = " + y);			// 결과값 = 10
	}
}
