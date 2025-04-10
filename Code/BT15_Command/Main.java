public class Main {
    public static void main(String[] args) {
        // Khởi tạo client
        LibraryClient client = new LibraryClient();
        Library library = client.getLibrary();
        
        // Thêm sách vào thư viện
        Book book1 = new Book(1, "Lập trình Java");
        Book book2 = new Book(2, "Design Patterns");
        Book book3 = new Book(3, "Clean Code");
        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        // Đăng ký người dùng
        LibraryUser user1 = new LibraryUser(101, "Nguyễn Văn A");
        LibraryUser user2 = new LibraryUser(102, "Trần Thị B");
        
        library.registerUser(user1);
        library.registerUser(user2);
        
        System.out.println("=== Danh sách sách trong thư viện ===");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
        
        System.out.println("\n=== Thực hiện các thao tác mượn, trả, gia hạn sách ===");
        
        // Mượn sách
        System.out.println("\n1. Người dùng mượn sách:");
        client.borrowBook(101, 1);
        client.borrowBook(102, 2);
        
        // Hiển thị thông tin người dùng sau khi mượn
        System.out.println("\nThông tin người dùng sau khi mượn sách:");
        for (LibraryUser user : library.getUsers()) {
            System.out.println(user);
        }
        
        // Gia hạn sách
        System.out.println("\n2. Người dùng gia hạn sách:");
        client.renewBook(101, 1);
        
        // Trả sách
        System.out.println("\n3. Người dùng trả sách:");
        client.returnBook(101, 1);
        
        // Hiển thị thông tin người dùng sau khi trả sách
        System.out.println("\nThông tin người dùng sau khi trả sách:");
        for (LibraryUser user : library.getUsers()) {
            System.out.println(user);
        }
        
        // Hiển thị trạng thái sách sau khi thực hiện các thao tác
        System.out.println("\n=== Trạng thái sách sau khi thực hiện các thao tác ===");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }
    }
}
