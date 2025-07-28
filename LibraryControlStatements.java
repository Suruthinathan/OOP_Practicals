import java.util.Scanner;

public class LibraryControlStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // if-else
        System.out.print("Enter number of days book is kept: ");
        int days = sc.nextInt();

        if (days <= 14) {
            System.out.println("Returned on time. No fine.");
        } else if (days <= 21) {
            System.out.println("Late return. ₹10 fine.");
        } else {
            System.out.println("Very late return. ₹50 fine and warning.");
        }

        // for loop – Listing available shelves
        System.out.println("\nAvailable Shelf Numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Shelf " + i);
        }

        // while loop – Simulating 3 people borrowing books
        int i = 1;
        System.out.println("\nMembers borrowing books:");
        while (i <= 3) {
            System.out.println("Member #" + i + " borrowed a book.");
            i++;
        }

        // do-while loop – Simulating return counter
        int j = 1;
        System.out.println("\nReturn Counter:");
        do {
            System.out.println("Processed return #" + j);
            j++;
        } while (j <= 2);

        // switch – Book categories
        System.out.print("\nEnter book category code (1: Fiction, 2: Science, 3: History): ");
        int category = sc.nextInt();

        switch (category) {
            case 1:
                System.out.println("You selected Fiction.");
                break;
            case 2:
                System.out.println("You selected Science.");
                break;
            case 3:
                System.out.println("You selected History.");
                break;
            default:
                System.out.println("Invalid category.");
        }
    }
}
