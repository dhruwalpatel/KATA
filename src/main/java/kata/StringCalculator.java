package kata;

public class StringCalculator {
	public static int add(String numbers) {
		int total = 0;
		if(null == numbers || numbers.isEmpty())
		{
			return total;
		}
		String[] nums = numbers.split(",|\n");
        for (String item : nums) {
            int num = Integer.parseInt(item);
            total += num;            
        } 
		return total;
		
	}
}