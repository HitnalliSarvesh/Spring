package com.xworkz.classes;

import com.xworkz.interfaces.Festival;

public class Navaratri implements Festival{

	@Override
	public void celebrate() {
		System.out.println("Celebratig Navaratri");
		
	}

	@Override
	public void doPooja() {
		System.out.println("Navaratri");
		
	}

}
