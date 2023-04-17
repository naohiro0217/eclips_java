
public class Sample602 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SampleClass601 s1,s2;
        s1 = new SampleClass601();
        s2 = new SampleClass601();
        //  インスタンスs1,s2ごとに、フィールドに違う値を代入
        s1.n = 100;
        s2.n = 200;
        s1.s = "ABC";
        s2.s = "あいう";
        //  インスタンスごとにメソッドを呼び出す。
        System.out.println(s1.add("DEF"));
        System.out.println(s2.add("えお"));
        s1.showNum();
        s2.showNum();

	}

}
