package classMethod;

import classMethod.human.Human33;

public class ClassMethod33 {
	public static void main(String[] args) {
		Human33 yamada = new Human33() ;
		
		System.out.println("私の名前は" + yamada.name + "です。");
		String profile = yamada.getProfile();
		System.out.println(profile + "です。");
		
		yamada.greet("田辺");
		yamada.greet(null);
	}
}
