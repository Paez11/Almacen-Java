package model;

import interfaces.IDrink;

public class Soda implements IDrink{
	private Float price;
	private String name;
	
	public Soda() {
		this(0f,"");
	}
	public Soda(Float price, String name) {
		this.price = price;
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public Float getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		
	}

	@Override
	public void setPrice(Float price) {
		// TODO Auto-generated method stub
		this.price=price;
		
	}
	@Override
	public String toString() {
		return "Soda [price=" + price + ", name=" + name + "]";
	}
	
}
