package activityjava;

public class Blackjack {
//BlackJack
	public static void main(String[] args) {
	 blackjack(31, 22);
	}
	private static void blackjack(int A, int B) {
	 // TODO Auto-generated method stub
	 if (((A > B) && A <= 21) || B < 21) {
	 System.out.println("Winner is A "+ A);
	 } else if ((A < B) && B <=21 || A < 21) {
	 System.out.println("Winner is B "+ B);
	 } else if ((A > 21) && (B > 21)) {
	 System.out.println("Everyone lose");
	 }
	 }
}
