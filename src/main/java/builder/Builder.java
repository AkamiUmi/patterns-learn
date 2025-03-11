package builder;

import builder.car.CarType;
import builder.component.Engine;
import builder.component.GPSNavigator;
import builder.component.Transmission;
import builder.component.TripComputer;

public interface Builder {
  void setCarType(CarType type);
  void setSeats(int seats);
  void setEngine(Engine engine);
  void setTransmission(Transmission transmission);
  void setTripComputer(TripComputer tripComputer);
  void setGPSNavigator(GPSNavigator gpsNavigator);
}
