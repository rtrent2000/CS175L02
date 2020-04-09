package Counter;

public class CounterTest2 {

	public static void main(String[] args) {
		Counter2 anotherVenue = new Counter2();
		int realValue = anotherVenue.getValue();
		
		anotherVenue.clickMany(10);
		realValue = anotherVenue.getValue();
		
		anotherVenue.unclickMany(5);
		realValue = anotherVenue.getValue();
		
		System.out.println("Expected: 5");
		System.out.println("Actual: " + realValue);
		
		anotherVenue.reset();
		
		int secondValue = anotherVenue.getValue();
		
		anotherVenue.clickMany(3);
		secondValue = anotherVenue.getValue();
		
		anotherVenue.unclickMany(4);
		secondValue = anotherVenue.getValue();
		
		System.out.println("Expected: -1");
		System.out.println("Actual: " + secondValue);
		
	}

}
