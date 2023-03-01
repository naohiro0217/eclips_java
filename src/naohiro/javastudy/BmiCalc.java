package naohiro.javastudy;

public class BmiCalc {
//BMI体格異数を計算するプログラム
//BMI = 体重　/ (身長　* 身長)
//体重 kg 身長　m→cm
	public static void main(String[] args) {
		double weight,height,bmi;

		weight = 60;
//		height = 1.71;
		height = 171;

		height /= 100;
		bmi = weight / (height * height);

		System.out.println(bmi);

	}

}
