package classMethod;

import classMethod.human.Human002;

public class ClassMethod002 {
	public static void main(String[] args) {
		Human002 yamada = new Human002();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
		
		Human002 sato = new Human002("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
	}
}
