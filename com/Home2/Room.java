package com.Home2;
import static java.lang.System.*;
import java.util.*;
import java.text.*;



public class Room {
	private int guests;
	private double rate;
	boolean smoking;
	boolean vacancy;
	private int floor;
	private static NumberFormat currency = 
			NumberFormat.getCurrencyInstance();
	
	public void readRoom(Scanner diskScanner) {
		guests = diskScanner.nextInt();
		rate = diskScanner.nextDouble();
		smoking = diskScanner.nextBoolean();
		vacancy = diskScanner.nextBoolean();
		floor = diskScanner.nextInt();
	}
	
	public void writeRoom() {
		out.print(guests);
		out.print("\t");
		out.print(currency.format(rate));
		out.print("\t");
		out.print(smoking ? "\tyes" : "\tno");
		out.print(vacancy ? "\t\tyes" : "\t\tno");
		out.print("\t\t");
		out.println(floor);
	}
}
                                                                                                                   