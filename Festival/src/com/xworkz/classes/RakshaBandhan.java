package com.xworkz.classes;

import com.xworkz.interfaces.Festival;

public class RakshaBandhan implements Festival{

	@Override
	public void celebrate() {
		System.out.println("Celebrating Rakshbandhan");
		
	}

	@Override
	public void doPooja() {
		System.out.println("Raksha Bandhan");
		
	}

}
