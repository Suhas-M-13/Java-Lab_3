import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.nextLine().charAt(0); // Read the first character entered

        int asciiCode = (int) inputChar; // Convert the character to its ASCII code

        System.out.println("ASCII code of '" + inputChar + "' is " + asciiCode);

        scanner.close(); // Close the scanner
    }
}