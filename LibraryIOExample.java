import java.util.Scanner;

public class LibraryIOExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input using Scanner
        System.out.println("=== Library Member Entry ===");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Member ID: ");
        int memberId = sc.nextInt();

        System.out.print("Enter number of books borrowed: ");
        int booksBorrowed = sc.nextInt();

        // Output without Scanner (hardcoded)
        System.out.println("\n=== Sample Message ===");
        System.out.println("Welcome to the library system!");

        // Output with Scanner (dynamic)
        System.out.println("\n=== Member Details ===");
        System.out.println("Name: " + name);
        System.out.println("Member ID: " + memberId);
        System.out.println("Books Borrowed: " + booksBorrowed);

        // Without variables
        System.out.println("Thank you for using our system.");
    }
}
