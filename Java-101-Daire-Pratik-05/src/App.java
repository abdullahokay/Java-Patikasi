import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double yariCap, alan, cevre, daireDilimiAlani, merkezAci;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        yariCap = input.nextInt();

        System.out.print("Daire diliminin merkez açısını giriniz: ");
        merkezAci = input.nextInt();

        alan = pi * yariCap * yariCap;
        cevre = 2 * pi * yariCap;
        daireDilimiAlani = (pi * (yariCap * yariCap) * merkezAci);
        
        System.out.print("Dairenin alanı: " + alan + " Dairenin çevresi: " + cevre + " Daire diliminin alanı: " + daireDilimiAlani);
    }
}
