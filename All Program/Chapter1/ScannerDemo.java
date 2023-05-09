package Chapter1;
import java.util.Scanner;

public class ScannerDemo
{
	public static void main(String args[]) {
//        char first1 = '\u002F';
//        System.out.println(first1);
//        char second2 = '\u003F';
//        System.out.println(second2);
//        char third3 = '\u0031';
//        System.out.println(third3);
//        char fourth4 = '\u007E';
//        System.out.println(fourth4);
//        char fifth5 = '\u0024';
//        System.out.println(fifth5);
//        char sixth6 = '\u0061';
//        System.out.println(sixth6);
//        char seventh7 = '\u0041';
//        System.out.println(seventh7);
		
		
//		int a = 10;
//		System.out.println(a++);
//		System.out.println(++a);
		
//		String p = "This is a java";
//		System.out.println(p);


		 String sampleText = 
			        " Programmerslove Java!\n"
			      + " User input with Java is so easy!\n"
			      + " Just use the Scanner class.\n"
			      + " Or maybe the Console or JOptionPane?\n";
		 
		 Scanner sc = new Scanner(sampleText);
		 System.out.println("First call : " + sc.nextLine());
		    System.out.println("Second call: " + sc.nextLine());
//		    System.out.println("Third call : " + scanner.next());
//		    System.out.println("Fourth call: " + scanner.next());

		    sc.close();

		
	}
}













