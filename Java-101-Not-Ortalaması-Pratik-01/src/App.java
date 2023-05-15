import java.util.Scanner;
public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        int mat, fiz, kimya, türkçe, tarih, müzik, toplam;
        String durum;
        Scanner input = new Scanner(System.in);
        System.out.print("Notlarınızı girin");
        mat = input.nextInt();
        fiz = input.nextInt();
        kimya = input.nextInt();
        türkçe = input.nextInt();
        tarih = input.nextInt();
        müzik = input.nextInt();
        
        toplam = mat + fiz + kimya + türkçe + tarih + müzik;
        durum = ((toplam / 6) >= 60) ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(durum);
    }
}
