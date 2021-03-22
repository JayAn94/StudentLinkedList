
import java.util.Scanner;

public class studentsTester {
	private static Scanner scan;
	private static studentsList list = new studentsList();

	// ----------------------------------------------------------------
	// Creates a list, then repeatedly prints the menu and does what
	// the user asks until they quit.
	// ----------------------------------------------------------------
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		printMenu();
		int choice = scan.nextInt();
		while (choice != 0) {
			dispatch(choice);
			printMenu();
			choice = scan.nextInt();
		}
	}

	// ----------------------------------------
	// Does what the menu item calls for.
	// ----------------------------------------
	public static void dispatch(int choice) {
		String student;
		switch (choice) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1: // add to front
			System.out.println("Enter student's name to add to front");
			student = scan.next();
			list.addToFront(student);
			break;
		case 2: // add to end
			System.out.println("Enter student's name to add to end");
			student = scan.next();
			list.addToEnd(student);
			break;
		case 3: // remove first element
			list.removeFirst();
			break;
		case 4:
			System.out.println("Enter student's name to remove in the list");
			student = scan.next();
			list.removeByName(student);
		case 5: // print
			list.print();
			break;
		default:
			System.out.println("Sorry, invalid choice");
		}
	}

	// -----------------------------------------
	// Prints the user's choices
	// -----------------------------------------
	public static void printMenu() {
		System.out.println("\n   Menu   ");
		System.out.println("   ====");
		System.out.println("0: Quit");
		System.out.println("1: Add a Student to the front of the list");
		System.out.println("2: Add an Student to the end of the list");
		System.out.println("3: Remove a Student from the front of the list");
		System.out.println("4: Remove a Student from the list by name");
		System.out.println("5: Print the list");
		System.out.print("\nEnter your choice: ");
	}
}