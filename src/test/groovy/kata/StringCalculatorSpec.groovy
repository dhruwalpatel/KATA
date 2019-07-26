package kata

import spock.lang.Specification

/**
 * @author Dhruwal Patel
 */
class StringCalculatorSpec extends Specification{
		
	def'API to calculate string numbers'(){
		given: 'Empty string'
		  def numbers = "";
		when: 'StringCalculator.add(numbers) is called'
			String retVal = StringCalculator.add(numbers)
		then: 'It should return 0'
			retVal == "0";
	}

}
