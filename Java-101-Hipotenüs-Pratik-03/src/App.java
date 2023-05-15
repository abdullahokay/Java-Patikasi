import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double dikKenar1, dikKenar2, hipotenüs, alan, kenar1, kenar2, kenar3;

        Scanner input = new Scanner(System.in);
        System.out.println("Dik kenarları giriniz: ");
        dikKenar1 = input.nextInt();
        dikKenar2 = input.nextInt();

        hipotenüs = Math.sqrt(dikKenar2 * dikKenar2 + dikKenar1 * dikKenar1);

        System.out.println("Dik Kenarları girilen dik üçgenin hipotenüsü: " + hipotenüs);

        System.out.println("Üç kenarı giriniz: ");

        kenar1 = input.nextInt();
        kenar2 = input.nextInt();
        kenar3 = input.nextInt();

        System.out.println(("Üç kenarı girilen üçgenin alanı: ") + Math.sqrt(((kenar1 + kenar2 + kenar3) / 2) * ((((kenar1 + kenar2 + kenar3) / 2) - kenar1) * (((kenar1 + kenar2 + kenar3) / 2) - kenar2) * (((kenar1 + kenar2 + kenar3) / 2) - kenar3))));
    }
}
