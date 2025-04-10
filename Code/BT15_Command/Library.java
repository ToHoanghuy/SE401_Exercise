import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private List<Book> books;
    private List<LibraryUser> users;
    private Map<Integer, LibraryUser> userMap;

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.userMap = new HashMap<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(LibraryUser user) {
        users.add(user);
        userMap.put(user.getUserId(), user);
    }

    public boolean borrowBook(int userId, int bookId) {
        LibraryUser user = userMap.get(userId);
        if (user == null) {
            System.out.println("User not found.");
            return false;
        }

        Book bookToBorrow = findBookById(bookId);
        if (bookToBorrow == null) {
            System.out.println("Book not found.");
            return false;
        }

        if (!bookToBorrow.isAvailable()) {
            System.out.println("Book is not available for borrowing.");
            return false;
        }

        bookToBorrow.setAvailable(false);
        user.addBook(bookToBorrow);
        System.out.println("Book '" + bookToBorrow.getTitle() + "' has been borrowed by " + user.getName());
        return true;
    }

    public boolean returnBook(int userId, int bookId) {
        LibraryUser user = userMap.get(userId);
        if (user == null) {
            System.out.println("User not found.");
            return false;
        }

        Book bookToReturn = findBookById(bookId);
        if (bookToReturn == null) {
            System.out.println("Book not found.");
            return false;
        }

        if (!user.getBorrowedBooks().contains(bookToReturn)) {
            System.out.println("This book was not borrowed by this user.");
            return false;
        }

        bookToReturn.setAvailable(true);
        user.removeBook(bookToReturn);
        System.out.println("Book '" + bookToReturn.getTitle() + "' has been returned by " + user.getName());
        return true;
    }

    public boolean renewBook(int userId, int bookId) {
        LibraryUser user = userMap.get(userId);
        if (user == null) {
            System.out.println("User not found.");
            return false;
        }

        Book bookToRenew = findBookById(bookId);
        if (bookToRenew == null) {
            System.out.println("Book not found.");
            return false;
        }

        if (!user.getBorrowedBooks().contains(bookToRenew)) {
            System.out.println("This book was not borrowed by this user.");
            return false;
        }

        System.out.println("Book '" + bookToRenew.getTitle() + "' has been renewed for " + user.getName());
        return true;
    }

    private Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<LibraryUser> getUsers() {
        return users;
    }
}
