
public class Product {

	public String name;
	public double price;
	public int quantity;

	public Product(String name, double price, int quantity) { //3 PARAMETROS
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product() {}	//0 PARAMETROS
 
	/* SobreCarga
	 * //É um recurso que uma classe possui de oferecer mais de uma operação com o
	 * mesmo nome, porém com diferentes listas de parâmetros.
	 * 
	 * VEJA NO MAIN HÁ 3 MANEIRAS DIFERENTES DE CHAMAR O OBJ (0, 2, 3) PARAMETROS
	 */
	public Product(String name, double price) { //2 PARAMETROS 
		this.name = name;
		this.price = price;
	}

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