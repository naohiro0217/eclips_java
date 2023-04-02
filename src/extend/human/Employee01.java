package extend.human;

public class Employee01 extends Human01 {
	private String department;

	public Employee01(String name, int age, String department) {
		super (name, age);
		this.department = department;
	}

	public String getEmployeeProfile() {
		String profile = "年齢は" + this.age + "です。";
		profile += "サラリーマンで、部署は" + this.department + "です。";
		return profile;
	}

}
