package DataType;


public class UnicodeExample
{
	public static void main(String[] args) {
        String sigma = "\u03A3"; // (Σ)
        String cap = "\u005E"; // (^)
        String GraveAcent = "\u0060"; // (`)
        String copyright = "\u00A9 "; // (©)
 
        System.out.println("Unicode character for sigma: " + sigma);
        System.out.println("Unicode character for cap: " + cap);
        System.out.println("Unicode character for backtick: " + GraveAcent);
        System.out.println("Unicode character for copyright: " + copyright);
    }
}

