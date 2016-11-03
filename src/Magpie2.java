/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";

		if (statement.toLowerCase().contains("dog") || statement.toLowerCase().contains("cat")) {
			response = "Tell me more about your pets";
		}

		else if (statement.toLowerCase().contains("peavy")) {
            response = "He sounds like a good teacher";
        }

        else if (statement.toLowerCase().contains("meme")) {
            response = "wew lad";
        }

        else if (statement.toLowerCase().contains("trump")) {
            response = "#MAGA";
        }

        else if (statement.toLowerCase().contains("clinton")) {
            response = "#ImWithHer";
        }

		else if (statement.toLowerCase().indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.toLowerCase().indexOf("mother") >= 0
				|| statement.toLowerCase().indexOf("father") >= 0
				|| statement.toLowerCase().indexOf("sister") >= 0
				|| statement.toLowerCase().indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if(statement.trim().length() == 0) {
            response = "Say something, pls.";
        }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4) {
            response = "Memes are fun";
        }
        else if (whichResponse == 5) {
            response = "I'm sorry, but I can't do that.";
        }
        else if (whichResponse == 6) {
            response = "I don't want to talk about that";
        }

		return response;
	}
}
