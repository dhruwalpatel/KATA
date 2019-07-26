package kata;

public class StringCalculator {
	public static int add(String numbers) {
		int total = 0;
		if(null == numbers || numbers.isEmpty())
		{
			return total;
		}
		if(numbers.length() == 1)
		{
			 total = Integer.parseInt(numbers);
		}
		return total;
		
	}
}