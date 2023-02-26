package naohiro.javastudy;

class Staff {
	String name;
	int staffId;
	String email;
	
	public void sayhello() {
		System.out.println("Hello " + this.name);
	}
}

public class Staffinfo {

	public static void main(String[] args) {

		Staff yamada = new Staff();
		yamada.name = "Taro Ymada";
		
		yamada.sayhello();

//		System.out.println(yamada.name);

	}

}
