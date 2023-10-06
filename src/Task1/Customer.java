package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;

    public Customer(String firstName, String lastName, String userName, int id){
       this.firstName = firstName;
       this.lastName = lastName;
       this.userName = userName;
       this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public int getId() {
        return id;
    }

    public String toString(){
    return firstName + " " + lastName + "\nUsername: " + userName + "\nID: " + id;
    }
}
