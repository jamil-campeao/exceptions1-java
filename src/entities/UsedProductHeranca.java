package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProductHeranca extends ProductHeranca {
	private Date manufactureDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProductHeranca() {
		super();
	}

	public UsedProductHeranca(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() + " (used) R$ " + String.format("%.2f", getPrice()) + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
	}
	
	

}
