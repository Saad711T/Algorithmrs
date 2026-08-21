
// Class for Vehicle with properties wheels and type
public class Vehicle {
    private int wheels;
    private String type;
    

    // Constructor
    public Vehicle (int wheels , String type) {
        this.wheels = wheels;
        this.type = type;

    }

    // Getters and Setters
    // for wheels and type
    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType () {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

@Override
public String toString() {
    return "Vehicle [Wheels=" + wheels + ", Type=" + type + "]";
}

}