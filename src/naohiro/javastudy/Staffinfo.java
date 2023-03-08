package naohiro.javastudy;

class Staff {
	String name;
	int staffId;
	String email;

	public void sayhello() {
		System.out.println("Hello " + this.name);
	}

	public Staff(String name, int staffId, String email) {
		super();
		this.name = name;
		this.staffId = staffId;
		this.email = email;
	}
}

public class Staffinfo {

	public static void main(String[] args) {

		Staff yamada = new Staff("Taro Ymada", 12345, "yamada@abc.co.jp");
		//yamada.name = "Taro Ymada";

		yamada.sayhello();

//		System.out.println(yamada.name);

	}

}
