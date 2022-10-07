package Task3;

public class Customer {

    //fields
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    //make a constructor that takes a parameter with costumer name and username
    public Customer(String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = id;
    }
    //Make the class fields private and add getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }
}




