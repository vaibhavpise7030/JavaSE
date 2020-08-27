import java.util.*;

class Order
{
	enum Type
	{
		BUY,SELL;
	}

	private int quantity;
	private double price;
	private Type type;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Order(int quantity, double price, Type type) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.type = type;
	}
	
}
public class First {

	public static void main(String[] args) 
	{
		Order o1= new Order(5,10000,Order.Type.SELL);
		Order o2= new Order(10,15000,Order.Type.BUY);
		Order o3= new Order(15,20000,Order.Type.SELL);
		Order o4= new Order(20,40000,Order.Type.BUY);
		Order o5= new Order(25,50000,Order.Type.SELL);
		
		List<Order> mylist= new ArrayList<Order>();
		mylist.add(o1);
		mylist.add(o2);
		mylist.add(o3);
		mylist.add(o4);
		mylist.add(o5);
		
		System.out.println("SELL Orders: "+mylist.stream().filter((s)-> Order.Type.SELL==s.getType()).count());
        System.out.println("All Orders Price: "+mylist.stream().mapToDouble(s->s.getPrice()).sum());
        System.out.println("Sum Of All Qauntities: "+mylist.stream().mapToInt(s->s.getQuantity()).sum());	
	}

}
