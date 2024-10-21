package entities;

public final class ImportedProductHeranca extends ProductHeranca {
	private Double customsFee;
	
	public ImportedProductHeranca() {
		super();
	}
	
	public ImportedProductHeranca(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}


	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice() {
		return getPrice() + customsFee;
	}

	@Override
	public String priceTag() {
		return getName() + " R$ " + String.format("%.2f", totalPrice())+  " (Customs fee: R$" + String.format("%.2f", customsFee)+ ")";
	}

}
