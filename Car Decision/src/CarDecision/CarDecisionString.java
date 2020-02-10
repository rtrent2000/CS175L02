package CarDecision;
import java.util.Scanner;
public class CarDecisionString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter information for the regular car: ");
		String regCar = input.nextLine();
		System.out.println("Enter information for the hybrid car: ");
		String hybridCar = input.nextLine();
		String regCarName = regCar.substring(0,14);
		String regPrice = regCar.substring(15,20);
		int regCarPrice = Integer.parseInt(regPrice);
		String regGas = regCar.substring(21,23);
		int regCarGas = Integer.parseInt(regGas);
		String hybridCarName = hybridCar.substring(0,12);
		String hybridPrice = hybridCar.substring(13,18);
		int hybridCarPrice = Integer.parseInt(hybridPrice);
		String hybridGas = hybridCar.substring(19,21);
		int hybridCarGas = Integer.parseInt(hybridGas);
		System.out.println("Enter miles traveled in a year: ");
		int miles = input.nextInt();
		System.out.println("Enter cost per gallon of gas: ");
		double costOfGas = input.nextDouble();
		//Calculations
		double fyCostReg = miles/regCarGas * costOfGas + regCarPrice;
		double syCostReg = miles/regCarGas * costOfGas + fyCostReg;
		double tyCostReg = miles/regCarGas * costOfGas + syCostReg;
		double foyCostReg = miles/regCarGas * costOfGas + tyCostReg;
		double fiyCostReg = miles/regCarGas * costOfGas + foyCostReg;
		double fyCostHybrid = miles/hybridCarGas * costOfGas + hybridCarPrice;
		double syCostHybrid = miles/hybridCarGas * costOfGas + fyCostHybrid;
		double tyCostHybrid = miles/hybridCarGas * costOfGas + syCostHybrid;
		double foyCostHybrid = miles/hybridCarGas * costOfGas + tyCostHybrid;
		double fiyCostHybrid = miles/hybridCarGas * costOfGas + foyCostHybrid;
		//Output
		System.out.println("Cost to own " + regCarName + " after 1 year: " + fyCostReg + " for " + hybridCarName + ": " + fyCostHybrid);
		System.out.println("Cost to own " + regCarName + " after 2 year: " + syCostReg + " for " + hybridCarName + ": " + syCostHybrid);
		System.out.println("Cost to own " + regCarName + " after 3 year: " + tyCostReg + " for " + hybridCarName + ": " + tyCostHybrid);
		System.out.println("Cost to own " + regCarName + " after 4 year: " + foyCostReg + " for " + hybridCarName + ": " + foyCostHybrid);
		System.out.println("Cost to own " + regCarName + " after 5 year: " + fiyCostReg + " for " + hybridCarName + ": " + fiyCostHybrid);
		if(fiyCostReg > fiyCostHybrid)
		{
			System.out.println("The " + hybridCarName + " pays back after 5 years");
		}
		else
		{
			
		}
}

}