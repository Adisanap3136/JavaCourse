package principleOfOop.Shrikantsirinheritance;

class Transportation {
    private String mode, fuelType;
    int capacity, speed;

    public Transportation() {
        super();
    }

    public Transportation(String mode, String fuelType, int capacity, int speed) {
        this.mode = mode;
        this.fuelType = fuelType;
        this.capacity = capacity;
        this.speed = speed;
    }

    public void displayTransport() {
        System.out.println("Transportation Details");
        System.out.println("Mode: " + mode + ", Fuel Type: " + fuelType + ", Capacity: " + capacity + ", Speed: " + speed + " km/h");
    }
}

class Roadways extends Transportation {
    private String roadType;
    private int tollStations;

    public Roadways() {
        super();
    }

    public Roadways(String roadType, int tollStations,
                    String mode, String fuelType, int capacity, int speed) {
        super(mode, fuelType, capacity, speed);
        this.roadType = roadType;
        this.tollStations = tollStations;
    }

    public void displayRoadways() {
        System.out.println("Roadways Specific Details");
        System.out.println("Road Type: " + roadType + ", Toll Stations: " + tollStations);
    }
}

public class SingleLevel3 {
    public static void main(String[] args) {
        Roadways r1 = new Roadways("Highway", 5, "Land", "Diesel", 50, 100);
        r1.displayTransport();
        r1.displayRoadways();
    }
}

