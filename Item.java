public class Item {

  private String name;
  private Integer amount;
  private float price;
  private float totalPrice;

  private void calcTotalPrice() {
	  this.totalPrice = this.price * this.amount;
  }
  public void setName(String name) {
	  this.name = name;
  }
  public void setAmount(Integer amount) {
	  this.amount = amount;
	  this.calcTotalPrice();
  }
  public void setPrice(float price) {
	  this.price = price;
  }
  public String getName() {
	  return this.name;
  }
  public Integer getAmount() {
	  return this.amount;
  }
  public float getPrice() {
	  return this.price;
  }
  public float getTotalPrice() {
	  return this.totalPrice;
  }
  public void displayDetails() {
	  System.out.println("Itme name is "+this.name+", and the amount is "+this.amount+", and the price is "+this.totalPrice);
  }
}