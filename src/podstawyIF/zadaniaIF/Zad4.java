package podstawyIF.zadaniaIF;
import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {

        int tescik1,tescik2,tescik3;
        Scanner dane = new Scanner(System.in);

        System.out.println("wprowadz wynik pierwszego testu");
        tescik1 = dane.nextInt();


        System.out.println("wprowadz wynik drugiego testu ");
        tescik2 = dane.nextInt();



        System.out.println("wprowadz wynik trzeciego testu");
        tescik3 = dane.nextInt();

        int suma= tescik1+tescik2+tescik3;

        float srednia=suma/3;

        if(srednia>90){
            System.out.println("Ocena 5");
        }else if(srednia>=80){
            System.out.println("Ocena 4");
        }else if(srednia>=70){
            System.out.println("Ocena 3");
        }else if(srednia>=60){
            System.out.println("Ocena 2");
        }else if(srednia<60){
            System.out.println("ocena 1");
        }


    }
}
