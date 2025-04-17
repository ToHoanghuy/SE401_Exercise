package BT17_Observer;

public class RestaurantCustomer implements Customer {
    private final String customerName;
    private String currentStatus;

    public RestaurantCustomer(String name) {
        this.customerName = name;
    }

    @Override
    public void update(String status) {
        this.currentStatus = status;
        displayStatus();
    }

    @Override
    public void displayStatus() {
        System.out.println("Khách hàng " + customerName + " nhận được thông báo: Đơn hàng " + currentStatus);
    }
} 