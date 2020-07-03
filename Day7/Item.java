
public class Item
{
	String itemid;
	String name;
	int cost;
	
	public Item (String itemid, String name, int cost)
	{
		this.itemid=itemid;
		this.name=name;
		this.cost=cost;
		
	}
    public void disp() {
    	System.out.println(this.itemid+"\t"+this.name+"\t"+this.cost);
    }
	public static void main(String[] args) {
	   
		Item ak=new Item("152","jorg",1000);
		ak.disp();

	}

}
