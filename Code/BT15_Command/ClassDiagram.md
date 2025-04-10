classDiagram
    %% Core classes
    class Book {
        -int bookId
        -String title
        -boolean isAvailable
        +Book(int bookId, String title)
        +getBookId() int
        +getTitle() String
        +isAvailable() boolean
        +setAvailable(boolean available) void
        +toString() String
    }
    
    class LibraryUser {
        -int userId
        -String name
        -List~Book~ borrowedBooks
        +LibraryUser(int userId, String name)
        +getUserId() int
        +getName() String
        +getBorrowedBooks() List~Book~
        +addBook(Book book) void
        +removeBook(Book book) void
        +toString() String
    }
    
    class Library {
        -List~Book~ books
        -List~LibraryUser~ users
        -Map~Integer, LibraryUser~ userMap
        +Library()
        +addBook(Book book) void
        +registerUser(LibraryUser user) void
        +borrowBook(int userId, int bookId) boolean
        +returnBook(int userId, int bookId) boolean
        +renewBook(int userId, int bookId) boolean
        -findBookById(int bookId) Book
        +getBooks() List~Book~
        +getUsers() List~LibraryUser~
    }
    
    %% Command Pattern
    class LibraryCommand {
        <<interface>>
        +execute() boolean
    }
    
    class BorrowBookCommand {
        -Library library
        -int userId
        -int bookId
        +BorrowBookCommand(Library library, int userId, int bookId)
        +execute() boolean
    }
    
    class ReturnBookCommand {
        -Library library
        -int userId
        -int bookId
        +ReturnBookCommand(Library library, int userId, int bookId)
        +execute() boolean
    }
    
    class RenewBookCommand {
        -Library library
        -int userId
        -int bookId
        +RenewBookCommand(Library library, int userId, int bookId)
        +execute() boolean
    }
    
    class LibraryInvoker {
        -List~LibraryCommand~ commands
        +LibraryInvoker()
        +addCommand(LibraryCommand command) void
        +executeCommands() void
    }
    
    class LibraryClient {
        -Library library
        -LibraryInvoker invoker
        +LibraryClient()
        +borrowBook(int userId, int bookId) void
        +returnBook(int userId, int bookId) void
        +renewBook(int userId, int bookId) void
        +getLibrary() Library
    }
    
    class Main {
        +main(String[] args) void
    }
    
    %% Relationships
    LibraryUser "1" --> "*" Book : borrows
    Library "1" --> "*" Book : contains
    Library "1" --> "*" LibraryUser : manages
    
    LibraryCommand <|.. BorrowBookCommand : implements
    LibraryCommand <|.. ReturnBookCommand : implements
    LibraryCommand <|.. RenewBookCommand : implements
    
    BorrowBookCommand --> Library : uses
    ReturnBookCommand --> Library : uses
    RenewBookCommand --> Library : uses
    
    LibraryInvoker "1" --> "*" LibraryCommand : invokes
    
    LibraryClient --> Library : uses
    LibraryClient --> LibraryInvoker : uses
    LibraryClient --> BorrowBookCommand : creates
    LibraryClient --> ReturnBookCommand : creates
    LibraryClient --> RenewBookCommand : creates
    
    Main --> LibraryClient : uses