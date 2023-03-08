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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}

public class Staffinfo {

	public static void main(String[] args) {

		Staff yamada = new Staff("Taro Ymada", 12345, "yamada@abc.co.jp");
		//yamada.name = "Taro Ymada";

		//yamada.sayhello();

		System.out.println("[社員情報]");
		System.out.println("氏名: " + yamada.getName());
		System.out.println("社員番号: " + yamada.getStaffId());
		System.out.println("Email: " + yamada.getEmail());

	}

}
