package DataType;
// Compute  distance light travels using long variable

public class Light
{
	public static void main(String args[]) {
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		// Approximate speed of light in miles per second
		lightspeed = 186000;
		days = 1000;
		seconds = days * 24 * 60 * 60; // Convert to seconds
		distance = lightspeed * seconds; // compute distance
		
		System.out.print("In "+ days);
		System.out.print(" days light will travel about ");
		System.out.print(distance + " miles. ");
		
		
	}

}
