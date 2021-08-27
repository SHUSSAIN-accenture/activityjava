package activityjava;

public class flowchartq1 {
	//Flow Chart
	public static void main(String[] args) {
	    flowchart(23,4, true);
	   
	}
	    private static void flowchart(int num1, int num2, boolean abc) {
	        // TODO Auto-generated method stub
	
	    if (abc) {
	        int result = num1 + num2;
	        System.out.println(result);
	    } else {
	        System.out.println(num1*num2);
	    }
	}
}
