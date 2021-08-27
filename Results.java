package activityjava;

public class Results {
	// Results
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int phy=100, chem=50, bio=80;
		total(phy, chem, bio);
		}
	
		private static void total (int x, int y, int z) {
		// TODO Auto-generated method stub
			int total = x + y + z;
			double percentage = ((double)total / 450) * 100;
		System.out.println(x);
		System.out.println("Physics: " + x + " Chemistry: "+ y + " Biology: " + z);
		System.out.println(total);
		System.out.println("percentage: " + percentage);
		
		}
		 
}

