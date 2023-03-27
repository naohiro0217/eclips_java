package classMethod;

import classMethod.human.Human102;

public class ClassMethod102 {

	public static void main(String[] args) {
		Human102 yamada = new Human102();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

		Human102 sato = new Human102("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");

	}

}
