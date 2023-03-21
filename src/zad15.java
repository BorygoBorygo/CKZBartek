import java.util.Scanner;

public class zad15 {
    public static void main(String[] args) {
        float cenadetaliczna;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj cene detaliczna : ");
        cenadetaliczna= dane.nextInt();
        double zysk=cenadetaliczna*0.4;
        System.out.println("Zysk ze sprzedazy wynosi : " + zysk);


    }
}