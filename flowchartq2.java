package activityjava;

public class flowchartq2 {
	//Flow Chart   
	public static void main(String[] args) {
	    flowchart(7000);
	   
	}
	
	private static void flowchart(int A) {
	    // TODO Auto-generated method stub
	   
	    if (A > 2000) {
	        System.out.println("A");
	        if (A > 6000) {
	            System.out.println("C");
	        } else {
	            System.out.println("B");
	        }
	    } else {
	        System.out.println("1");
	       
	        if (A > 100) {
	            System.out.println("2");
	
	        } else {
	            System.out.println("3");
	       
	    }
	    }
	}
	
}
