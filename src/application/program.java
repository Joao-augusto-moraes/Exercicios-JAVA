package application;
import java.util.Locale;
import java.util.Scanner;
import entities.triangulo;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        triangulo x, y;
        x = new triangulo();
        y = new triangulo();

        System.out.println("### VAMOS CALCULAR A AREA DE DOIS TRIANGULOS ###");

        System.out.println("### PRIMEIRO TRIANGULO ###");
        System.out.println("DIGITE O VALOR DO LADO A DO PRIMEIRO TRIANGULO:");
        x.a = sc.nextDouble();

        System.out.println("DIGITE O VALOR DO LADO B DO PRIMEIRO TRIANGULO:");
        x.b = sc.nextDouble();

        System.out.println("DIGITE O VALOR DO LADO C DO PRIMEIRO TRIANGULO:");
        x.c = sc.nextDouble();

        System.out.println("### SEGUNDO TRIANGULO ###");
        System.out.println("DIGITE O VALOR DO LADO A DO SEGUNDO TRIANGULO:");
        y.a = sc.nextDouble();

        System.out.println("DIGITE O VALOR DO LADO B DO SEGUNDO TRIANGULO:");
        y.b = sc.nextDouble();

        System.out.println("DIGITE O VALOR DO LADO C DO SEGUNDO TRIANGULO:");
        y.c = sc.nextDouble();

        double areaX = x.calculateArea();
        double areaY = y.calculateArea();
        
        System.out.printf("A AREA DO TRIANGULO X É: %.4f%n", areaX);
        System.out.printf("A AREA DO TRIANGULO Y É: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A AREA DE X É A MAIOR AREA");
        } else {
            System.out.println("A AREA DE Y É A MAIOR AREA");
        }

        sc.close();
    }
}