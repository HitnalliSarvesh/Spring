package com.xworkz.classes;

import com.xworkz.interfaces.Festival;

public class RamNavami implements Festival{

	@Override
	public void celebrate() {
		System.out.println("Celebrating Ram Navami");
		
	}

	@Override
	public void doPooja() {
		System.out.println("Ram navami");
		
	}

}
