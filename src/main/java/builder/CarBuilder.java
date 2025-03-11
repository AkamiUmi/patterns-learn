package builder;

import builder.car.Car;
import builder.car.CarType;
import builder.component.Engine;
import builder.component.GPSNavigator;
import builder.component.Transmission;
import builder.component.TripComputer;

public class CarBuilder implements Builder{
  private CarType type;
  private Engine engine;
  private int seats;
  private Transmission transmission;
  private GPSNavigator gpsNavigator;
  private TripComputer tripComputer;
  @Override
  public void setCarType(CarType type) {
    this.type = type;
  }

  @Override
  public void setSeats(int seats) {
    this.seats = seats;
  }

  @Override
  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  @Override
  public void setTransmission(Transmission transmission) {
    this.transmission = transmission;
  }

  @Override
  public void setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
  }

  @Override
  public void setGPSNavigator(GPSNavigator gpsNavigator) {
    this.gpsNavigator = gpsNavigator;
  }

  public Car getResult() {
    return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
  }
}
