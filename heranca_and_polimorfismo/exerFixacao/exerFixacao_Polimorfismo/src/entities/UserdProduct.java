package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserdProduct extends Product {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufatureDate;
	
	public UserdProduct() {}

	public UserdProduct(String name, Double price, Date manufatureDate) {
		super(name, price);
		this.manufatureDate = manufatureDate;
	}

	public Date getManufatureDate() {
		return manufatureDate;
	}

	public void setManufatureDate(Date manufatureDate) {
		this.manufatureDate = manufatureDate;
	}

	@Override
	public String priceTag() {
		return getName()+" (used) $"+getPrice()+" (Manufacture: "+sdf.format(manufatureDate)+")";
	}

}
