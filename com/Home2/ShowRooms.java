package com.Home2;

import java.io.*;

import static java.lang.System.out;

import java.util.*;

public class ShowRooms {

	public static void main(String args[])
									throws IOException {
		String Home = System.getProperty("user.home");
		Room rooms[];
		rooms = new Room[10];
		String Ver = ("0.3.3");
		String Hotel = ("Holiday Inn");
		
		Scanner diskScanner = 
				new Scanner(new File(Home + "\\Desktop\\SysHotel\\Sys\\HOME2RoomList.txt"));
		
		for (int roomNum = 0; roomNum < 10; roomNum++) {
			rooms[roomNum] = new Room();
			rooms[roomNum].readRoom(diskScanner);
		}
		out.println("Coded By Elemental");
		out.println(Hotel + " System " + Ver);
		out.println("Room\tGuests\tRate\t\tSmoking?\tVacancy?\tFloor");
		for (int roomNum = 0; roomNum < 10; roomNum++) {
			out.print(roomNum);
			out.print("\t");
			rooms[roomNum].writeRoom();
		}
		diskScanner.close();
	}
	
	
}
