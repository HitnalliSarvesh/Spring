package com.xworkz.classes;

import com.xworkz.interfaces.Festival;

public class Ugadi implements Festival{

	@Override
	public void celebrate() {
		System.out.println("Celebrating Ugadi");
		
	}

	@Override
	public void doPooja() {
		System.out.println("Ugadi");
		
	}

}
