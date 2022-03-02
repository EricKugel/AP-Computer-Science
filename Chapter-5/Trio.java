public class Trio implements MenuItem {
  private Sandwich sandwich;
  private Salad salad;
  private Drink drink;
  
  private String name;
  private double price;
  
  public Trio(Sandwich sandwich, Salad salad, Drink drink) {
    this.sandwich = sandwich;
    this.salad = salad;
    this.drink = drink;
    
    this.name = sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    double[] prices = {sandwich.getPrice(), salad.getPrice(), drink.getPrice()};
    double lowestPrice = 100000000;
    double sum = 0.0;
    for (double price : prices) {
        sum += price;
    }
    for (double price : prices) {
      if (price < lowestPrice) {
        lowestPrice = price;
      }
    }
    sum -= lowestPrice;
    this.price = sum;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }
}