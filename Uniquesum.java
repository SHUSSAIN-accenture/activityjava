package activityjava;

public class Uniquesum {
	// Unique Sum
		public static void main(String[] args) {
		uniquesum(1, 5, 3);
		}

		private static void uniquesum(int a, int b, int c) {
		// TODO Auto-generated method stub
		if ((a != b) && (b != c) && (a != c)) {
		System.out.println(a+b+c);
		} else if ((a == b) && (b != c)) {
		System.out.println(b+c);
		} else if ((b == c) && (a !=c)) {
		System.out.println(a +c);
		} else if ((a == b) && (b == c)) {
		System.out.println("0");
		}
		}
}
