package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;
import entities.enums.OrderStatus2;

public class OrderComposicao {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date moment;
	private OrderStatus2 status;
	
	private ClientComposicao client;
	
	private List<OrderItemComposicao> items = new ArrayList<>();


	public OrderComposicao(Date dateHour, OrderStatus2 status2, ClientComposicao client) {
		this.moment = dateHour;
		this.status = status2;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus2 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus2 status) {
		this.status = status;
	}
	
	public void addItem(OrderItemComposicao item) {
		this.items.add(item);
	}
	
	public void removeItem(OrderItemComposicao item) {
		this.items.remove(item);
	}	
	
	public double total() {
		double soma = 0;
		for(OrderItemComposicao oit : items) {
			soma += oit.subTotal();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Data/Hora do pedido: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Situação do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(client + "\n");
		sb.append("Itens do pedido: \n");
		for (OrderItemComposicao oic : items) {
			sb.append(oic.toString() + "\n");
		}
		sb.append("Total do Pedido: R$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
		}
	

}
