class Book {
    public String title = "Java Programming";        // public
    private int bookId = 101;                         // private
    protected float price = 349.99f;                  // protected
    boolean isAvailable = true;                       // default (package-private)

    public void displayDetails() {
        System.out.println("=== Book Details (Inside Class) ===");
        System.out.println("Title (public): " + title);
        System.out.println("Book ID (private): " + bookId);
        System.out.println("Price (protected): ₹" + price);
        System.out.println("Available (default): " + isAvailable);
    }
}

public class LibraryAccessModifiers {
    public static void main(String[] args) {
        Book book = new Book();
        book.displayDetails();

        // Accessing public, protected, and default directly
        System.out.println("\n=== Access from Another Class in Same Package ===");
        System.out.println("Title (public): " + book.title);
        System.out.println("Price (protected): ₹" + book.price);
        System.out.println("Available (default): " + book.isAvailable);

        // System.out.println("Book ID (private): " + book.bookId); // ❌ Not accessible – private
    }
}
