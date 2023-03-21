public class zad18 {
    public static void main(String[] args) {
        double akcjecena = 600 * 21.77;
        System.out.println("Laczna cena zaplacona za akcje (bez prowizji) " + akcjecena);
        System.out.println("Wysokosc prowizji : 2%");
        double cenapodatek = akcjecena + akcjecena * 0.02;
        System.out.println("Calkowita cena z podatkiem : " + cenapodatek);


    }
}