public class RenewBookCommand implements LibraryCommand {
    private Library library;
    private int userId;
    private int bookId;

    public RenewBookCommand(Library library, int userId, int bookId) {
        this.library = library;
        this.userId = userId;
        this.bookId = bookId;
    }

    @Override
    public boolean execute() {
        return library.renewBook(userId, bookId);
    }
}
