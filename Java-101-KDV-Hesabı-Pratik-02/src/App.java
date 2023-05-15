import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double ucret;
        double kdvliUcret;

        Scanner input = new Scanner(System.in);

        System.out.print("Ucreti giriniz: ");
        ucret = input.nextInt();

        kdvliUcret = (ucret < 1000) ? ucret + (ucret * 18) / 100 : ucret + (ucret * 8) / 100;

        System.out.print("KDV dahil ücret: " + kdvliUcret);
    }
}
