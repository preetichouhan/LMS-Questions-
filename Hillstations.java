package com.hillstation;

class HillStation {

	public void location() {
		System.out.println("One of the famous Hill area"); 
		
	}
	public void famousFor() {
		System.out.println("famous for hill area");
	}
}

class Gulmarg extends HillStation{

	public void location()
	{
		System.out.println("It is located in Jammu and KAshmir");
		
	}
	public void famousFor() {
		System.out.println("famous for beauty and adventures");
	}
}

class Manali extends HillStation{

	public void location() {
		System.out.println("Manali is located in Himachal Pradesh");
		
	}
	public void famousFor() {
		System.out.println("famous for hill and forest"); 
	}
}


public class Masoori extends HillStation {

	public void location() {
		System.out.println("It is called the queen of hills");
		
	}
	public void famousFor() {
		System.out.println("Famous for Weekend gateway");
	}
}


public class Hillstations {

	public static void main(String [] args) {
		HillStation h1 = new Manali();
		HillStation h2 = new Gulmarg();
		HillStation h3 = new Masoori();
		
		System.out.println("Manali.......");
		h1.location();
		h1.famousFor();
		
		System.out.println("Gulmarg........");
		h2.location();
		h2.famousFor();
		
		System.out.println("Masoori");
		h3.location();
		h3.famousFor();
	}
	
}
