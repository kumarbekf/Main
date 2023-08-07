import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

try {
Areas areas =
        Areas.valueOf(string.toUpperCase());


    switch (areas) {
        case BISHKEK:
            System.out.println("Burana");
            break;
        case OSH:
            System.out.println("Sulaiman too");
            break;
        case TALAS:
            System.out.println(" gumboz");
            break;
        case BATKEN:
            System.out.println("Oruk");
            break;
        case JALALABAD:
            System.out.println("Janak tokoi");
            break;
        case lSSYKKULl:
            System.out.println("lSSYKKULl");
    }
}catch (IllegalArgumentException e){
    System.out.println("Mындай област жок");
}
    }
}