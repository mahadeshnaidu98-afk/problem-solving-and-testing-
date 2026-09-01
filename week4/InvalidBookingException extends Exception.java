import java.util.*;

class InvalidBookingException extends Exception {
    public InvalidBookingException(String message) {
        super(message);
    }
}

class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }
}

class Rider {
    String name;

    Rider(String name) {
        this.name = name;
    }
}

class Vehicle {
    String vehicleNumber;

    Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}

abstract class Trip {
    protected double distance;

    Trip(double distance) throws InvalidBookingException {
        if (distance <= 0) {
            throw new InvalidBookingException("Invalid distance");
        }
        this.distance = distance;
    }

    abstract double calculateFare();
}

class BikeTrip extends Trip {
    BikeTrip(double distance) throws InvalidBookingException {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 5;
    }
}

class AutoTrip extends Trip {
    AutoTrip(double distance) throws InvalidBookingException {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 12;
    }
}

class CabTrip extends Trip {
    CabTrip(double distance) throws InvalidBookingException {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 12;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();

            if (line.isEmpty()) {
                i--;
                continue;
            }

            String[] parts = line.split("\\s+");

            String rideType = parts[0];
            double distance = Double.parseDouble(parts[1]);

            try {
                Trip trip;

                if (rideType.equalsIgnoreCase("Bike")) {
                    trip = new BikeTrip(distance);
                } else if (rideType.equalsIgnoreCase("Auto")) {
                    trip = new AutoTrip(distance);
                } else if (rideType.equalsIgnoreCase("Cab")) {
                    trip = new CabTrip(distance);
                } else {
                    throw new InvalidBookingException("Invalid ride type");
                }

                System.out.println((int) trip.calculateFare());

            } catch (InvalidBookingException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}