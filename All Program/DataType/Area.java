package DataType;
// Compute the area of a circle

public class Area
{
	public static void main(String[] args)
	{

		final double pi;
		double r, area;
		r = 10.8; // radius of circle
		pi = 3.14; // pi, approximately
		area = pi * r * r;
		
		System.out.println("Area of circle is: " + area);
	}
}
