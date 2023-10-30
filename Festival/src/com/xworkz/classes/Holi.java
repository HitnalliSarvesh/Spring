package com.xworkz.classes;

import com.xworkz.interfaces.Festival;

public class Holi implements Festival{

	@Override
	public void celebrate() {
		System.out.println("Celebrating Holi");
		
	}

	@Override
	public void doPooja() {
		System.out.println("Play Holi");
		
	}

}
