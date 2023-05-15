package s0515;

public class ItemMain {

	public static void main(String[] args) {
		Item phone=new Item("iphone");
		phone.price=124;
		phone.printItemInfo();
		Item phone2=new Item("iphone 15",1500);
		phone2.printItemInfo();
		Item ram=new Item("DDR5",200);
		ram.printItemInfo();
	}

}
