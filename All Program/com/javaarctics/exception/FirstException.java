package com.javaarctics.exception;


public class FirstException
{
//	public static void main(String[] args) 
//	{
//		int a = 10/0;
//		String s="123";  
//		int i=Integer.parseInt(s);
//		try {
//		int a = 10/0;
//			String s = null;
//			System.out.println(s.length());	
			
//		}
//		catch(Exception e) {

//			System.out.println(e);
//		}
//		finally {
//			System.out.println("This is finally block");
//		}
//	}
	
	public static void main(String[] args) {  
		int a[] = {1,2,3,0};
        try{    
//             int a[]=new int[5];
        	int r = a[1]/a[3];
        	System.out.println(r);
        	System.out.println(a[5]);
             
            
//             String s = null;
//             System.out.println(s.length());
//             System.out.println(a[10]);
             
            }    
            
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println();  
               } 
        catch(ArithmeticException e)  
        {  
//         System.out.println(e.getMessage());  
        	e.printStackTrace();
        }   
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");  
		
		
		
	}  
}
