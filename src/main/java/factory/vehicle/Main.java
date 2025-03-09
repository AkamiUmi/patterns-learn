package factory.vehicle;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(1);
        Vehicle pVehicle = client.getVehicle();
        if (pVehicle != null) {
            pVehicle.printVehicle();
        }
        client.cleanup();
    }
}
