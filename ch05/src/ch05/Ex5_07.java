package ch05;

public class Ex5_07 {
	public static void main(String[] args) {
		System.out.println(".이건뭐지 : "+ args.length);
		
		for(int i=0;i<args.length;i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
	}
}
