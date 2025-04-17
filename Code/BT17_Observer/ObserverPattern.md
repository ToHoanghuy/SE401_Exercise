# Mẫu Thiết Kế Observer Pattern

## Sơ đồ lớp

```
+-----------------------+       +-----------------------+
|     <<interface>>     |       |        Order          |
|       Customer        |       +-----------------------+
+-----------------------+       | - status: String      |
| + update(status)      |<------| - customers: List     |
| + displayStatus()     |       +-----------------------+
+-----------------------+       | + registerCustomer()  |
         ↑                      | + removeCustomer()    |
         |                      | + notifyCustomers()   |
         |                      | + updateStatus()      |
         |                      +-----------------------+
         |                               
+-----------------------+       
|  RestaurantCustomer   |       
+-----------------------+       
| - customerName        |       
| - currentStatus       |       
+-----------------------+       
| + update()            |       
| + displayStatus()     |       
+-----------------------+       
```

## Mô tả các thành phần

### 1. Customer (Observer)
- **Loại**: Interface
- **Vai trò**: Observer trong mẫu Observer Pattern
- **Mô tả**: Định nghĩa các phương thức mà concrete observers phải triển khai
- **Phương thức**:
  - `update(status)`: Nhận thông báo khi trạng thái đơn hàng thay đổi
  - `displayStatus()`: Hiển thị trạng thái hiện tại

### 2. Order (Subject)
- **Loại**: Class
- **Vai trò**: Subject trong mẫu Observer Pattern
- **Mô tả**: Quản lý danh sách các observers và thông báo khi có sự thay đổi
- **Thuộc tính**:
  - `status`: Trạng thái hiện tại của đơn hàng
  - `customers`: Danh sách các khách hàng đăng ký nhận thông báo
- **Phương thức**:
  - `registerCustomer(customer)`: Đăng ký một observer mới
  - `removeCustomer(customer)`: Xóa một observer khỏi danh sách
  - `notifyCustomers()`: Thông báo đến tất cả observers
  - `updateStatus(newStatus)`: Cập nhật trạng thái và thông báo

### 3. RestaurantCustomer (Concrete Observer)
- **Loại**: Class
- **Vai trò**: Concrete Observer trong mẫu Observer Pattern
- **Mô tả**: Triển khai cụ thể của interface Customer
- **Thuộc tính**:
  - `customerName`: Tên của khách hàng
  - `currentStatus`: Trạng thái hiện tại của đơn hàng
- **Phương thức**:
  - `update(status)`: Triển khai phương thức nhận thông báo
  - `displayStatus()`: Hiển thị thông báo về trạng thái đơn hàng

## Luồng hoạt động

1. **Đăng ký Observer**: 
   - Các đối tượng Customer đăng ký với Order thông qua phương thức `registerCustomer()`

2. **Thay đổi trạng thái**:
   - Khi Order cập nhật trạng thái thông qua `updateStatus()`
   - Phương thức `notifyCustomers()` được gọi tự động

3. **Thông báo**:
   - Order duyệt qua danh sách các Customer đã đăng ký
   - Gọi phương thức `update()` của mỗi Customer

4. **Nhận và xử lý thông báo**:
   - Mỗi Customer nhận thông báo và cập nhật trạng thái nội bộ
   - Hiển thị thông báo cho người dùng

## Ưu điểm của Observer Pattern

1. **Loose Coupling**: Subject và Observer không biết nhiều về nhau
2. **Support for broadcast communication**: Một thông báo có thể được gửi đến nhiều đối tượng
3. **Mở rộng dễ dàng**: Có thể thêm Observer mới mà không cần sửa đổi Subject

## Ứng dụng trong bài toán quản lý đơn hàng

Trong hệ thống quản lý đơn hàng nhà hàng:
- **Order** là đối tượng trung tâm, theo dõi trạng thái đơn hàng
- **Customer** là khách hàng đăng ký để nhận thông báo khi trạng thái đơn hàng thay đổi
- Các trạng thái đơn hàng có thể bao gồm: "đang chuẩn bị", "đã sẵn sàng để giao", "đang giao hàng", "hoàn tất" 