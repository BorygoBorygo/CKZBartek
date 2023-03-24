import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        String imiejeden;
        String imiedwa;
        String imietrzy;

        Scanner dane = new Scanner(System.in);

        System.out.println("podaj imie pierwszej osoby");
        imiejeden = dane.nextLine();

        System.out.println("podaj imie drugiej osoby");
        imiedwa = dane.nextLine();

        System.out.println("podaj imie trzeciej osoby");
        imietrzy = dane.nextLine();

        List<String> osoby = new LinkedList<>();
        osoby.add(imiejeden);
        osoby.add(imiedwa);
        osoby.add(imietrzy);
        Collections.sort(osoby);
        for (String patient : osoby
        ) {
            System.out.println(patient);
        }
    }
}









