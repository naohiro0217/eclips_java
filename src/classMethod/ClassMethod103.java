package classMethod;

import classMethod.human.Human103;

public class ClassMethod103 {

	public static void main(String[] args) {
		Human103 yamada = new Human103();

		System.out.println("私の名前は" + yamada.name + "です。");
		String profile = yamada.getProfile();
		System.out.println(profile + "です。");

		yamada.greet("田辺");
		yamada.greet(null);

	}

}
