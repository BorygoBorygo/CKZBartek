import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
        String nazwamiasta;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj nazwe miasta : " );
        nazwamiasta = dane.next();

        int dlugosc;
        dlugosc = nazwamiasta.length();

        char inicjal = nazwamiasta.charAt(0);

        String duze;
        String male;

        male = nazwamiasta.toLowerCase();
        duze = nazwamiasta.toUpperCase();

        System.out.println( "Liczba znaków : " + dlugosc);
        System.out.println("Nazwa zapisana wielkimi literami : " + duze);
        System.out.println("Nazwa zapisana malymi literami : " + male);
        System.out.println("Pierwsza litera w nazwie miasta " + inicjal);


    }
}