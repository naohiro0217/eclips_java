
public class Classmethod101 {

	public static void main(String[] args) {
		Human101 yamada = new Human101();
		System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");

		Human101 sato = new Human101("佐藤", 25);
		System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");


	}

}
