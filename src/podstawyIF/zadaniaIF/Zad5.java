package podstawyIF.zadaniaIF;

import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {


        Scanner dane= new Scanner(System.in);

        System.out.println("Podaj mase");
        int masa = dane.nextInt();


        double ciezar= masa * 9.8;

        if(ciezar>1000){
            System.out.println("obiekt jest zbyt ciezki");
        }else if(ciezar<10){
            System.out.println("ciezar jest zbyt lekki");
        }


    }





}
