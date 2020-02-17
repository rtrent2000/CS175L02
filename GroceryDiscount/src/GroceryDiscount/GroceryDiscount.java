package GroceryDiscount;
import java.util.Scanner;
public class GroceryDiscount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double discountCost;
		int i = 1;
		do
		{
		System.out.println("Please enter the amount you spent on groceries or '0' to quit: ");
		double cost = input.nextDouble();
		if(cost == 0)
			break;
		else if(cost < 10)
			System.out.println("You are not eligible for a discount at this time.");
		else if(cost <= 60)
		{
			discountCost = (cost * .08);
			double roundOff = Math.round(discountCost *100.0)/100.0;
			System.out.println("You win a discount coupon of $" + roundOff + "0. (8% of your purchase)");
		}
		else if (cost <= 150)
		{
			discountCost = (cost * .1);
			double roundOff = Math.round(discountCost *100.0)/100.0;
			System.out.println("You win a discount coupon of $" + roundOff + "0. (10% of your purchase)");
		}
		else if (cost <= 210)
		{
			discountCost = (cost * .12);
			double roundOff = Math.round(discountCost *100.0)/100.0;
			System.out.println("You win a discount coupon of $" + roundOff + "0. (12% of your purchase)");
		}
		else 
		{
			discountCost = (cost * .14);
			double roundOff = Math.round(discountCost * 100.0)/100.0;
			System.out.println("You win a discount coupon of $" + roundOff + "0. (14% of your purchase)");
		}
		}while(i>0);
	}

}
