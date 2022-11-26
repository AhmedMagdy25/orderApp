import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Order {

	private User user ;
	private String date = new Date().toString();
	private ArrayList<Item> itemsList = new ArrayList<Item>();
	private Integer itemsNum = 1;
	private String orderStatus = "ok";
	private float orderPrice = 0;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void addItme(Item item) {
		if(this.itemsNum > 5) 
			this.orderStatus = "you can not add more than 10 items in an Order";
		else {
			this.itemsList.add(item);
			++this.itemsNum;
		}
	}
	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void calcOrderPrice() {
	  this.itemsList.forEach((item) -> this.orderPrice += item.getTotalPrice());
	}
	public List<Item> getItems(){
	  return this.itemsList;
	}
	public float getOrderPrice() {
	  return this.orderPrice;
	}
	public void displayOrderInvoice() {
		System.out.println("the order date is: "+this.date);
		System.out.println("the user id is "+ user.getId()+", and the name is "+ user.getName()+", and the phone number is "+user.getPhone());
		this.getItems().forEach(item -> item.displayDetails());
		System.out.println("The order total price is "+this.getOrderPrice());
	}

}