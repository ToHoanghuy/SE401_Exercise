public class BorrowBookCommand implements LibraryCommand {
    private Library library;
    private int userId;
    private int bookId;

    public BorrowBookCommand(Library library, int userId, int bookId) {
        this.library = library;
        this.userId = userId;
        this.bookId = bookId;
    }

    @Override
    public boolean execute() {
        return library.borrowBook(userId, bookId);
    }
}
