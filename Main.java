import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the message: ");
        String message = sc.nextLine();
        System.out.print("Enter the key (1-25): ");
        int key = sc.nextInt();
        String decryptedMessage = "";
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                int originalAlphabet = (int) ch;
                int shiftedAlphabet = originalAlphabet + key;
                if (Character.isUpperCase(ch) && shiftedAlphabet > 90) {
                    shiftedAlphabet = 65 + (shiftedAlphabet - 91);
                } else if (Character.isLowerCase(ch) && shiftedAlphabet > 122) {
                    shiftedAlphabet = 97 + (shiftedAlphabet - 123);
                }
                decryptedMessage += (char) shiftedAlphabet;
            } else {
                decryptedMessage += ch;
            }
        }
        System.out.println("Decrypted message: " + decryptedMessage);
    }
}
