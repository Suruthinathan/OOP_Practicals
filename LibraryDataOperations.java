public class LibraryDataOperations {
    public static void main(String[] args) {
        int totalBooks = 500;
        int booksIssued = 120;

        // Arithmetic
        int booksAvailable = totalBooks - booksIssued;
        System.out.println("Books Available: " + booksAvailable);

        // Relational
        boolean isStockLow = booksAvailable < 100;
        System.out.println("Is stock low? " + isStockLow);

        // Logical
        boolean manyIssued = booksIssued > 100;
        boolean alert = isStockLow && manyIssued;
        System.out.println("Alert: " + alert);

        // Assignment operator
        int fine = 0;
        fine += 10; // fine increased
        System.out.println("Fine Amount: ₹" + fine);

        // Increment / Decrement
        int visitorsToday = 50;
        System.out.println("Initial Visitors: " + visitorsToday);

        visitorsToday++; // post-increment
        System.out.println("After one entry: " + visitorsToday);

        ++visitorsToday; // pre-increment
        System.out.println("After another entry: " + visitorsToday);

        visitorsToday--; // post-decrement
        System.out.println("One exit: " + visitorsToday);
    }
}
