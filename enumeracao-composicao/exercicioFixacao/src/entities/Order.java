package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStaus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStaus status;
	private Client client;
	
	private List<OrdemItem> items = new ArrayList<>();
	
	public Order() {}
	
	public Order(Date moment, OrderStaus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStaus getStatus() {
		return status;
	}

	public void setStatus(OrderStaus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void addItem(OrdemItem item) {
		items.add(item);
	}
	
	public void removeItem(OrdemItem item) {
		items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrdemItem i : items) {
			sum += i.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("ORDER SUMARY \n");
	sb.append("Order moment ");
	sb.append(sdf.format(moment)+"\n");
	sb.append("Order status ");
	sb.append(status +"\n");
	sb.append("Client ");
	sb.append(client+"\n");
	sb.append("Ordem Itens \n");
	
	for(OrdemItem x : items) {
		sb.append(x.toString()+"\n");
	}
	sb.append("Total price: $ ");
	sb.append(String.format("%.2f", total()));
	
		return sb.toString();
	}
	
}
