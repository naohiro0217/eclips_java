package extend;

import extend.human.Employee01;
import extend.human.Human01;
import extend.human.Student01;

public class Extend01 {
	public static void main(String[] args) {
		Human01 sugimoto = new Human01("杉本", 16);
		System.out.println("Humanクラスメイトのメソッド：名前は、" + sugimoto.getName());

		Student01 sato = new Student01("佐藤", 17, 70);
		System.out.println("Humanクラスのメソッド：名前は" + sato.getName());
		System.out.println("Studentクラスのメソッド：プロフィールを紹介します。" + sato.getStudentProfile());

		Human01 human = new Employee01("田中", 28, "システム部");
		System.out.println("Humanクラスのメソッド：名前は" + human.getName());

		Employee01 tanaka = (Employee01) human;
		System.out.println("employeeクラスのメソッド：プロフィールを紹介します。" + tanaka.getEmployeeProfile());

		Extend01.printName(sugimoto);
		Extend01.printName(sato);
		Extend01.printName(tanaka);
	}

	public static void printName(Human01 sugimoto) {
		System.out.println("Humanクラスのメソッド：名前は、" + sugimoto.getName());
	}
}
