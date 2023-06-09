package com.javaarctics.multithreading;

import java.util.Random;
/*
class MyCounter{
	private int threadNo;
	
	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	public void countMe() {
		for(int i=1; i<=10;i++) {
			System.out.println("The value of i is: " + i +" and the thrad number is: " + threadNo);
		}
	}
	
}

public class App
{
	public static void main(String[] args)
	{
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		
		counter1.countMe();
		System.out.println("***************");
		counter2.countMe();
	}
}

*/

/*
class MyCounter extends Thread{
	private int threadNo;
	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	public void run() {
		countMe();
	}
	public void countMe() {
		for(int i=1; i<=10;i++) {
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("The value of i is: " + i +" and the thrad number is: " + threadNo);
		}
	}
}

public class App
{
	public static void main(String[] args) throws InterruptedException
	{
		MyCounter counter1 = new MyCounter(1);
		MyCounter counter2 = new MyCounter(2);
		
		long startTime = System.currentTimeMillis();
	
		
		
		//counter1.countMe();
//		counter1.run(); // Run should be called by JVM
		counter1.start();
		System.out.println("***************");
//		counter2.countMe(); 
//		counter2.run(); // Run should be called by JVM
		counter2.start();
		Thread.sleep(5000);
		long endTime = System.currentTimeMillis();
		System.out.println("Total time require to process: "+ (endTime - startTime));
	}
}
*/


class MyCounter implements Runnable {
	private int threadNo;
	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	@Override
	public void run()
	{
		Random random = new Random();
		System.out.println(random.nextInt(10));
		for(int i=0; i<=9; i++) {
			try
			{

				Thread.sleep(random.nextInt(500));

			} catch (InterruptedException e)
			{

				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			System.out.println("The value if i is "+i+" and the thread number is: "+threadNo);
		}
	}
	
}


public class App
{
	public static void main(String[] args) throws InterruptedException
	{
		/*
		
		Thread thread1 = new Thread(new MyCounter(1));
		Thread thread2 = new Thread(new MyCounter(2));
	
		thread1.start();
		thread2.start();
		
		*/
		
		//only once
		Thread t = new Thread(new Runnable() {

			@Override
			public void run()
			{
				for(int i=1; i<10; i++) {
					try
					{

						Thread.sleep(1000);

					} catch (InterruptedException e)
					{

						// TODO Auto-generated catch block
						e.printStackTrace();

					}
					System.out.println(i);
				}
			}
			
		});
		t.start();
		;
	}
}

