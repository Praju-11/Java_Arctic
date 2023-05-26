/*
Write a menu program to insert, update, delete and search elements in the arrary. Use switch case in main function to display menu to user.
eg. "Press 1 to insert, 2 to update, 3 to delete, 4 to search, 5 to display, 6 to exit" 
*/
package ArrayBasic;

import java.util.Scanner;
class Array_Assign{
	public static void main(String args[]){
		int press, elem, i;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the numbers of Element in an Array :");
		elem = scan.nextInt();
		
		int arr[] = new int[50];
		System.out.println("Enter the element in array");
		
		for(i=0; i<elem; i++){
			arr[i] = scan.nextInt();
		}
		
		int insert,index,update,position,search;
		do {
			
		System.out.println("Enter 1 to insert, Enter 2 to update, Enter 3 to delete, Enter 4 to search, Enter 5 to Exit");
		press = scan.nextInt();
		switch(press){
		
			case 1:
			System.out.println("Enter the element to be inserted in the array");
			insert = scan.nextInt();
			arr[elem] =  insert;
			elem ++;
			break;
			
			case 2:
			System.out.println("Enter the element to place in the Array:");
			update = scan.nextInt();
			System.out.println("Enter the index No for Elment");
			index=scan.nextInt();
			arr[index] = update;
			break;
			
			case 3:
			System.out.println("Enter the position of the number which is to be deleted ");
			position = scan.nextInt();
			
			for(i=position; i<elem-1;i++){
				arr[i]=arr[i+1];
			}
			elem--;
			 break; 
			
			case 4:
			System.out.println("Enter the number to search Array: ");
			search = scan.nextInt();

			for(i=0; i<arr.length;i++){
				if(arr[i]==search){
					System.out.println(search+" is present in the location "+(i));
				break;
				}
			}
			if(i == arr.length){
				System.out.println(search+" is not present in the location");
			}
			break;
			
			case 5:
				System.out.println( " The Element Array are:  ");
				for(i=0; i<elem;i++)
				{
					System.out.println(arr[i]);
				
				}
				break;
				
			case 6:
				
				System.exit(0);
				
				
		}
		
		}while(press != 6);
				
	}
}
	