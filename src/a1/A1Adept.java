package a1;

import java.util.Scanner;

public class A1Adept {

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
		
		
		
		double [] TotalSumOfCustomer = new double[NumOfCustomer];
		double TotalSum = 0;
		double TempSum = 0;
		
		for(int i = 0; i < NumOfCustomer; i++) {
			TotalSum = 0;
			NameOfCustomer[i] = scan.next() + " " + scan.next();
			int NumOfPurchase = scan.nextInt();
			
			// read name of customers and number of their purchase
			
			for(int j = 0; j < NumOfPurchase; j++) {
				int NumOfSingleItem = scan.nextInt();
				String Item = scan.next();
				
				for(int k = 0; k < NumOfItem; k++) {
					if(NameOfItem[k].equals(Item)) {
						TempSum = PriceOfItem[k] * NumOfSingleItem;
						//System.out.println(TempSum);
						// check to find the price of the item, than compute the sum
					}
				}
				TotalSum += TempSum;
			}
			TotalSumOfCustomer[i] = TotalSum;

		}
		
		double sum = calculateValueSum(TotalSumOfCustomer);
		double min = findValueMin(TotalSumOfCustomer);
		double max = findValueMax(TotalSumOfCustomer);
		
		double avg = sum / NumOfCustomer;
		
		//System.out.println(TotalSumOfCustomer[0]);
		//System.out.println(TotalSumOfCustomer[1]);
		//System.out.println(TotalSumOfCustomer[2]);
		
		
		for(int j = 0; j < NumOfCustomer; j++) {
			if(TotalSumOfCustomer[j] == max) {
				System.out.println("Biggest: " + NameOfCustomer[j] + " (" + String.format("%.2f", max) + ")");
			}
		}
		
		for(int j = 0; j < NumOfCustomer; j++) {
			if(TotalSumOfCustomer[j] == min) {
				System.out.println("Smallest: " + NameOfCustomer[j] + " (" + String.format("%.2f", min) + ")");
			}
		}
		
		System.out.println("Average: " +  String.format("%.2f", avg));
		
	}
	
	static double calculateValueSum(double[] vals) {
		
		double sum = 0;
		
		for (int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		
		return sum;
	}
	
	
	static double findValueMax(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_max = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		
		return cur_max;
	}

	
	static double findValueMin(double[] vals) {
		
		// Initialize current minimum to first value in array.
		 double cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		
		return cur_min;
	}
	
}


