import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double kilo, boy, vucutKitleIndeksi;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu (kg cinsinden) giriniz: ");
        kilo = input.nextDouble();

        vucutKitleIndeksi = kilo / (boy * boy);

        System.out.print("Vücut kitle endeksiniz: " + vucutKitleIndeksi);
    }
}