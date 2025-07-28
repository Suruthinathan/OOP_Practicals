public class LibraryDataTypesDemo {
    public static void main(String[] args) {

        // Primitive data types in context
        byte shelfNumber = 12;               // small number (0–127)
        short bookCount = 1500;              // library capacity
        int isbn = 9780131;            // example ISBN (truncated to int)
        long accessionNumber = 12345678; // large book tracking ID
        float bookPrice = 499.99f;           // price with single precision
        double fineAmount = 123.456789;      // fine with high precision
        char category = 'F';                 // F for Fiction
        boolean isAvailable = true;          // book availability

        System.out.println("=== Primitive Data Types in Library System ===");
        System.out.println("Shelf Number (byte): " + shelfNumber);
        System.out.println("Book Count (short): " + bookCount);
        System.out.println("ISBN (int): " + isbn);
        System.out.println("Accession Number (long): " + accessionNumber);
        System.out.println("Book Price (float): ₹" + bookPrice);
        System.out.println("Fine Amount (double): ₹" + fineAmount);
        System.out.println("Category (char): " + category);
        System.out.println("Available (boolean): " + isAvailable);
    }
}
