package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int NumOfItem = scan.nextInt();	
		
		// input the number of item
		
		String [] NameOfItem  = new String[NumOfItem];
		double [] PriceOfItem = new double[NumOfItem];
		
		// create two arrays to put the name and price of items
				
		for(int i = 0; i < NumOfItem; i++) {
			NameOfItem[i] = scan.next();
			PriceOfItem[i] = scan.nextDouble();
		}
		

		// input name and price of items to arrays
		
		int NumOfCustomer = scan.nextInt();
		String [] NameOfCustomer = new String[NumOfCustomer];
		int [] NumOfItemBought = new int[NumOfItem];
		int [] NumOfCustomerBought = new int[NumOfItem];
		int TempSum = 0;
		
		
		for(int i = 0; i < NumOfCustomer; i++) {
			NameOfCustomer[i] = scan.next() + " " + scan.next();
			int NumOfPurchase = scan.nextInt();
			
			// read name of customers and number of their purchase
			
			for(int j = 0; j < NumOfPurchase; j++) {
				int NumOfSingleItem = scan.nextInt();
				String Item = scan.next();
				
				for(int k = 0; k < NumOfItem; k++) {
					TempSum = 0;
					if(NameOfItem[k].equals(Item)) {
						TempSum = NumOfSingleItem;
						NumOfItemBought[k] += TempSum;
						NumOfCustomerBought[k]++;
						//System.out.println(TempSum);
						// check to find the price of the item, than compute the sum
					}
				}
			}
		}
		for(int j = 0; j < NumOfItem; j++) {
			if((NumOfCustomerBought[j] - 0) < 0.05) {
				System.out.println("No customers bought " + NameOfItem[j]);
			}else{
				System.out.println(NumOfCustomerBought[j] + " customers bought " + NumOfItemBought[j] + " " + NameOfItem[j]);
			}
		}
			
	}
}
