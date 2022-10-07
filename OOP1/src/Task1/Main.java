package Task1;

public class Main {

    public static void main(String[] args) {

        //object creation. Instantiate a new Driver with owen name and age
       Driver driver0 = new Driver("Mikkel",26);
       Driver driver1 = new Driver("Olfert", 30);
       Car car0 = new Car("Ford","Golf",2010,"Hatchback");
       Car car1 = new Car("Toyota","Corolla", 1996,"Stationcar");

       //asign the driver to the car
        car0.setDriver(driver0);
        car1.setDriver(driver1);

        //1.k print the toString method of the car you've created followed by the toString method of the driver.
        System.out.println(car0);
        System.out.println(driver0);
        System.out.println(car1);
        System.out.println(driver1);

    }



}

