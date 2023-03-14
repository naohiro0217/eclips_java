package exception;

public class Exception03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Exception03.division(100, 0);
		} catch (ArithmeticException e) {
			System.out.println("ArithemeticExcepection例外が発生");
		} catch (IllegalArgumentException e) {
			System.out.println("IllegaArgumentExcepection例外が発生");
			throw e;
		}
		System.out.println("プログラム終了");

	}
	
	public static void division(int a, int b) {
		System.out.println(a + " ÷ " + b + "は？" );
		if (b == 0) {
			throw new IllegalArgumentException("引数が不正解です");
		}
		int result = a / b;
		System.out.println("計算結果" + result);
	}

}
