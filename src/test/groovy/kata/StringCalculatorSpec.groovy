package kata

import spock.lang.Specification

/**
 * @author Dhruwal Patel
 */
class StringCalculatorSpec extends Specification{
		
	def'API to calculate string numbers'(){
				
			expect:
			result == StringCalculator.add(numbers)
			where:
			numbers               ||  result
			 ""  			      ||  0
			"1"					  ||  1
			"1,2"				  ||  3		
			"1,2,3"				  ||  6
			"1\n2"			      ||  3
			"1\n2,3"			  ||  6
	} 

}
