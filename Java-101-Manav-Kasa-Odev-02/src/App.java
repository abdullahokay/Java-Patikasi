import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double toplamUcret;
        double armutKg, armutKgFiyat = 2.14;
        double elmaKg, elmaKgFiyat = 3.67;
        double domatesKg, domatesKgFiyat = 1.11;
        double muzKg, muzKgFiyat =  0.95;
        double patlicanKg, patlicanKgFiyat = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = input.nextDouble();

        toplamUcret = (armutKg * armutKgFiyat) + (elmaKg * elmaKgFiyat) + (domatesKg * domatesKgFiyat) + (muzKg * muzKgFiyat) + (patlicanKg * patlicanKgFiyat);

        System.out.print("Toplam ücret: " + toplamUcret);
    }
}
