
public class do_while1 {
	public static void main(String[] args) {
		int x = 1;
		int amount = 0;
		
		do {
			System.out.println(x + "を足します");
			amount = amount + x;
			x++;
		} while (amount < 0);
		System.out.println("合計は" + amount);
	}

}
