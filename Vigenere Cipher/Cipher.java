
import java.util.Scanner;

public class Cipher {
    public static void main(String[] args) {
        String key = "";
        String text = "";
        String enc;
        String dec;
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Driver en = new Driver();
        System.out.print("Enter a KEY to use for decryption : ");
        key = a.nextLine().toUpperCase(); // change key to uppercase
        System.out.println();
        System.out.print("Enter Text to ENCRYPT : ");
        text = b.nextLine();
        System.out.println();
        enc = en.encrypt(text, key);
        System.out.println("ENCRYPTED TEXT : " + enc);
        dec = en.decrypt(enc, key);
        System.out.println("DECRYPTED TEXT : " + dec);
        
    }
}