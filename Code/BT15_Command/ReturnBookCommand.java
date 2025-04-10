public class ReturnBookCommand implements LibraryCommand {
    private Library library;
    private int userId;
    private int bookId;

    public ReturnBookCommand(Library library, int userId, int bookId) {
        this.library = library;
        this.userId = userId;
        this.bookId = bookId;
    }

    @Override
    public boolean execute() {
        return library.returnBook(userId, bookId);
    }
}
