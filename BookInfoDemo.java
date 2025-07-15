import java.util.Scanner;

public class BookInfoDemo {
    public static void main(String[] args) {
        // Input with Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Book Entry System ===");
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Book ID (byte): ");
        byte bookID = sc.nextByte();

        System.out.print("Enter Number of Pages (short): ");
        short pages = sc.nextShort();

        System.out.print("Enter ISBN Number (int): ");
        int isbn = sc.nextInt();

        System.out.print("Enter Accession No (long): ");
        long accNo = sc.nextLong();

        System.out.print("Enter Price (float): ");
        float price = sc.nextFloat();

        System.out.print("Enter Discounted Price (double): ");
        double discountedPrice = sc.nextDouble();

        System.out.print("Enter Category Initial (char): ");
        char category = sc.next().charAt(0);

        boolean isAvailable = true;

        // Output without Scanner
        System.out.println("\n=== Book Details ===");
        System.out.println("Title: " + title);
        System.out.println("Book ID: " + bookID);
        System.out.println("Pages: " + pages);
        System.out.println("ISBN: " + isbn);
        System.out.println("Accession No: " + accNo);
        System.out.println("Price: ₹" + price);
        System.out.println("Discounted Price: ₹" + discountedPrice);
        System.out.println("Category: " + category);
        System.out.println("Available: " + isAvailable);
    }
}
