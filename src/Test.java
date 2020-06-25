
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
	
	 /* this kind of sorting is powerful than others when the array is almost sorted, in the opposite when the 
	  * array is sorted upside down the complexity is very hight
	  * */
	public static void insertionSort(Double[] doubles) {
		int pos = 0;
		double temp;
		for(int i = 0; i < doubles.length;i++) {
			for(int j = 0;j<pos;j++) {
				if (doubles[j] > doubles[i]) {
					temp = doubles[j];
					doubles[j] = doubles[i];
					doubles[i] = temp;
				}
			}
			pos++;
		}
	}
	
	
	/* Selection sort  */
	public static void selectionSort(Double[] doubles) {
		
		double temp = 0;
		int index_min =0;
		
		
		for(int i = 0; i < doubles.length;i++) {
			
			double smallest = doubles[index_min];
			
			for(int j = i;j<doubles.length;j++) {
				if (doubles[j] < smallest) {
					index_min = j;				
				}
			}
			temp = doubles[i];
			doubles[i] = doubles[index_min];
			doubles[index_min] = temp;
			
		}
	}
	 
	
	
	
	public static void printArray(Double[] doubles) {
		for(int i =0;i<doubles.length;i++) {
			System.out.print(" "+ doubles[i]);
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		System.out.println("***********************************************");
		Double[] doubles = new Double[] {1.00,2.00,4.55,18.36,16.25,10.25,17.2,3.33,5.55};
		printArray(doubles);
		bubbleSort(doubles);
		printArray(doubles);
		System.out.println("***********************************************");
		Double[] doubles1 = new Double[] {5.12,1.22,48.22,6.01,14.25,25.35,0.2123,0.012};
		printArray(doubles1);
		insertionSort(doubles1);
		printArray(doubles1);
		System.out.println("***********************************************");
		Double[] doubles2 = new Double[] {1.00,2.00,4.55,18.36,16.25,10.25,17.2,3.33,5.55};
		printArray(doubles2);
		selectionSort(doubles);
		printArray(doubles);
		System.out.println("***********************************************");
		

	}

}
