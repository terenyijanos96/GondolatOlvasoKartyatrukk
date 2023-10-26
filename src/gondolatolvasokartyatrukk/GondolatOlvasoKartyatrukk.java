package gondolatolvasokartyatrukk;

import java.util.Scanner;

public class GondolatOlvasoKartyatrukk {

    static Scanner sc = new Scanner(System.in);
    static final int MERET = 22;
    static String[] pakli = new String[MERET];
    
    public static void main(String[] args) {
        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();
            melyik();
            kever();
        }
        ezVolt();
    }

    private static void feltolt() {
        String[] szinek = {"P", "T", "Z", "M"};
        String[] ertekek = {"Ász", "Kir", "Fel", "X", "IX", "VIII"};

        int db = 1;
        for (int sz = 0;sz < szinek.length; sz++) {
            for (int e = 0;db < MERET && e < ertekek.length; e++) {
                pakli[db++] = szinek[sz] + "_" + ertekek[e];
            }
        }
    }
    
    private static void kirak() {
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-7s", pakli[i]);
            if(i % 3 == 0){
                System.out.println("");
            }
        }
    }

    private static int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = Integer.parseInt(sc.nextLine());
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
    }

    private static int kever(int oszlop) {
        //a választott oszlop középre kerüljön
    }

    private static void ezVolt() {
        System.out.println("A gondolt lap: " + pakli[11]);
    }
    
}
