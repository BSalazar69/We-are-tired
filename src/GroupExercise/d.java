package GroupExercise;

public class d {
	public static void main(String[] args) {

		int[][] a = {
		        {1,1,2}, 
		        {3,1,2}, 
		        {3,5,3}, 
		        {0,1,2}  
		    };
		    int sum=0;
		    
		    for(int i = 0; i < rows; i++){  
	            sumRow = 0;  
	            for(int j = 0; j < cols; j++){  
	              sumRow = sumRow + a[i][j];  
	            }  
	            System.out.println("Sum of " + (i+1) +" row: " + sumRow);  
	        }  
		
	}
}