
public class Test {
	
	// The worst scenario with bubble sort would be in the case we have an array ordered in descending order, and we're looking to order it in an ascending order
	// This case the while loop will execute n-1 times where n is the number of element in array, plus the check iteration
	public static void bubbleSort(Double[] doubles) {
	    boolean sorted = false;
	    double temp;;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < doubles.length - 1; i++) {
	            if (doubles[i] > doubles[i+1]) {
	                temp = doubles[i];
	                doubles[i] = doubles[i+1];
	                doubles[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }

	}
	
	
	
	
	public static void printArray(Double[] doubles) {
		for(int i =0;i<doubles.length;i++) {
			System.out.print(" "+ doubles[i]);
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		Double[] doubles = new Double[] {1.00,2.00,4.55,18.36,16.25,10.25,17.2,3.33,5.55};
		printArray(doubles);
		bubbleSort(doubles);
		System.out.println("***************************");
		printArray(doubles);

	}

}
