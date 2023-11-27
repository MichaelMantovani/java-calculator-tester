package org.java;

public class Ticket {
	private double km;
	private int age;
	private final double priceKm = 0.21;
	private final double minorsDiscount = 0.2;
	private final double elderlyDiscount = 0.4;
	
	public Ticket() {}

	public Ticket(double km, int age) throws Exception {
		setAge(age);
		setKm(km);
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) throws Exception {
		if(km <= 0)
			throw new Exception("Devi percorrere almeno un km");
		this.km = km;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age <= 0)
			throw new Exception("Inserire un'età valida");
		this.age = age;
	}

	public double getPrice() {
		double price = km * priceKm;
		double discountedPrice = price;
		if (this.age < 18) {
			discountedPrice = price - (price * minorsDiscount);
		} else if (this.age > 65) {
			discountedPrice = price - (price * elderlyDiscount);
		} else
			discountedPrice = price;
		return discountedPrice;
	}
}
