package groupTasks;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arrays[][] = { {1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14} };
int sum = 0;	
	for (int array1 = 0; array1<arrays.length; array1++) {
		for (int array2=0; array2<arrays[array1].length; array2++) {
			
			if(arrays[array1][array2]%2 ==0) {
				sum = sum+ arrays[array1][array2];
			 }
				
            if(arrays[array1][array2]%2 !=0)  {
					sum = sum+ arrays[array1][array2];
					
				}
        
			
		}	System.out.println(sum);
		System.out.println(sum);
	}
	
	
} 
	}


