

import java.util.Scanner;
 public class zad10 {
    public static void main(String[] args) {
        String pierwszeimie, drugieimie, ostatnieimie;
        Scanner dane = new Scanner(System.in);
        System.out.println("podaj swoje imie ");
        pierwszeimie = dane.nextLine();

        System.out.println("Podaj swoje drugie imie: ");
        drugieimie = dane.nextLine();
        System.out.println("Podaj swoje nazwisko: ");
        ostatnieimie = dane.nextLine();

        char firstInitial = pierwszeimie.charAt(0), middleinitial = drugieimie.charAt(0),
                lastinital = ostatnieimie.charAt(0);

        System.out.println("twoje imie:  "+ pierwszeimie + "drugie imie:  : "+drugieimie + "nazwisko:  "+ ostatnieimie);
        System.out.println("twoje inicjaly: "+ firstInitial + middleinitial + lastinital);



    }
}
