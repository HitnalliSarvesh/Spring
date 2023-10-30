package com.xworkz.classes;

import com.xworkz.interfaces.Festival;

public class Diwali implements Festival{

	@Override
	public void celebrate() {
		System.out.println("Celebrating Diwali");
		
	}

	@Override
	public void doPooja() {
		System.out.println("Diwali");
		
	}

}
