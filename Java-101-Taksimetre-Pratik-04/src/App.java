import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double km, ucret;

        Scanner input = new Scanner(System.in);
        System.out.println("KM' yi giriniz: ");
        
        km = input.nextInt();

        ucret = (km * 2.2) < 20 ? 20 + 10 : (km * 2.2) + 10;
        System.out.println("Taksimetre ücreti: " + ucret); 
    }
}
