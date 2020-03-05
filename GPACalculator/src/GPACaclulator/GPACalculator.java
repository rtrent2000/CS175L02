package GPACaclulator;
import java.util.Scanner;
public class GPACalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//Input
		double points = 0;
		double gpa = 0;
		double totalPoints = 0;
		double totalCredits = 0;
		System.out.println("Enter the amount of classes you need to enter: ");
		int amount = input.nextInt();
		for (int i = 0; i < amount; i++)
		{

			System.out.println("Enter course information seperated by commas (title, credit hours, letter grade) or type Q to quit: ");
			String courseInfo = input.next();
			if (courseInfo == "Q")
				break;
			
			String[] courseStuff = courseInfo.split(",");
			String courseName = courseStuff[0];
			String fakeCredits = courseStuff[1];
			int credits = Integer.parseInt(fakeCredits);
			String grade = courseStuff[2];
			
			if((grade.equals("A")) || (grade.equals("a")))
			{
				points = 4.00;
			}
			else if((grade.equals("A-")) || (grade.equals("a-")))
			{
				points = 3.70;
			}
			else if((grade.equals("B+")) || (grade.equals("b+")))
			{
				points = 3.33;
			}
			else if((grade.equals("B")) || (grade.equals("b")))
				
			{
				points = 3.00;
			}
			else if((grade.equals("B-")) || (grade.equals("b-")))
			{
				points = 2.70;
			}
			else if((grade.equals("C+")) || (grade.equals("c+")))
			{
				points = 2.30;
			}
			else if((grade.equals("C")) || (grade.equals("c")))
			{
				points = 2.00;
			}
			else if((grade.equals("C-")) || (grade.equals("c-")))
			{
				points = 1.70;
			}
			else if((grade.equals("D+")) || (grade.equals("d+")))
			{
				points = 1.30;
			}
			else if((grade.equals("D")) || (grade.equals("d")))
			{
				points = 1.00;
			}
			else if((grade.equals("D-")) || (grade.equals("d-")))
			{
				points = .70;
			}
			else if((grade.equals("F")) || (grade.equals("f")) || (grade.equals("WF")) || (grade.equals("wf")))
			{
				points = 0;
			}
			else
			{
				
			}
			double gradePoints = credits*points;
			totalCredits = credits+ totalCredits;
			totalPoints = gradePoints + totalPoints;
			gpa = totalPoints/totalCredits;
			System.out.println("Course: " + courseName + " Credits: " +credits+ " Grade: " + grade);
		}
		System.out.println("GPA: " + gpa);
	}
	
}
