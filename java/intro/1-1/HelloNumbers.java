public class HelloNumbers {
	public static void main(String[] args) {
		int x = 0, n = 0;
		while (x < 46) {
			n = 1 + n;
			System.out.print(x + " ");
			x = x + n;
		}
	}
}

