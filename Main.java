import java.util.UUID;

class Main{
	
	public static void main(String[] args) {
		
		Item item1 = new Item();
		Item item2 = new Item();
		Item item3 = new Item();
		
		item1.setName("item1");
		item1.setPrice(20);
		
		item2.setName("item2");
		item2.setPrice(50);
		
		item3.setName("item3");
		item3.setPrice(100);
		
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setName("user1");
		user.setPhone(0125344);	
		
		Order order = new Order();
		order.setUser(user);
		
		item1.setAmount(2);
		item2.setAmount(5);
		item3.setAmount(1);
		
		order.addItme(item1);
		order.addItme(item2);
		order.addItme(item3);

		if(order.getOrderStatus().equals("ok")) {
			order.calcOrderPrice();
			order.displayOrderInvoice();
		}else {
			System.out.println(order.getOrderStatus());
		}

	}
}