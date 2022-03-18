public class ATV extends RecVehicle {
    private String transmission;

    public ATV(String name, double cost, int inventory, String transmission) {
        super(name, cost, inventory);
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    @Override
    public String toString() {
        String output = super.toString();
        output += ", transmission: " + transmission;
        return output;
    }
}
