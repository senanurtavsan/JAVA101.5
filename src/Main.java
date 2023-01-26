import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner abc= new Scanner(System.in);

        System.out.print("Kilonuzu giriniz : ");
        double a=abc.nextDouble();

        System.out.print("Boyunuzu giriniz : ");
        double b=abc.nextDouble();

        double vki = (a/(b*b));

        System.out.println("Vücut Kitle İndeksiniz : " + vki );

    }
}