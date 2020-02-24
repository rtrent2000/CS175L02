package GroceryDiscount;

import java.util.Scanner;

public class GroceryDiscount2 {
	public static void main(String[] args) {
		double discountCost;
		double cost;
		boolean go = true;
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the amount you spent on groceries or '0' to quit: ");
			while(input.hasNextDouble())
			{
				cost = input.nextDouble();
				if (cost == 0) 
				{
					System.exit(0);
				} 
				else if((cost <= 10) || (cost >= 1000))
				{
					System.out.println("That is not a number between 10 and 1000 please enter a valid number.");
				}
				else if (cost <= 60) 
				{
					discountCost = (cost * .08);
					double roundOff = Math.round(discountCost * 100.0) / 100.0;
					System.out.println("You win a discount coupon of $" + roundOff + "0. (8% of your purchase)");
				}
				else if (cost <= 150) 
				{
					discountCost = (cost * .1);
					double roundOff = Math.round(discountCost * 100.0) / 100.0;
					System.out.println("You win a discount coupon of $" + roundOff + "0. (10% of your purchase)");
				}
				else if (cost <= 210) 
				{
					discountCost = (cost * .12);
					double roundOff = Math.round(discountCost * 100.0) / 100.0;
					System.out.println("You win a discount coupon of $" + roundOff + "0. (12% of your purchase)");
				} 
				else if (cost < 1000) 
				{
					discountCost = (cost * .14);
					double roundOff = Math.round(discountCost * 100.0) / 100.0;
					System.out.println("You win a discount coupon of $" + roundOff + "0. (14% of your purchase)");
				}
				System.out.println("Please enter the cost of your groceries of '0' to quit");
			}
			System.out.println("Enter a number");
		} 
		while (go == true);
		}

}
