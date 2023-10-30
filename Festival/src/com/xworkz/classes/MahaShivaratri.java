package com.xworkz.classes;

import com.xworkz.interfaces.Festival;

public class MahaShivaratri implements Festival{

	@Override
	public void celebrate() {
		System.out.println("Celebrating MahaShivaratri");
		
	}

	@Override
	public void doPooja() {
		System.out.println("Maha Shivaratri");
		
	}

}
