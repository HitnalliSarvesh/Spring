package com.xworkz.classes;

import com.xworkz.interfaces.Festival;

public class GaneshChaturthi implements Festival{

	@Override
	public void celebrate() {
		System.out.println("Celebrating Ganesh Chaturthi");
		
	}

	@Override
	public void doPooja() {
		System.out.println("Ganesh Chaturthi");
		
	}

}
