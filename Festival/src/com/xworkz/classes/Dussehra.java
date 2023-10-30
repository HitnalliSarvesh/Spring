package com.xworkz.classes;

import com.xworkz.interfaces.Festival;

public class Dussehra implements Festival{

	@Override
	public void celebrate() {
		System.out.println("Celebrating Dussehra");
		
	}

	@Override
	public void doPooja() {
		System.out.println("Dussehra");
		
	}

}
