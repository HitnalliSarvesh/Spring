package com.xworkz.classes;

import com.xworkz.interfaces.Festival;

public class Sankranti implements Festival{

	@Override
	public void celebrate() {
		System.out.println("Celebrating Sankranti");
		
	}

	@Override
	public void doPooja() {
		System.out.println("Flying Kites");
		
	}

}
