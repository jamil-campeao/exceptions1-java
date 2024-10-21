package entities;

public class OrderItemComposicao {
	private Integer quantity;
	private Double price;
	private ProductComposicao product;
	
	public OrderItemComposicao() {
		
	}
	
	public OrderItemComposicao(Integer quantity, Double price, ProductComposicao product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double subTotal() {
		return quantity * price;
	}

	public ProductComposicao getProduct() {
		return product;
	}
	
	@Override
	public String toString() {
		return getProduct().getName() +  ", " + "R$" + String.format("%.2f", price) + ", " + "Quantidade: " + quantity + ", " +  
		"Subtotal: R$" + String.format("%.2f", subTotal());
	}


}
