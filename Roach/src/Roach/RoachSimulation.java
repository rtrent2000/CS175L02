package Roach;

public class RoachSimulation {

	public static void main(String[] args) {
		RoachPopulation bugs = new RoachPopulation(10);
		double population = bugs.getRoaches();
		System.out.println("The initial Roach Population is " + Math.round(population));
		bugs.breed();
		double population1 = bugs.getRoaches();
		System.out.println("The Roach population after cycle 1 breeding is " + Math.round(population1));
		bugs.spray(50);
		double population2 = bugs.getRoaches();
		System.out.println("The Roach population after cycle 1 50% spraying is " + Math.round(population2));
		bugs.breed();
		double population3 = bugs.getRoaches();
		System.out.println("the Roach population after cycle 2 breeding is " + Math.round(population3));
		bugs.spray(60);
		double population4 = bugs.getRoaches();
		System.out.println("The Roach population after cycle 2 60% spraying is " + Math.round(population4));
		bugs.breed();
		double population5 = bugs.getRoaches();
		System.out.println("The Roach population after cycle 3 breeding is " + Math.round(population5));
		bugs.spray(70);
		double population6 = bugs.getRoaches();
		System.out.println("The Roach population after cycle 3 70% spraying is " + Math.round(population6));
		bugs.breed();
		double population7 = bugs.getRoaches();
		System.out.println("The Roach population after cycle 4 breeding is " + Math.round(population7));
		bugs.spray(80);
		double population8 = bugs.getRoaches();
		System.out.println("The Roach population after cycle 4 80% spraying is " + Math.round(population8));
	}

}
