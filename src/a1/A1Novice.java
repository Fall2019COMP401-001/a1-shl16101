package a1;

import java.util.Scanner;


public class A1Novice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int NumOfCustomer = sc.nextInt(); // 3
		
		String [] Result = new String [NumOfCustomer];
		
		for(int j=0; j < NumOfCustomer; j++) {
			char FirstName = sc.next().charAt(0); // C
			
			String LastName = sc.next(); // LastName
			
			int count = sc.nextInt(); // number of item bought
			
			// store the number in an array
			int [] NumberOfPurchase = new int[count];
			double [] Price = new double[count];
			
			double SumOfC = 0;
			double SumOfSingleItem = 0;
			// define the value of variable sum
			
			
			//System.out.println(NumberOfPurchase[1]);
		
			
			for (int i=0; i< count; i++) {
				NumberOfPurchase[i] = sc.nextInt();
				String Fruit = sc.next();
				Price[i] = sc.nextDouble();
				SumOfSingleItem = NumberOfPurchase[i] * Price[i] * 1.00;
				SumOfC += SumOfSingleItem;
			}
			
			Result[j] = FirstName + ". " + LastName + ": " + String.format("%.2f", SumOfC);
			// read the name of customer and printed it with F. Last format
			
		}
		
		for(int k = 0; k < NumOfCustomer; k++) {
			System.out.println(Result[k]);
		}
		
		//
		
		
	}
}
