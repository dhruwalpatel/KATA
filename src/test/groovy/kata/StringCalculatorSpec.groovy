package kata



/**
 * @author Dhruwal Patel
 */
class StringCalculatorSpec extends Specification{
		
	def'API to get name'(){
		given: 'Http Servlet Request object'
			HttpServletRequest request=Stub()
			request.getParameter("name") >> "test"
		when: 'demo.getName is called'
			String retVal=demo.getName(request)
		then: 'It should return name'
			retVal=='test'
	}

}
