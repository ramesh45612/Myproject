package com.bontec.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

public class Consumer  implements Runnable{
	
	/*
	 * Consume Elements form data structure. Wait if data structure is empty. 
	 * Write sum of numbers present in one row of file into other file
	 * 
	 * Sample output 1 + 4 + 6 + 9 = 20
	 */
	
	private final BlockingQueue sharedQueue;

	
    public Consumer (BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }
	
	
	@Override
	public void run() {
		try {       
				while(true){
				System.out.println(sharedQueue.take());
			
				
			} 
        	}
		catch (Exception e) {
			e.printStackTrace();
			}
	}
}