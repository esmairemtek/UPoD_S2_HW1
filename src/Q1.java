import java.util.Scanner;
public class Q1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Türkçe okunuşunu istediğiniz en fazla üç basamaklı bir sayıyı giriniz: ");
        int num = scan.nextInt();
        System.out.println(numberToString(num));
    }
    public static String numberToString(int num) {

        StringBuilder input = new StringBuilder(String.valueOf(num));
        StringBuilder output = new StringBuilder();

        if (num < -999 || num > 999) {
            System.out.println("Lütfen en fazla üç basamaklı bir sayı girin.");
        }
        if (input.charAt(0) == '-') {
            output.append("eksi");
            input.deleteCharAt(0);
        }
        if (num == 0) {
            return "sıfır";
        }

        if (input.length() == 3) {
            yuzlerBasamagi(input.charAt(0), output);
            input.deleteCharAt(0);
        }
        if (input.length() == 2) {
            onlarBasamagi(input.charAt(0), output);
            input.deleteCharAt(0);
        }
        if (input.length() == 1) {
            birlerBasamagi(input.charAt(0), output);
            input.deleteCharAt(0);
        }

        return output.toString();
    }

    private static void yuzlerBasamagi(char input, StringBuilder output) {
        switch (input) {
            case '1' -> output.append("yüz");
            case '2' -> output.append("ikiyüz");
            case '3' -> output.append("üçyüz");
            case '4' -> output.append("dörtyüz");
            case '5' -> output.append("beşyüz");
            case '6' -> output.append("altıyüz");
            case '7' -> output.append("yediyüz");
            case '8' -> output.append("sekizyüz");
            case '9' -> output.append("dokuzyüz");
            default -> {
            }
        }
    }

    private static void onlarBasamagi(char input, StringBuilder output) {
        switch (input) {
            case '1' -> output.append("on");
            case '2' -> output.append("yirmi");
            case '3' -> output.append("otuz");
            case '4' -> output.append("kırk");
            case '5' -> output.append("elli");
            case '6' -> output.append("altmış");
            case '7' -> output.append("yetmiş");
            case '8' -> output.append("seksen");
            case '9' -> output.append("doksan");
            default -> {
            }
        }
    }

    private static void birlerBasamagi(char input, StringBuilder output) {
        switch (input) {
            case '1' -> output.append("bir");
            case '2' -> output.append("iki");
            case '3' -> output.append("üç");
            case '4' -> output.append("dört");
            case '5' -> output.append("beş");
            case '6' -> output.append("altı");
            case '7' -> output.append("yedi");
            case '8' -> output.append("sekiz");
            case '9' -> output.append("dokuz");
            default -> {
            }
        }
    }
}
