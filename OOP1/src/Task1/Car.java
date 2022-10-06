package Task1;

public class Car {

    //fields (instance variables/attributes) for the class Car
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

    //constructor that populates the fields (except driver)
    public Car(String make, String model, int year, String bodyStyle){
    this.make = make;
    this.model = model;
    this.year = year;
    this.bodyStyle = bodyStyle;

    }

    //getter to the field driver - returns the value of driver
    public Driver getDriver() {
        return driver;
    }

    //setter to the field driver - takes a parameter and assigns it the driver field.
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", bodyStyle='" + bodyStyle + '\'' +
                '}';
    }
}
