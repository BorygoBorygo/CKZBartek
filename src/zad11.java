
import java.util.Scanner;
public class zad11 {
    public static void main(String[] args) {
        int wartoscproduktu;
        Scanner dane = new Scanner(System.in);
        System.out.println("podaj wartosc produktow:  ");
        wartoscproduktu = dane.nextInt();
        double podatek1 = wartoscproduktu*0.02;
        double podatek2 = wartoscproduktu*0.04;
        double wartoscall = wartoscproduktu + podatek2 + podatek1;
        System.out.println("cena ostateczna:  "+ wartoscall);
        System.out.println("podatek stanowy : " + podatek2 + "pdatek lokalny: "+ podatek1);

    }
}
