import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        float cenaposilku;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj cene posilku : " );
        cenaposilku = dane.nextInt();
        double podatek=cenaposilku+cenaposilku*0.0675;
        double napiwek=podatek+cenaposilku*0.2;
        System.out.println("Cena posiłku : " + cenaposilku);
        System.out.println("Cena po opodatkowaniu : " +podatek );
        System.out.println("Cena z podatkiem i napiwkiem : " + napiwek);
    }
}