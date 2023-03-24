package podstawyIF.zadaniaIF;



import java.util.Scanner;

    public class Zad8 {
        public static void main(String[] args) {
            int program;
            Scanner dane = new Scanner(System.in);
            System.out.println("Podaj ilosc zakupionego oprogramowania");
            program = dane.nextInt();
           double cena1, cena2, cena3;
            if(program>10){
                cena1= 99*program*0.2;
                 cena2= 99*program;
                 cena3= cena2-cena1;
                System.out.println("Cena wynosi: " + cena3);
            } else if (program<19) {
                 cena1= 99*program*0.2;
                 cena2= 99*program;
                 cena3= cena2-cena1;
                System.out.println("Cena wynosi: " + cena3);
            } else if (program>20) {
                 cena1= 99*program*0.3;
                 cena2= 99*program;
                 cena3= cena2-cena1;
                System.out.println("Cena wynosi: " + cena3);
            } else if (program<49) {
                 cena1= 99*program*0.3;
                 cena2= 99*program;
                 cena3= cena2-cena1;
                System.out.println("Cena wynosi: " + cena3);
            } else if (program>59) {
                 cena1= 99*program*0.4;
                 cena2= 99*program;
                 cena3= cena2-cena1;
                System.out.println("Cena wynosi: " + cena3);
            } else if (program<99) {
                cena1= 99*program*0.4;
                cena2= 99*program;
                 cena3= cena2-cena1;
                System.out.println("Cena wynosi: " + cena3);
            } else if (program>100) {
                 cena1= 99*program*0.5;
                 cena2= 99*program;
                 cena3= cena2-cena1;
                System.out.println("Cena wynosi: " + cena3);
            }

        }
    }
}
