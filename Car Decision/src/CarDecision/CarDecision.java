package CarDecision;
import java.util.Scanner;
public class CarDecision {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Inputs
		System.out.println("Enter the cost of a regular car: ");
		double regCar = input.nextDouble();
		System.out.println("Enter miles per gallon of regular car: ");
		int mpgReg = input.nextInt();
		System.out.println("Enter price of hybrid car: ");
		double hybridCar = input.nextDouble();
		System.out.println("Enter miles per gallon of hybrid car: ");
		int mpgHybrid = input.nextInt();
		System.out.println("Enter miles traveled in a year: ");
		int miles = input.nextInt();
		System.out.println("Enter cost per gallon of gas: ");
		double costGas = input.nextDouble();
		//Calculations
		double fyCostReg = miles/mpgReg * costGas + regCar;
		double syCostReg = miles/mpgReg * costGas + fyCostReg;
		double tyCostReg = miles/mpgReg * costGas + syCostReg;
		double foyCostReg = miles/mpgReg * costGas + tyCostReg;
		double fiyCostReg = miles/mpgReg * costGas + foyCostReg;
		double fyCostHybrid = miles/mpgHybrid * costGas + hybridCar;
		double syCostHybrid = miles/mpgHybrid * costGas + fyCostHybrid;
		double tyCostHybrid = miles/mpgHybrid * costGas + syCostHybrid;
		double foyCostHybrid = miles/mpgHybrid * costGas + tyCostHybrid;
		double fiyCostHybrid = miles/mpgHybrid * costGas + foyCostHybrid;
		//Outputs
		System.out.println("Cost to own after year 1 for regular car: " + fyCostReg + " for hybrid car: " + fyCostHybrid);
		System.out.println("Cost to own after year 2 for regular car: " + syCostReg + " for hybrid car: " + syCostHybrid);
		System.out.println("Cost to own after year 3 for regular car: " + tyCostReg + " for hybrid car: " + tyCostHybrid);
		System.out.println("Cost to own after year 4 for regular car: " + foyCostReg + " for hybrid car: " + foyCostHybrid);
		System.out.println("cost to own after year 5 for regular car: " + fiyCostReg + " for hybrid car: " + fiyCostHybrid);
		if(fiyCostReg > fiyCostHybrid)
		{
			System.out.println("The hybrid car pays back after 5 years");
		}
		else
		{
			
		}

	}

}
