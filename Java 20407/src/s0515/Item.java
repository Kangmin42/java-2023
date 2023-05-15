package s0515;

public class Item {
	String name;
	int price;
	Item(String str){
		name="제품명:"+str;
	}
	Item(String name,int price)
	{
		this.name="제품명:"+name;
		this.price=price*1000;
	}
	void printItemInfo(){
		System.out.println(name);
		System.out.println("출고가:"+price);
		System.out.println("");
	}
	
}
