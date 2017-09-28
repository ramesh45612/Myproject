package com.ram.enableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
public class Task {
	 @Scheduled(fixedRate=2000)
	public void doTask(){
	System.out.println("this task is running from Task");	
}
}