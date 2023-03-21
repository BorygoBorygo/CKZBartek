
import java.util.Scanner;

public class zad14 {
    public static void main(String[] args) {
        int ocena1, ocena2 , ocena3 ;
        Scanner dane = new Scanner(System.in);
        System.out.println("Podaj ocene z pierwszego testu: ");
        ocena1= dane.nextInt();

        System.out.println("Podaj ocene z drugiego testu: ");
        ocena2= dane.nextInt();

        System.out.println("Podaj ocene z trzeciego testu: ");
        ocena3= dane.nextInt();

        float srednia= ocena1 + ocena2 + ocena3;
        System.out.println("Ocena z 1 testu wynosi : " + ocena1);
        System.out.println("Ocena z 2 testu wynosi : " + ocena2);
        System.out.println("Ocena z 3 testu wynosi : " + ocena3);
        System.out.println("Srednia z  testow wynosi : " + srednia/3);




    }
}