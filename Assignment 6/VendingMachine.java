public class VendingMachine
{
	private int numslots;
	private int maxperslot;
	private double cash;
	private int [] productCount;
	private String [] productName;
	private double [] productPrice;


	public VendingMachine(int numslots, int maxperslot, double cash)
	{
		//Setting the initial fields
		this.numslots = numslots;
		this.maxperslot = maxperslot;
		this.cash = cash;

		//Intializing the arrays and they are all parallel
		productCount = new int[numslots];
		productName = new String[numslots];
		productPrice = new double[numslots];
	}
	public void setProduct(int slot, String product, double price)
	{
		if(validSlot(slot))
		{
			productName[slot] = product;
			productPrice[slot] = price;
		}	

	}
	public boolean validSlot(int slot)
	{
		if(slot < 0 || slot > (numslots -1))
		{
			return false;
		}	
		return true;
	}
	public int findSlot(String product)
	{
		int slot = -1;
		for(int a = 0; a < numslots; a++)
		{
			if(productName[a].equals(product))
				slot = a;
		}	
			return slot;
	}
	public void restockProduct(String product, int quantity)
	{
			int slot = findSlot(product);
			if(validSlot(slot))
				productCount[slot] = quantity;
			
	}
	public double getCashOnHand()
	{
		return cash;
	}
	public int getQuantity(int slot)
	{
		if(validSlot(slot))
			return productCount[slot];	

		return -1;
	}
	public int getQuantity(String product)
	{
		int slot = findSlot(product);
		if(validSlot(slot))
			return productCount[slot];
		return -1;
	}
	public boolean buyItem(int slot)
	{
		if(validSlot(slot) && productCount[slot] >0)
		{
			cash += productPrice[slot];
			productCount[slot]--;
			return true;
		}	
		return false;
	}




		public static void main(String[] args)
		{
		boolean success;

		// vending machine w/ 20 slots, 10 items maximum per slot, $5 cash on hand
		VendingMachine v = new VendingMachine(20, 10, 5.00);
		v.setProduct(0, "Cheesy Poofs", 0.75);
		v.setProduct(1, "Red Bull", 1.25);
		v.setProduct(2, "Cheesy Poofs", 0.75);
		v.restockProduct("Cheesy Poofs", 8);
		v.restockProduct("Red Bull", 7);
		v.restockProduct("Cheesy Poofs", 5); // 2 more go into slot 0, remaining 3 into slot 2
		
		success = v.buyItem(0);
		System.out.println(success); // should print "true"

		System.out.println(v.getCashOnHand()); // should print "5.75"
		System.out.println(v.getQuantity(0)); // should print "9"
		System.out.println(v.getQuantity("Cheesy Poofs")); // should print "12"
		}


}