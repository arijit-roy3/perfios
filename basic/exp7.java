class exp7{
	public static void main(String[] args){
		int n = 5;
 
        // Creating and initializing variable for
        // rows, columns and display value
        int i, j;
 
        // Nested iterating for 2D matrix
        // Outer loop for rows
        for (i = 1; i <= n; i++) {
        
        	for(int s=i;s<n;s++){
        		System.out.print(" ");
        	}
 
            // Inner loop for columns
            for (j = 1; j <= i; j++) {
 
                // Printing value to be displayed
                System.out.print("* ");
 
                
            }
 
            // Print elements of next row
            System.out.println();
        }
	}
}
