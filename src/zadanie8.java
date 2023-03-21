import java.util.Scanner;

public class zadanie8 {
    public static void main(String[] args) {
        Scanner klawisz = new Scanner(System.in);
        int  dlugosc1;
        System.out.println("Podaj dlugosc pokoju nr 1 :");
        dlugosc1 = klawisz.nextInt();
        klawisz.nextLine();
        int szerokosc1;
        System.out.println("Podaj szerokosc pokoju nr 1 :");
        szerokosc1 = klawisz.nextInt();
        klawisz.nextLine();

        int dlugosc2;
        System.out.println("Podaj dlugosc pokoju nr 2 :");
        dlugosc2 = klawisz.nextInt();
        klawisz.nextLine();
        int szerokosc2;
        System.out.println("Podaj szerokosc pokoju nr 2 :");
        szerokosc2 = klawisz.nextInt();
        klawisz.nextLine();

        int dlugosc3;
        System.out.println("Podaj dlugosc pokoju nr 3 :");
        dlugosc3 = klawisz.nextInt();
        klawisz.nextLine();
        int szerokosc3;
        System.out.println("Podaj szerokosc pokoju nr 3 :");
        szerokosc3 = klawisz.nextInt();
        klawisz.nextLine();

        int dlugosc4 ;
        System.out.println("Podaj dlugosc pokoju nr 4 :");
        dlugosc4= klawisz.nextInt();
        klawisz.nextLine();
        int szerokosc4;
        System.out.println("Podaj szerokosc pokoju nr 4 :");
        szerokosc4 = klawisz.nextInt();
        klawisz.nextLine();
        int ogolne1 = dlugosc1*szerokosc1;
        int ogolne2 = dlugosc2*szerokosc2;
        int ogolne3= dlugosc3*szerokosc3;
        int ogolne4 = dlugosc4*szerokosc4;

        System.out.println("Pokój nr 1 ma wymiary " + dlugosc1 + "x" + szerokosc1 + "Natomiast powierzchnia wynosi "+ ogolne1 + "Metrów^2");
        System.out.println("Pokój nr 2ma wymiary " + dlugosc2 + "x" + szerokosc2+ "Natomiast powierzchnia wynosi "+ ogolne2 + "Metrów^2");
        System.out.println("Pokój nr 3 ma wymiary " + dlugosc3 + "x" + szerokosc3+ "Natomiast powierzchnia wynosi "+ ogolne3 + "Metrów^2");
        System.out.println("Pokój nr 4ma wymiary " + dlugosc4 + "x" + szerokosc4+  "Natomiast powierzchnia wynosi " + ogolne4 + "Metrów^2");

    }
}