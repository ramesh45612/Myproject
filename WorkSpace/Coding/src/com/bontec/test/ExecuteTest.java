package com.bontec.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ExecuteTest {

	
	public static void main(String args[]) throws Exception{
		
	   BlockingQueue sharedQueue = new LinkedBlockingQueue();

	   Thread prod = new Thread(new Producer(sharedQueue));
	   Thread cons = new Thread(new Consumer(sharedQueue));
		prod.start();
		cons.start();
	}	
}
