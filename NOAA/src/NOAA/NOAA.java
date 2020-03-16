package NOAA;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NOAA {

	public static void main(String[] args) {
		DecimalFormat convert = new DecimalFormat("#");
		Scanner input = new Scanner(System.in);
		System.out.printf("   ");
		for (double a = 80; a <= 110; a += 2) {
			System.out.printf("%5.0f ", a);
		}
		System.out.println();
		System.out.println("__________________________________________________________________________________________");
		for (double RH = 40; RH <= 100; RH += 5) {
			System.out.printf("%5.0f |", RH);
			for (double T = 80; T <= 110; T += 2) {
				System.out.printf("%5.0f",
						(-42.379 + 2.04901523 * T + 10.14333127 * RH - .22475541 * T * RH - .00683783 * T * T
								- .05481717 * RH * RH + .00122874 * T * T * RH + .00085282 * T * RH * RH
								- .00000199 * T * T * RH * RH));
			}
			System.out.println();
		}
		int temperature = 0;
		do {
			System.out.println("Enter a temperature or 0 to END");
			temperature = input.nextInt();
			if (temperature == 0) {
				break;
			} else {
				System.out.println("Enter the humidity");
				int humidity = input.nextInt();
				double THI = (-42.379 + 2.04901523 * temperature + 10.14333127 * humidity
						- .22475541 * temperature * humidity - .00683783 * temperature * temperature
						- .05481717 * humidity * humidity + .00122874 * temperature * temperature * humidity
						+ .0008582 * temperature * humidity * humidity
						- .00000199 * temperature * temperature * humidity * humidity);

				if (THI <= 90) {
					System.out.println("The THI for humidity: " + humidity + " and temperature " + temperature + " is "
							+ convert.format(THI) + " Caution ");
				} else if (THI < 105) {
					System.out.println("The THI for humidity: " + humidity + " and temperature " + temperature + " is "
							+ convert.format(THI) + " Extreme Caution ");
				} else if (THI < 126) {
					System.out.println("The THI for humidity: " + humidity + " and temperature " + temperature + " is "
							+ convert.format(THI) + " Danger ");
				} else {
					System.out.println("The THI for humidity: " + humidity + " and temperature " + temperature + " is "
							+ convert.format(THI) + " Extreme Danger ");
				}
			}
		} while (temperature != 0);

	}

}
