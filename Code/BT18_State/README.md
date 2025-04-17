# Mẫu thiết kế State (State Design Pattern)

## Giới thiệu
Chương trình này minh họa việc sử dụng mẫu thiết kế State để quản lý trạng thái của một vụ án tại tòa án. Vụ án sẽ trải qua nhiều trạng thái khác nhau từ khi khởi kiện cho đến khi hoàn tất, bao gồm các trạng thái như Khởi Kiện, Đang Xét Xử, Chờ Phán Quyết, và Đã Hoàn Tất. Mỗi trạng thái chỉ có thể chuyển đến các trạng thái hợp lệ tiếp theo.

## Cấu trúc
1. **State Interface**: Định nghĩa các phương thức cần thiết cho tất cả các trạng thái cụ thể.
2. **Lawsuit**: Lớp đóng vai trò là Context, quản lý trạng thái hiện tại của vụ án.
3. **Các lớp trạng thái cụ thể**:
   - **FilingState**: Trạng thái Khởi Kiện
   - **TrialState**: Trạng thái Đang Xét Xử
   - **AwaitingJudgmentState**: Trạng thái Chờ Phán Quyết
   - **ClosedState**: Trạng thái Đã Hoàn Tất

## Cách thức hoạt động
1. **Lawsuit** lưu trữ một tham chiếu đến một đối tượng State cụ thể.
2. **Lawsuit** ủy thác các hành vi phụ thuộc vào trạng thái cho đối tượng State hiện tại.
3. **Lawsuit** có thể thay đổi trạng thái của nó bằng cách thay đổi đối tượng State mà nó tham chiếu đến.
4. Mỗi đối tượng State cụ thể định nghĩa hành vi của nó và các trạng thái tiếp theo hợp lệ.

## Luồng chuyển trạng thái trong ứng dụng
- Khởi Kiện -> Đang Xét Xử
- Đang Xét Xử -> Chờ Phán Quyết
- Chờ Phán Quyết -> Đã Hoàn Tất
- Đã Hoàn Tất (trạng thái cuối cùng)

## Lợi ích của mẫu thiết kế State
1. **Tách biệt hành vi**: Mỗi trạng thái được đóng gói trong một lớp riêng biệt.
2. **Dễ dàng thêm trạng thái mới**: Chỉ cần tạo một lớp mới triển khai interface State.
3. **Loại bỏ các câu lệnh điều kiện phức tạp**: Thay vì sử dụng nhiều câu lệnh if-else để xử lý các trạng thái khác nhau, mỗi trạng thái tự xử lý hành vi của nó.
4. **Tuân thủ nguyên tắc Open/Closed**: Có thể mở rộng mà không sửa đổi code hiện có.

## Sơ đồ UML
```
+----------------+       +----------------+
|    Lawsuit     |<>---->|     State     |
+----------------+       +----------------+
| -currentState  |       | +handle()      |
| -caseName      |       | +getStateName()|
| +setState()    |       +----------------+
| +nextState()   |             /_\
+----------------+              |
                               / \
                              /   \
         +----------------+  /     \  +----------------+
         | FilingState    |_/       \_| TrialState    |
         +----------------+           +----------------+
         | +handle()      |           | +handle()      |
         | +getStateName()|           | +getStateName()|
         +----------------+           +----------------+
                  |                            |
                  |                            |
         +----------------+           +----------------+
         |AwaitingJudgment|           | ClosedState    |
         +----------------+           +----------------+
         | +handle()      |           | +handle()      |
         | +getStateName()|           | +getStateName()|
         +----------------+           +----------------+
```

## Cách chạy chương trình
Biên dịch và chạy lớp Main:
```bash
javac BT18_State/*.java
java BT18_State.Main
``` 