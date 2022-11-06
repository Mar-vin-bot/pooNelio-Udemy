
public class Product {
	
	public String name;
	public double price;
	public int quantity;
	

	
	public Product (String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	// this: é uma referencia para o proprio objeto
	//this.name usa para referenciar o atributo do obj
	//ja o = name é usado para referenciar as parametros do construtor
	//por convenção usa-se o memo nome do atributo no parametro do construtor
	//this.name = name; (esse name, do atributo, é igual ao name do parametro construtor
	

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}