
public class while1 {
	public static void main(String[] args) {
		int x = 1;
		int amount = 0;
		
		while (amount < 10) {
			System.out.println(x + "を足します");
			amount = amount + x;
			x++;
		}
	}

}
