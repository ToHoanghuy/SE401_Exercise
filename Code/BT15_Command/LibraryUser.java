import java.util.ArrayList;
import java.util.List;

public class LibraryUser {
    private int userId;
    private String name;
    private List<Book> borrowedBooks;

    public LibraryUser(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void addBook(Book book) {
        borrowedBooks.add(book);
    }

    public void removeBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}
