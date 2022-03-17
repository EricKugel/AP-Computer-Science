public class VariousRecVehicleTester {
  public static void main(String[] args) {
    RecVehicle  rv1 = new RecVehicle("5th Wheel", 46995.99, 2);
    Boat boat1 = new Boat("Fishing Boat", 35185.99, 3, 175);

    System.out.println("RecVehicle cost: " + rv1.getCost());
    System.out.println("Boat cost: " + boat1.getCost()); // Note: this is using the RecVehicle method
    System.out.println("RecVehicle toString: " + rv1);
    System.out.println("Boat toString: " + boat1); // Note: this is using the overriding Boat method
  }
}