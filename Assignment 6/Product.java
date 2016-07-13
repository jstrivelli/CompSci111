public class Product
{
	private String productName;
	private double price;
	private int quantity;

	public Product(String a, double price, int quantity)
	{
		productName = a;
		this.price = price;
		this.quantity = quantity;
	}
	public void setPrice(double a)
	{
		price = a;
	}
	public void setProduct(String a)
	{
		productName = a;
	}
	public void setQuantity(int a)
	{
		quantity = a;
	}
	public double getPrice()
	{
		return price;
	}
	public String getProductName()
	{
		return productName;
	}
	public int getQuantity()
	{
		return quantity;
	}
}