package groupTasks;

import java.util.Scanner;

public class GroupTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inp = new Scanner (System.in);


		int [] num = new int[5];
		
			System.out.println("Enter your value: ");
		
		num[0] = inp.nextInt();
		
		num[1] = inp.nextInt();
		
		num[2] = inp.nextInt();
		
		num[3] = inp.nextInt();
		
		num[4] = inp.nextInt();

		int sum = 0;
		
		int sum1= num [0] + num [1] + num [2] + num[3] + num[4];
		
		int lengthofArray= num.length; 
			
		for (int i = 0; i <lengthofArray; i++) {

			sum = sum + num[i]; 

	} System.out.println(sum1);
		
		
		
		


		
				
				
				
				
				
		
		
		
		
	}

}
