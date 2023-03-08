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

class RemoteStaff extends Staff {
	public String location;
	public RemoteStaff(String name, int staffId, String email) {
		super(name, staffId, email);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
}
public class Staffinfo {

	public static void main(String[] args) {

		Staff yamada = new Staff("Taro Ymada", 12345, "yamada@abc.co.jp");
		RemoteStaff tanaka = new RemoteStaff("Hanako Tanaka", 98765, "tanaka@abc.co.jp");
		tanaka.location = "大阪";
		//yamada.name = "Taro Ymada";

		//yamada.sayhello();

		System.out.println("[社員情報]");
		System.out.println("氏名: " + yamada.getName());
		System.out.println("社員番号: " + yamada.getStaffId());
		System.out.println("Email: " + yamada.getEmail());
		
		System.out.println("[社員情報]");
		System.out.println("氏名: " + tanaka.getName());
		System.out.println("社員番号: " + tanaka.getStaffId());
		System.out.println("Email: " + tanaka.getEmail());
		System.out.println("勤務地: " + tanaka.location);

	}

}
