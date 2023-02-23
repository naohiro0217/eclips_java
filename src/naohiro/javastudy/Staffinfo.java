package naohiro.javastudy;

class Staff {
	String name;
	int staffId;
	String email;
}

public class Staffinfo {

	public static void main(String[] args) {

		Staff yamada = new Staff();
		yamada.name = "Taro Ymada";

		System.out.println(yamada.name);

	}

}
