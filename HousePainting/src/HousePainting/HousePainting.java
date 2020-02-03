package HousePainting;
import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
		double totalSqFt;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the width of the house: ");
		int width = input.nextInt();
		System.out.println ("Enter the length of the house: ");
		int length = input.nextInt();
		System.out.println("Enter the height of the house: ");
		int height = input.nextInt();
		double peakSideSqFt = length * width + .5*(length*(height-width));
		peakSideSqFt = peakSideSqFt *2;
		double sideSqFt = length * width;
		sideSqFt = sideSqFt *2;
		System.out.println("Enter how many windows are on the house: ");
		int numWindows = input.nextInt();
		System.out.println("Enter the height of the windows: ");
		int windowHeight = input.nextInt();
		System.out.println("Enter the width of the windows: ");
		int windowWidth = input.nextInt();
		int totalWindowSqFt = numWindows * windowHeight * windowWidth;
		System.out.println("Enter the number of doors on the house: ");
		int numDoors = input.nextInt();
		System.out.println("Enter the height of the doors: ");
		int doorHeight = input.nextInt();
		System.out.println("Enter the width of the doors: ");
		int doorWidth = input.nextInt();
		int totalDoorSqFt = numDoors * doorHeight * doorWidth;
		totalSqFt = sideSqFt + peakSideSqFt;
		totalSqFt -= totalDoorSqFt;
		totalSqFt -= totalWindowSqFt;
		System.out.println("The house is " + totalSqFt + " Square Feet");
		double painterCost = totalSqFt * 5;
		System.out.println("The cost is: "+ painterCost);
		
		
	}

}
