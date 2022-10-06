package Task3;

import java.util.ArrayList;

public class Main {

     public static ArrayList<Customer>customers = new ArrayList<>();

    public static void main(String[] args) {

        Customer customer0 = new Customer("Olfert","Olfertsen","Olfert4Ever");
        Customer customer1 = new Customer("Hans","Hansen","Hansen4Ever");
        Customer customer2 = new Customer("Pind","Pindsen","Pind4Ever");
        Customer customer3 = new Customer("Is","Issen","Is4Ever");
        Customer customer4 = new Customer("Gatorade","Gatoradesen","Gatorade4Ever");
        Customer customer5 = new Customer("Cookie","Cookiesen","Cookie4Ever");

        //in Arraylist customers add 6 instanzes of Customer type
        customers.add(customer0);
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);

        printCustomers(customers);

    }

    //method. Print all customers via a for each loop
    public static void printCustomers(ArrayList <Customer> customers){
        for ( Customer test : customers) {
            System.out.println(test);
        }
    }
}
