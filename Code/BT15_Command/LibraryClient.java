public class LibraryClient {
    private Library library;
    private LibraryInvoker invoker;

    public LibraryClient() {
        this.library = new Library();
        this.invoker = new LibraryInvoker();
    }

    public void borrowBook(int userId, int bookId) {
        LibraryCommand command = new BorrowBookCommand(library, userId, bookId);
        invoker.addCommand(command);
        command.execute();
    }

    public void returnBook(int userId, int bookId) {
        LibraryCommand command = new ReturnBookCommand(library, userId, bookId);
        invoker.addCommand(command);
        command.execute();
    }

    public void renewBook(int userId, int bookId) {
        LibraryCommand command = new RenewBookCommand(library, userId, bookId);
        invoker.addCommand(command);
        command.execute();
    }

    public Library getLibrary() {
        return library;
    }
}
