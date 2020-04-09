package Counter;

public class CounterTest {
	public static void main(String[] args) {
			Counter venue = new Counter();
			int realValue = venue.getValue();
			for(int i= 1; i <= 10; i++)
			{
				venue.click();
			}
			realValue = venue.getValue();
			for(int l = 1; l<= 5; l++)
			{
				venue.unclick();
			}
			realValue = venue.getValue();
			System.out.println("Expected: 5");
			System.out.println("Actual: " + realValue);
			
			venue.reset();
			int secondValue = venue.getValue();
			
			for (int t = 1; t <= 3; t++)
			{
				venue.click();
			}
			secondValue = venue.getValue();
			for (int u =1; u <=4; u++)
			{
				venue.unclick();
			}
			secondValue = venue.getValue();
			System.out.println("Expected: -1");
			System.out.println("Actual: "+ secondValue);
			
	}
}
