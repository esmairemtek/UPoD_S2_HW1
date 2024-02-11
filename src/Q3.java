import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Palindromik olup olmadığını öğrenmek istediğiniz metni giriniz: ");
        String text = scan.nextLine();
        isPalindrom(text);
    }

    public static void isPalindrom(String text) {
        String temp = text.replaceAll("\\W", "").toLowerCase();
        StringBuilder output = new StringBuilder(temp).reverse();
        System.out.printf("Orijinal okunuş: %s\n", temp);
        System.out.printf("Tersten okunuş: %s\n", output);

        if (output.toString().equals(temp)) {
            System.out.println("Girilen metin palindromdur. ");
        }
        else {
            System.out.println("Girilen metin palindrom değildir.");
        }

    }
}
