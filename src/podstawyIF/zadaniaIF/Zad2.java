package podstawyIF.zadaniaIF;

import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        int dzien, miesiac, rok;
        Scanner dane= new Scanner(System.in);

        System.out.println("podaj dzien");
        dzien = dane.nextInt();

        System.out.println("podaj miesiac");
      miesiac = dane.nextInt();

        System.out.println("podaj dwie ostatnie cyfry roku");
        rok = dane.nextInt();

        if(dzien*miesiac ==rok) {
            System.out.println("data jest magiczna");}
            else {
                System.out.println("data nie jest magiczna");
            }
        }





    }

