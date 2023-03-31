package classMethod;

import classMethod.human.Human104;

public class ClassMethod104 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Human104 yamada = new Human104("山田");

        Human104.staticMethodPrint();

        System.out.println(Human104.GREETING);

        yamada.instanceMethodPrint();

	}

}
