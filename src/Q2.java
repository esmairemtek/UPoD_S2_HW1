import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ayrılmış şeklini istediğiniz sayıyı giriniz: ");
        long num = scan.nextLong();
        System.out.println(splitNumber(num));
    }
    public static String splitNumber(long num) {

        StringBuilder input = new StringBuilder(String.valueOf(num));
        StringBuilder output = new StringBuilder();


        while (!input.isEmpty()) {
            int mod = input.length() % 3;

            if (mod == 0) {
                output.append(input, 0, 3);
                input.delete(0, 3);
                output.append(" ");
            }
            else {
                output.append(input, 0, mod);
                input.delete(0, mod);
                output.append(" ");
            }
        }
        return output.toString();
    }
}
