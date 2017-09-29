package com.bontec.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	
	//Define data structure your choice to store Elements
	
	/*	
	 * Read numbers from file and store it in your data structure as object of Element
	 * Stop reading file if there is no space in data structure. Notify consumer if 
	 * new element is available 
	 */  
	
	 private final BlockingQueue sharedQueue;

		    public Producer(BlockingQueue sharedQueue) {
	        this.sharedQueue = sharedQueue;
	    }

	public  void produce() {	
	try{
	
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
	    String strLine;
	    while ((strLine = br.readLine()) != null)   {
	    	String splt[]=strLine.split(" ");
	    	int tot=0;
	    	String label=" ";
	    	for(String s:splt)
	    	{
	    	 tot=tot+Integer.parseInt(s);
	    	 label+=s+"+";
	    	}
	    	label=label.substring(0,label.length()-1);
	    /*	System.out.println("lable"+label);
	    	System.out.println("Total"+tot);
	    */	
	    	sharedQueue.put(label+"="+ tot);
	    	
	 
	    	
	    }
	}
	catch(Exception e)	{
	e.printStackTrace();	
	}
	
	}
	
	
	    
	    @Override
public void run() {

	produce();

	    }
	
}
