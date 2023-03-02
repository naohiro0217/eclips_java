package naohiro.javastudy;



public class BmiCalc {
//BMI体格異数を計算するプログラム
//BMI = 体重　/ (身長　* 身長)
//体重 kg 身長　m→cm
	public static void main(String[] args) {
		double weight,height,bmi;


		weight = 62;
//		height = 1.71;
		height = 171;

		height /= 100;
		bmi = weight / (height * height);

		System.out.println(bmi);

		if (bmi < 18.5) {
			System.out.println("痩せ型です");
		} else if (bmi < 25) {
			System.out.println("標準です");
		} else {
			System.out.println("肥満です");
		}

	}

}
