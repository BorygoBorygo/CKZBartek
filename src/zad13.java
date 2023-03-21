import java.util.Scanner;

public class zad13 {
    public static void main(String[] args) {
        int ciastko;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj ilosc zjedzonych ciasteczek: ");
        ciastko= dane.nextInt();
        int kalorie= ciastko * 30;
        System.out.println("Ilość skonsumowanych kalorii : " + kalorie);

    }
}