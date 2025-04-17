package BT17_Observer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String status;
    private List<Customer> customers;

    public Order() {
        this.customers = new ArrayList<>();
        this.status = "Đang chuẩn bị";
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }

    public void notifyCustomers() {
        for (Customer customer : customers) {
            customer.update(status);
        }
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        notifyCustomers();
    }
} 