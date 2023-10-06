package Task1;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Lukas", "Ronberg","Ronburger", 1));
        customers.add(new Customer("Johan", "Mikkelsen","JoMik", 2));
        customers.add(new Customer("Thors", "Thorsson","TrollofJom", 3));


        printCustomers(customers);

        }


    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }
}

